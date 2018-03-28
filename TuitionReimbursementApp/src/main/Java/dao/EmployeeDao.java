package dao;

import reimbursementapp.Employee;

public interface EmployeeDao {
    public boolean createEmployee(Employee employee);
    public Employee retrieveEmployeeByUsername(String username);
    public int retrieveIdByUsername(String username);
    public Employee retrieveEmployeeById(int id);

}