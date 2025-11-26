package br.com.luvz.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/api/v1/users")
public class UserController {


    @GET
    public String msg(){
        return "Hello World Quarkus";
    }
}

