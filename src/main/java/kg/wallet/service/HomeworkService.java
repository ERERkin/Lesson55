package kg.wallet.service;

import kg.wallet.model.TimeReturn;
import kg.wallet.model.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static java.time.LocalTime.now;

@Path("/time")
public class HomeworkService {
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public TimeReturn timeReturn(){
//        return String.valueOf(new TimeReturn(Timestamp.valueOf(LocalDateTime.now())));
        TimeReturn timeReturn = new TimeReturn();
        System.out.println(timeReturn.getTime());
        return timeReturn;
    }

   /* @GET
    @Path("/{userId}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public User getUserByID(@PathParam("userId") Integer userId){
        User u = new User();
        u.setId(userId);
        return u;
    }*/
}
