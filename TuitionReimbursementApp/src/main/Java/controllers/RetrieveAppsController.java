package controllers;

import Services.RetrieveAppsService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import reimbursementapp.RequestForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class RetrieveAppsController {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        RetrieveAppsService req_service = new RetrieveAppsService();
        ArrayList<RequestForm> list = req_service.retrieveApps();
        ObjectMapper mapper = new ObjectMapper();
        System.out.println("RetrieveAppsController");
        if(list.size() > 0) {
            String user_json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
            response.getWriter().write(user_json);
            response.setStatus(200);
            response.setHeader("content-Type","text/plain");
        } else {
            response.getWriter().write("{ \"response\" : \"zero\" }");
            response.setStatus(200);
            response.setHeader("content-Type","text/plain");
        }
    }
}
