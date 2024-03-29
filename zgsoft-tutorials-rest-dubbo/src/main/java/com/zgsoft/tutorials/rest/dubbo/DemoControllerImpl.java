package com.zgsoft.tutorials.rest.dubbo;

//import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.config.annotation.Service;
import com.zgsoft.tutorials.rest.api.DemoController;

@Path("demo")
@Consumes({MediaType.APPLICATION_JSON})
//@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Service(version="1.0.0")
public class DemoControllerImpl implements DemoController{

	@GET
    @Path("")
	public String sayHello(@PathParam("name") String name) {
		return "Hello " + name;
	}

}
