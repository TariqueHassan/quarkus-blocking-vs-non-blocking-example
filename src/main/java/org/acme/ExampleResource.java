package org.acme;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/hello")
public class ExampleResource {
    @Inject
    Repo repo;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws IOException {
        repo.handleBlocking();
        return Thread.currentThread().getName();
    }
}