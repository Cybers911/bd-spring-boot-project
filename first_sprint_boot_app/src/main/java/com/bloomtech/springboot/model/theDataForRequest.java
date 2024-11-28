package com.bloomtech.springboot.model;

//This class will hold data being sending through http request

//A POJO is normally used in a Spring Boot application to represent a data transfer object.
//POJO has data, setters, getters, constructors, and equals and hashCode methods, toString() methods,
// overrides equals and hashCode() methods

import java.util.Objects;

public class theDataForRequest {
    String data;// data which is being sent the request
//Constructor to initialize the data:
    public theDataForRequest(String data) {
        this.data = data;
    }//the data variable names is data and its type is String must match JSON attributes

    // we should allways generate a default constructor in POJO in case JAVA neede it
    public theDataForRequest() {
        // nothing to initialize here, we have only one field to initialize
    }


    //getters and setters
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    //generated equals and hashCode methods:

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        theDataForRequest that = (theDataForRequest) o;
        return Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(data);
    }
    //generated toString method:
    @Override
    public String toString() {
        return "theDataForRequest{" +
                "data='" + data + '\'' +
                '}';
    }

}
