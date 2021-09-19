package com.example.javawebapplication;

import javax.inject.Inject;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.ws.rs.Path;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ClientHttpEngine;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.junit.Test;

import java.security.KeyStore;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
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
