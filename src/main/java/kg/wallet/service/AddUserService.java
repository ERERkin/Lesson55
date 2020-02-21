package kg.wallet.service;

import kg.wallet.dao.UserDao;
import kg.wallet.model.Check;
import kg.wallet.model.User;
import lombok.SneakyThrows;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/addUser")
public class AddUserService {
    @SneakyThrows
    @POST
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Check addUser(User user){
        UserDao userDao = new UserDao();
        boolean b = userDao.addUser(user);
        return b ? new Check("temporalkey"): new Check("fail");
    }
}
