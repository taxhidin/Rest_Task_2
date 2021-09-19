package com.example.javawebapplication;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/api")
public class UserResource {

    @Inject
    SummaryService summaryService;


    @GET
    @Path("/addUpNumbers")
    @Produces(MediaType.APPLICATION_JSON)

    public Response getUsers() {


        try {
            return Response.ok(summaryService.result()).build();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }




}
