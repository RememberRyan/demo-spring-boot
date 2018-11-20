package sda.ee.springboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ryan Alexander on 20/11/2018.
 */

@RestController
    // This handles what we used to do with XML and JSP servlet mapping
    @RequestMapping (path = "/test")

public class TestController {
        @RequestMapping(method = RequestMethod.GET)
    public String sayHello(){
            return "Hello!";
        }
}
