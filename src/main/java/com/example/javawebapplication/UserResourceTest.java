package com.example.javawebapplication;


import javax.ws.rs.client.Entity;

import javax.ws.rs.core.Response;


import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import org.junit.Test;




@javax.ws.rs.ApplicationPath("/")
public class UserResourceTest  {
    private static final String FULL_PATH = "http://localhost:8080/api/addUpNumbers";
    @Test
    public void testListAllUsers() {

        final ResteasyClient client = new ResteasyClientBuilder().build();
        final ResteasyWebTarget target = client
                .target(FULL_PATH);
        String response = target.request().get(String.class);
        System.out.println(response);
    }

    @Test
    public void testGetUser() {

        final ResteasyClient client = new ResteasyClientBuilder().build();
        final ResteasyWebTarget target = client
                .target(FULL_PATH);
        Response response = target.request().get();
        User user = response.readEntity(User.class);
        System.out.println(user.toString());
        response.close();
    }

    @Test
    public void testCreateUser() {
        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target(FULL_PATH);
        Response response = target.request()
                .post(Entity.entity(new User(1,2,3,4,5,6), "application/json"));
        System.out.println(response.getStatus());
        response.close();
    }























    }
