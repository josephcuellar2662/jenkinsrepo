package Services;

import dao.EmployeeDao;
import dao.EmployeeDaoImp;
import dao.RequestFormDao;
import dao.RequestFormDaoImp;
import reimbursementapp.RequestForm;

import java.util.ArrayList;

public class RetrieveAppsService {
    RequestFormDao rf = new RequestFormDaoImp();

    public ArrayList<RequestForm> retrieveApps() {
        ArrayList<RequestForm> list;
        list = rf.retrieveAllApplications();
        return list;
    }
}
