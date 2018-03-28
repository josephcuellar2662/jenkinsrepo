package controllers;

import Services.LoginService;
import com.fasterxml.jackson.databind.ObjectMapper;
import reimbursementapp.Employee;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        LoginService loginService = new LoginService();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("username: " + username);
        System.out.println("password: " + password);

        Employee employee = loginService.validateUser(username, password);
        ObjectMapper mapper = new ObjectMapper();

        if(employee != null){
            String user_json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
            response.getWriter().write(user_json);
            response.setStatus(200);
            response.setHeader("content-Type","text/plain");
        } else {
            response.getWriter().write("{ \"response\" : \"invalid username or password\" }");
            response.setStatus(200);
            response.setHeader("content-Type","text/plain");
        }
    }
}
