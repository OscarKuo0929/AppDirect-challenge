package com.appdirect.api;

import com.appdirect.result.HealthCheckResult;
import org.springframework.stereotype.Service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by oscarkuo on 9/17/15.
 */

@Path("/")
@Consumes({"application/json", "application/xml"})
@Produces({"application/json", "application/xml"})
@Service("appDirectREST")
public class AppDirectREST {


    @GET
    @Path("/health/check")
    public HealthCheckResult healthCheck()
    {
        HealthCheckResult hr = new HealthCheckResult();
        hr.setStatus("0");

        return hr;
    }

}
