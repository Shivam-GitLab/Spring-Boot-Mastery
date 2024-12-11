package com.HelloSpring.HelloSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Car {
    /*
     * @Autowired private Dog dog;: This is a field injection of a Dog object, which
     * means that the Spring framework will automatically create and inject an
     * instance of Dog into this class.
     * /
     /* 
     * @GetMapping("/ok") public String ok(): This method handles HTTP GET requests
     * to the "/ok" endpoint and returns a string value, which is obtained by
     * calling the fun() method on the injected Dog object.
     */
    @Autowired
    private Dog dog;
     
    @GetMapping("/ok")
    public String ok() {
        return dog.fun();
    }
}