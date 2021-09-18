package com.example.javawebapplication;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.*;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("api")
public class SummaryService {

    @Inject
private CalculatorService calculatorService;

    @GET
    @Path("addUpNumbers")
    @Produces(MediaType.TEXT_PLAIN)
    public Integer sum(@PathParam int number){

        return calculatorService.sum(number);

    }




    
}
