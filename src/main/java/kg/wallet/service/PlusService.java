package kg.wallet.service;

import kg.wallet.model.PlusAandB;
import kg.wallet.model.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/plus")
public class PlusService {
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<User> getAllUsers_Json(){
        return new ArrayList<>();
    }

    @GET
    @Path("/{a}/{b}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public PlusAandB getUserByID(@PathParam("a") Integer a, @PathParam("b") Integer b){
        PlusAandB plusAandB = new PlusAandB(a + b);
        System.out.println(plusAandB.getSum());
        return plusAandB;
    }
}
