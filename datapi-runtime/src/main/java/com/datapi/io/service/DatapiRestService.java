package com.datapi.io.service;

import com.datapi.io.bean.Result;
import com.datapi.io.repository.DataPiRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/datapi")
public class DatapiRestService {

    @Inject
    private DataPiRepository dataPiRepository;

    @Path("/testRestService")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response testRestService() {
        return Response.ok(new Result("success")).build();
    }

    @Path("/testRepository")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response testRepositoryService() {
        return Response.ok(new Result(dataPiRepository.testRepository())).build();
    }

}
