package dev.gaston.hello.cxf.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public interface ExampleService {

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get();

}
