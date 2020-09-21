package com.example.appengine.kotlin.resource

import com.example.appengine.kotlin.application.GreetingService
import com.example.appengine.kotlin.domain.Greeting
import javax.inject.Inject
import javax.inject.Singleton
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.Response

@Path("/hello-resource") //path + /hello = /api/v1/hello
@Singleton
class HelloWorldResource @Inject constructor(private val greetingService: GreetingService) {

    @Produces("application/json")
    @GET
    fun hello(): Response {
        val greeting = greetingService.createNew("Test")
        return Response.status(Response.Status.OK).entity(greeting).build()
    }

}