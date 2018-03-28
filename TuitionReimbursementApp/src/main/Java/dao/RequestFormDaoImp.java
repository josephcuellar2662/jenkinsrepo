package dao;

import reimbursementapp.RequestForm;
import util.ConnectionFactory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RequestFormDaoImp implements RequestFormDao {

    public boolean createRequestForm(RequestForm requestForm) {
        // TODO Auto-generated method stub
        String sql = "INSERT INTO FORM_REQUEST (DATE_OF_REQUEST, STREET_NAME, STATE, CITY, ZIP, PRICE, WORK_REL_JUST, "
                + "GRADING_FORMAT, EMPLOYEE_ID, APP_DEN_BENCO, APP_DEN_HEAD, APP_DEN_SUPERVISOR, EVENT_TYPE) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps =
                    ConnectionFactory.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, requestForm.getDate());
            ps.setString(2, requestForm.getStreetname());
            ps.setString(3, requestForm.getState());
            ps.setString(4, requestForm.getCity());
            ps.setInt(5, requestForm.getZip());
            ps.setDouble(6, requestForm.getPrice());
            ps.setString(7, requestForm.getWrj());
            ps.setString(8, requestForm.getGradingFormat());
            ps.setInt(9, requestForm.getEmployee_id());
            ps.setString(10, requestForm.getAd_by_benco());
            ps.setString(11, requestForm.getAd_by_head());
            ps.setString(12, requestForm.getAd_by_supervisor());
            ps.setString(13, requestForm.getEvent());
            ps.executeQuery();
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    public RequestForm retrieveRequestFormById(int id) {
        // TODO Auto-generated method stub
        RequestForm rf = new RequestForm();
        String sql = "SELECT DATE_OF_REQUEST, STREET_NAME, STATE, CITY, ZIP, PRICE, WORK_REL_JUST, "
                + "GRADING_FORMAT, EMPLOYEE_ID, APP_DEN_BENCO, APP_DEN_HEAD, APP_DEN_SUPERVISOR, EVENT_TYPE "
                + "FROM FORM_REQUEST "
                + "WHERE FORM_REQUEST_ID = ?";
        try {
            PreparedStatement ps =
                    ConnectionFactory.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                rf.setDate(rs.getString("date_of_request"));
                rf.setStreetname(rs.getString("street_name"));
                rf.setState(rs.getString("state"));
                rf.setCity(rs.getString("city"));
                rf.setZip(rs.getInt("zip"));
                rf.setPrice(rs.getInt("price"));
                rf.setWrj(rs.getString("work_rel_just"));
                rf.setGradingFormat(rs.getString("grading_format"));
                rf.setEmployee_id(rs.getInt("employee_id"));
                rf.setAd_by_benco(rs.getString("app_den_benco"));
                rf.setAd_by_head(rs.getString("app_den_head"));
                rf.setAd_by_supervisor(rs.getString("app_den_supervisor"));
                rf.setEvent(rs.getString("event_type"));
                return rf;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean deleteRequestFormByEmployeeId(int employee_id) {
        String sql = "DELETE FROM FORM_REQUEST WHERE EMPLOYEE_ID = ?";
        try {
            PreparedStatement ps = ConnectionFactory.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, employee_id);
            ps.executeQuery();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<RequestForm> retrieveAllApplications() {
        ArrayList<RequestForm> list = new ArrayList<>();
        String sql = "SELECT * FROM FORM_REQUEST";
        try {
            PreparedStatement ps = ConnectionFactory.getInstance().getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                RequestForm req = new RequestForm();
                req.setForm_id(rs.getInt("form_request_id"));
                req.setEmployee_id(rs.getInt("employee_id"));
                req.setDate(rs.getString("date_of_request"));
                req.setStreetname(rs.getString("street_name"));
                req.setState(rs.getString("state"));
                req.setCity(rs.getString("city"));
                req.setZip(rs.getInt("zip"));
                req.setPrice(rs.getDouble("price"));
                req.setWrj(rs.getString("work_rel_just"));
                req.setGradingFormat(rs.getString("grading_format"));
                req.setEvent(rs.getString("event_type"));
                req.setAd_by_supervisor(rs.getString("app_den_supervisor"));
                req.setAd_by_head(rs.getString("app_den_head"));
                req.setAd_by_benco(rs.getString("app_den_benco"));
                req.setGrade(rs.getString("grade"));
                list.add(req);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean updateForm(int id, String value) {
        String sql = "UPDATE FORM_REQUEST SET APP_DEN_SUPERVISOR = ? WHERE FORM_REQUEST_ID = ?";

        try  {
            PreparedStatement ps = ConnectionFactory.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, value);
            ps.setInt(2, id);
            ps.executeQuery();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
