package Services;

import dao.EmployeeDao;
import dao.EmployeeDaoImp;
import dao.RequestFormDao;
import dao.RequestFormDaoImp;
import reimbursementapp.RequestForm;

public class FormRequestService {
    RequestFormDao rf_dao = new RequestFormDaoImp();
    EmployeeDao e_dao = new EmployeeDaoImp();

    public boolean submitForm (RequestForm rf) {
        return rf_dao.createRequestForm(rf);
    }

    public int getEmployeeId(String username) {
        return e_dao.retrieveIdByUsername(username);
    }
}
