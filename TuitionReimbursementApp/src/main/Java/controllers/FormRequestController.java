package controllers;

import Services.FormRequestService;
import reimbursementapp.RequestForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FormRequestController {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        FormRequestService frs = new FormRequestService();

        String username = request.getParameter("username");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String streetname = request.getParameter("streetname");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        int zip = Integer.parseInt(request.getParameter("zip"));
        String event = request.getParameter("event");
        String gradingFormat = request.getParameter("gradingFormat");
        double price = Double.parseDouble(request.getParameter("price"));
        String date = request.getParameter("date");
        String wrj = request.getParameter("wrj");
        /* ( employee_id,  date,  streetname,  state,  city,  zip, price,  wrj,  gradingFormat,  event,  ad_by_supervisor,  ad_by_head, ad_by_benco) {
         */
        int e_id = frs.getEmployeeId(username);
        RequestForm rf = new RequestForm(e_id, date, streetname, state, city, zip, price, wrj, gradingFormat, event,
                "pending", "pending", "pending");
        boolean status = frs.submitForm(rf);
        System.out.println("Created: " + status);
        if(status){
            response.getWriter().write("{ \"response\" : \"true\" }");
            response.setStatus(200);
            response.setHeader("content-Type","text/plain");
        } else {
            response.getWriter().write("{ \"response\" : \"false\" }");
            response.setStatus(200);
            response.setHeader("content-Type","text/plain");
        }

//        System.out.println("Username: " + username);
//        System.out.println("First name: " + firstname);
//        System.out.println("Last name: " + lastname);
//        System.out.println("Street name: " + streetname);
//        System.out.println("City: " + city);
//        System.out.println("State: " + state);
//        System.out.println("Zip: " + zip);
//        System.out.println("Event: " + event);
//        System.out.println("Grading format: " + gradingFormat);
//        System.out.println("Price: " + price);
//        System.out.println("Date: " + date);
//        System.out.println("Wrj: " + wrj);
    }
}
