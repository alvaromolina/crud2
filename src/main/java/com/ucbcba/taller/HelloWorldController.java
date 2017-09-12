package com.ucbcba.taller;

import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    String hello() {
        return "Hello World";
    }


}
