package dao;

import reimbursementapp.Event;
import util.ConnectionFactory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EventDaoImp implements EventDao {

    public boolean createEvent(Event event) {
        // TODO Auto-generated method stub
        String sql = "INSERT INTO EVENT (DESCRIPTION, EVENT_TYPE_ID) VALUES (?,?)";
        try {
            PreparedStatement ps =
                    ConnectionFactory.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, event.getDescription());
            ps.setInt(2, event.getType());
            ps.executeQuery();
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public Event retrieveEventById(int id) {
        // TODO Auto-generated method stub
        Event event = new Event();
        String sql = "SELECT E.DESCRIPTION, E.EVENT_TYPE_ID FROM EVENT E WHERE E.EVENT_ID = ?";
        try {
            PreparedStatement ps =
                    ConnectionFactory.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                event.setType(rs.getInt("event_type_id"));
                event.setDescription(rs.getString("description"));
                return event;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

}
