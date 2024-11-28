package com.bloomtech.springboot.controller;
//This class will hold controllers for the server side API

import com.bloomtech.springboot.model.theDataForRequest;
import org.springframework.web.bind.annotation.*;

//Data may be  send as a HTTP request body,
//GET and DELETE requests can be handled with URL QUERY parameter (?key=value) with @RequestParam annotation
//PUT and POST requests can be handled with URL BODY (JSON) request body with @RequestBody annotation
//http request has json format where the server translate from/to objects from/to JAVA objects

@RestController //There are REST controllers Methods in this class
public class myControllers {

    // Define a method to Handle http GET request for the root URL path "/"
 /*   @GetMapping(value = "/")
    public String rootPathMethod() {//tHE NAME of the method is rootPathMethod DOESNT MATTER THE NAME
        System.out.println("Received GET request at root URL path '/'");
        return "Root Path Request Received";
        //return new ResponseEntity<>("Hello, World!", HttpStatus.OK); // Return a simple string response
    }*/
    //Define a Method to Handle http GET request for the "/api/greetings" URL path
    @GetMapping(value = "/startreck")
    public String greetingsPathMethod() {
        System.out.println("Controller method for GET with '/Strarteck' was RUN");
        //tHE NAME of the method is greetingsPathMethod DOESNT MATTER THE NAME
        return "Star Rek Path Request Received";
    }

    @GetMapping(value = "/startreck/Spock")
    public String greetingsPathMethod2() {
        System.out.println("Controller method for GET with '/Strarteck/Spock' was RUN");
        //tHE NAME of the method is greetingsPathMethod DOESNT MATTER THE NAME
        return "Star Rek Path Request Received with multiple path /startreck/Spock";
    }

  /*  @PostMapping(value = "/")
    public String wilberPost() {
        System.out.println("Controller method for POST with '/' was RUN");
        //tHE NAME of the method is greetingsPathMethod DOESNT MATTER THE NAME
        return "Mister ED Wilber POST Request Received";
    }*/


    //Define a method to Handle http GET request with a request parameter
    //with query parameter "character=whoTheyAre
    //to access data in query parameter use @RequestParam annotation
    //The value of "character" is the name of the parameter in the URL query string
    //@RequestParam data type name-of-query-string
    //At the Postman query is like this: /startreckWithRequestParam?character=WhoTheyAre
    //In this case the value of "whoTheyAre" will be available in the variable whoTheyAre
    //the result at the postman will say "Star Rek Path Request with Parameter value: WhoTheyAre"
    //Star Rek Path Request with Parameter value: Edu

    @GetMapping(value = "/startreckWithRequestParam")
    public String withRequestParameter(@RequestParam String whoTheyAre) {
        System.out.println("Controller method for GET with '/StrartreckWithRequestParam' was RUN");
        //tHE NAME of the method is greetingsPathMethod DOESNT MATTER THE NAME
        return "Star Rek Path Request with Parameter value: " + whoTheyAre;
    }

    //define a method to Handle http POST request with a request parameter
    //@RequestBody annotation will be used to get the data from request body
    //RequestBody allows access to the data in the request body
    //In the following example theDataForRequest class is assumed to have a constructor with a String parameter
// the data is comming rom the model/class theDataForRequest class method getData()

    @PostMapping(value = "/")
    public String Post2(@RequestBody theDataForRequest dataPassesInn) {
        System.out.println("Controller method for POST with '/' was RUN");
        System.out.println("Data received: " + dataPassesInn.getData());

        return "Mister ED Wilber POST Request Received";
    }

}


