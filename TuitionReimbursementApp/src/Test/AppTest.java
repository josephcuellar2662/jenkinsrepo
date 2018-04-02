
import dao.*;
import junit.framework.TestCase;
import reimbursementapp.Employee;
import reimbursementapp.Event;
import reimbursementapp.RequestForm;

import java.util.ArrayList;

public class AppTest extends TestCase {
	EmployeeDao e_dao = new EmployeeDaoImp();
	EventDao event_dao = new EventDaoImp();
	RequestFormDao rf_dao = new RequestFormDaoImp();
	/* ------------------------ TEST CLASSES --------------------------*/

// 	// TEST EMPLOYEE
// 	public void testEmployeeFirstName(){
// 		Employee employee = new Employee("Joseph","Cuellar","jcuellar@me.com", 4, "jecuellar", "1234");
// 		assertEquals("Joseph", employee.getFirstName());
// 	}
// 	public void testEmployeeLastName(){
// 		Employee employee = new Employee("Joseph","Cuellar","jcuellar@me.com", 4,"jecuellar", "1234");
// 		assertEquals("Cuellar", employee.getLastName());
// 	}	
// 	public void testEmployeeEmail(){
// 		Employee employee = new Employee("Joseph","Cuellar", "jcuellar@me.com", 4, "jecuellar", "1234");
// 		assertEquals("jcuellar@me.com", employee.getEmail());
// 	}
// 	public void testEmployeeType(){
// 		Employee employee = new Employee("Joseph","Cuellar", "jcuellar@me.com", 4, "jecuellar", "1234");
// 		assertEquals(4, employee.getType());
// 	}
// 	public void testEmployeeUsername(){
//         Employee employee = new Employee("Joseph","Cuellar", "jcuellar@me.com", 4, "jecuellar", "1234");
//         assertEquals("jecuellar", employee.getUsername());
//     }
//     public void testEmployeePassword(){
//         Employee employee = new Employee("Joseph","Cuellar", "jcuellar@me.com", 4, "jecuellar", "1234");
//         assertEquals("1234", employee.getPassword());
//     }
	
// 	//TEST EVENT
// 	public void testEventType(){
// 		Event event = new Event(1,"Training for aws certification");
// 		assertEquals(1, event.getType());
// 	}
// 	public void testEventDescription(){
// 		Event event = new Event(1,"Training for aws certification");
// 		assertEquals("Training for aws certification", event.getDescription());
// 	}
	
// 	//TEST REQUEST FORM
// 	public void testRequestFormEmployee(){
// 		/* public RequestForm(employee_id, date, streetname, state, city, zip, price, wrj, gradingFormat, event, ad_by_supervisor, ad_by_head, ad_by_benco */
// 		RequestForm reqForm = new RequestForm(9, "02-FEB-18", "11730 Plaza America Dr #205", "VA", "Reston", 20190, 800.0,
// 				"this is work related", "letter grade","Certification", "approved", "approved", "approved");
// 		assertEquals(9, reqForm.getEmployee_id());
// 	}
// 	public void testRequestFormDate(){
// 		Event event = new Event(1,"Training for aws certification");
// 		RequestForm reqForm = new RequestForm(9, "02-FEB-18", "11730 Plaza America Dr #205", "VA", "Reston", 20190, 800.0,
// 				"this is work related", "letter grade","Certification", "approved", "approved", "approved");
// 		assertEquals("02-FEB-18", reqForm.getDate());
// 	}
// 	public void testRequestFormStreetName(){
// 		Event event = new Event(1,"Training for aws certification");
// 		RequestForm reqForm = new RequestForm(9, "02-FEB-18", "11730 Plaza America Dr #205", "VA", "Reston", 20190, 800.0,
// 				"this is work related", "letter grade","Certification", "approved", "approved", "approved");
// 		assertEquals("11730 Plaza America Dr #205", reqForm.getStreetname());
// 	}
// 	public void testRequestFormState(){
// 		RequestForm reqForm = new RequestForm(9, "02-FEB-18", "11730 Plaza America Dr #205", "VA", "Reston", 20190, 800.0,
// 				"this is work related", "letter grade","Certification", "approved", "approved", "approved");
// 		assertEquals("VA", reqForm.getState());
// 	}
// 	public void testRequestFormZip(){
// 		RequestForm reqForm = new RequestForm(9, "02-FEB-18", "11730 Plaza America Dr #205", "VA", "Reston", 20190, 800.0,
// 				"this is work related", "letter grade","Certification", "approved", "approved", "approved");
// 		assertEquals(20190, reqForm.getZip());
// 	}
// 	public void testRequestFormPrice(){
// 		RequestForm reqForm = new RequestForm(9, "02-FEB-18", "11730 Plaza America Dr #205", "VA", "Reston", 20190, 800.0,
// 				"this is work related", "letter grade","Certification", "approved", "approved", "approved");
// 		assertEquals(800.0, reqForm.getPrice());
// 	}
// 	public void testRequestFormWorkRelatedJustification(){
// 		RequestForm reqForm = new RequestForm(9, "02-FEB-18", "11730 Plaza America Dr #205", "VA", "Reston", 20190, 800.0,
// 				"this is work related", "letter grade","Certification", "approved", "approved", "approved");
// 		assertEquals("training for aws cert", reqForm.getWrj());
// 	}
	
	/* ------------------------ TEST DAO --------------------------*/
	//TEST EMPLOYEE DAO
// 	public void testEmployeeDaoRetrieveByUsername(){
// 		Employee employee = e_dao.retrieveEmployeeByUsername("benco");
//         System.out.println(employee);
// 		assertEquals("Ben",employee.getFirstName());	
// 	}
// 	public void testEmployeeDaoRetrieveIdByUsername() {
// 		int id = e_dao.retrieveIdByUsername("benco");
// 		assertEquals(5, id);
// 	}

	
	//TEST EVENT DAO
// 	public void testEventDaoCreate(){
// 		Event event = new Event(1,"Training for aws certification");
// 		assertTrue(event_dao.createEvent(event));
// 	}
	
// 	public void testEventDaoRetrieve(){
// 		Event event = event_dao.retrieveEventById(1);
// 		assertEquals("Training for aws certification", event.getDescription());
// 	}
	
	//TEST REQUEST FORM DAO
// 	public void testRequestFormDaoCreate() {
// 		RequestForm reqForm = new RequestForm(9, "02-FEB-18", "11730 Plaza America Dr #205", "VA", "Reston", 20190, 800.0,
// 				"this is work related", "letter grade","Certification", "approved", "approved", "approved");
// 		assertEquals(true, rf_dao.createRequestForm(reqForm));
// 		assertEquals(true, rf_dao.deleteRequestFormByEmployeeId(9));
// 	}
// 	public void testRequestFormDaoRetrieveAllApps() {
// 		ArrayList<RequestForm> list = new ArrayList<>();
// 		list = rf_dao.retrieveAllApplications();
// 		for(int i=0; i< list.size(); i++) {
// 			System.out.println(list.get(i));
// 		}
// 		assertEquals(1, 1);
// 	}
// 	public void testRequestFormDaoUpdateForm() {
// 		assertEquals(true, rf_dao.updateForm(43,"approved"));
// 	}
// 	public void testRequestFormDaoRetrieveById() {
// 		RequestForm form = rf.retrieveRequestFormById(1);
// 		assertEquals("VA", form.getState());
// 	}
	
}
