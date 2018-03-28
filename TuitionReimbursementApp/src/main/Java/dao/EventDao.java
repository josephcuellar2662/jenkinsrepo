package dao;

import reimbursementapp.Event;

public interface EventDao {
    public boolean createEvent(Event event);
    public Event retrieveEventById(int id);
}
