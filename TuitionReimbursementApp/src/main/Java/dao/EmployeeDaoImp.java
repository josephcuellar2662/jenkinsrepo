package dao;

import reimbursementapp.Employee;
import util.ConnectionFactory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDaoImp implements EmployeeDao {

    public boolean createEmployee(Employee employee) {
        // TODO Auto-generated method stub
        String sql = "INSERT INTO EMPLOYEE (FIRSTNAME, LASTNAME, EMAIL, EMPLOYEE_TYPE_ID) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps =
                    ConnectionFactory.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, employee.getFirstName());
            ps.setString(2, employee.getLastName());
            ps.setString(3, employee.getEmail());
            ps.setInt(4, employee.getType());
            ps.executeQuery();
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public Employee retrieveEmployeeByUsername(String username) {
        // TODO Auto-generated method stub
        Employee employee = new Employee();

        String sql = "SELECT FIRSTNAME, LASTNAME, EMAIL, EMPLOYEE_TYPE_ID, USERNAME, PASSWORD " +
                     "FROM EMPLOYEE WHERE USERNAME = ?";
        try{
            PreparedStatement ps =
                    ConnectionFactory.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                employee.setFirstName(rs.getString("firstname"));
                employee.setLastName(rs.getString("lastname"));
                employee.setEmail(rs.getString("email"));
                employee.setType(rs.getInt("employee_type_id"));
                employee.setUsername(rs.getString("username"));
                employee.setPassword(rs.getString("password"));
                return employee;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int retrieveIdByUsername(String username) {
        String sql = "SELECT EMPLOYEE_ID FROM EMPLOYEE WHERE USERNAME = ?";

        try {
            PreparedStatement ps = ConnectionFactory.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while( rs.next() ) {
                return rs.getInt("employee_id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Employee retrieveEmployeeById(int id) {
        Employee em = new Employee();
        String sql = "SELECT FIRSTNAME, LASTNAME FROM EMPLOYEE WHERE EMPLOYEE_ID = ?";

        try {
            PreparedStatement ps = ConnectionFactory.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while( rs.next() ) {
                em.setFirstName(rs.getString("firstname"));
                em.setLastName(rs.getString("lastname"));
                return em;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
