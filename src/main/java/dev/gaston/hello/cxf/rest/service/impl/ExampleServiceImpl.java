package dev.gaston.hello.cxf.rest.service.impl;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import dev.gaston.hello.cxf.rest.model.HelloModel;
import dev.gaston.hello.cxf.rest.service.ExampleService;

public class ExampleServiceImpl implements ExampleService {

    private HelloModel helloModel;

    public Response get() {
        ResponseBuilder response = Response.ok(getHelloModel());
        return response.build();
    }

    public HelloModel getHelloModel() {
        return helloModel;
    }

    public void setHelloModel(HelloModel helloModel) {
        this.helloModel = helloModel;
    }
}
