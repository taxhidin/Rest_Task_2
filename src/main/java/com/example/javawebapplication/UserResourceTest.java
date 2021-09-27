package com.example.javawebapplication;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher;
import org.junit.Test;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
/*

public class UserResourceTest  {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        server.setHandler(getHandlers());
        server.start();
        server.join();
    }

    private static Handler getHandlers() {
        ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);
        handler.addServlet(HttpServletDispatcher.class, "/");
        handler.setInitParameter("javax.ws.rs.Application", RestEasyServices.class.getCanonicalName());
        return handler;
    }



}
*/


//second method

//public class UserResourceTest  {
//    private static final String FULL_PATH = "http://localhost:8080/api/addUpNumbers";
//    @Test
//    public void testListAllUsers() {
//
//        final ResteasyClient client = new ResteasyClientBuilder().build();
//        final ResteasyWebTarget target = client
//                .target(FULL_PATH);
//        String response = target.request().get(String.class);
//        System.out.println(response);
//    }
//
//    @Test
//    public void testGetUser() {
//
//        final ResteasyClient client = new ResteasyClientBuilder().build();
//        ResteasyWebTarget target = client.target(FULL_PATH);
//        Response response = target.request()
//                .post(Entity.entity(new User(1,2,3,4,5,6), "application/json"));
//        System.out.println(response.getStatus());
//        response.close();
//    }
//
//
// }


