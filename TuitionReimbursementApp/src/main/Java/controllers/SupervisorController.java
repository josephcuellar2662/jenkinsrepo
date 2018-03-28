package controllers;

import Services.RetrieveAppsService;
import Services.SupervisorService;
import com.fasterxml.jackson.databind.ObjectMapper;
import reimbursementapp.RequestForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class SupervisorController {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        SupervisorService ss = new SupervisorService();

        String id = request.getParameter("id");
        String decision = request.getParameter("decision");
        System.out.println("ID: " + id);
        System.out.println("Decision: " + decision);

        if(ss.updateSupervisorDecision(Integer.parseInt(id), decision)) {
            response.getWriter().write("{ \"response\" : \"true\" }");
            response.setStatus(200);
            response.setHeader("content-Type","text/plain");
        } else {
            response.getWriter().write("{ \"response\" : \"false\" }");
            response.setStatus(200);
            response.setHeader("content-Type","text/plain");
        }

    }
}
