package com.toyota.tme.util.service;

/**
 * Created by SBO0662 on 25/09/2015.
 */

import java.io.IOException;


import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.cxf.rs.security.cors.CrossOriginResourceSharing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author sanjay
 */
/*

@CrossOriginResourceSharing(
        allowAllOrigins = true,
        allowCredentials = true,
        maxAge = 1,
        allowHeaders = {
                "X-custom-1", "X-custom-2"
        },
        exposeHeaders = {
                "X-custom-3", "X-custom-4"
        }
)
*/


//@Path("ping.html")
public class Ping {

    private Logger log = LoggerFactory.getLogger(Ping.class);


    public Ping(){

    }
    /*
     * This is for Ping service
     */
    @GET
    @Path("/ping")
    public Response getPing() {
        System.out.println("Inside GET Request");
        //  Response.status(Status.OK).entity(pingResponse).build();
        return Response.ok().entity("You got your cxf web services working!").type(MediaType.APPLICATION_JSON).build();
        //return Response.status(Status.OK).build();
    }

    @POST
  /*  @CrossOriginResourceSharing(
            allowAllOrigins = true,
            allowCredentials = true,
            exposeHeaders = { "X-custom-3", "X-custom-4" }
    )*/
    @Path("/pingpost")
    public Response getPingPost() {
        System.out.println("Inside POST Request");

        //  Response.status(Status.OK).entity(pingResponse).build();
        return Response.ok().entity("Test Response check for POST CALL").type(MediaType.APPLICATION_JSON).build();
        //return Response.status(Status.OK).build();
    }

}
