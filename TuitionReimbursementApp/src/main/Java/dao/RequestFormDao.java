package dao;

import reimbursementapp.RequestForm;

import java.util.ArrayList;

public interface RequestFormDao {
    public boolean createRequestForm(RequestForm requestForm);
    public RequestForm retrieveRequestFormById(int id);
    public boolean deleteRequestFormByEmployeeId(int employee_id);
    public ArrayList<RequestForm> retrieveAllApplications();
    public boolean updateForm(int id, String value);
}
