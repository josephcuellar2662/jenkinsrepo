package Services;

import dao.RequestFormDao;
import dao.RequestFormDaoImp;

public class SupervisorService {
    RequestFormDao req_dao = new RequestFormDaoImp();

    public boolean updateSupervisorDecision(int id, String value) {
       return req_dao.updateForm(id, value);
    }
}
