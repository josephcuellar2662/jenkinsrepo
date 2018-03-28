package Services;


import dao.EmployeeDao;
import dao.EmployeeDaoImp;
import reimbursementapp.Employee;

public class LoginService {
    EmployeeDao e_dao = new EmployeeDaoImp();

    public Employee validateUser(String username, String password){
        Employee employee = e_dao.retrieveEmployeeByUsername(username);
        if(employee != null && employee.getPassword().equals(password)){
            return employee;
        }
        return null;
    }
}
