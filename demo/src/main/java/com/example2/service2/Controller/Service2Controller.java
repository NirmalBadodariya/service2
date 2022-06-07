package com.example2.service2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service2")
public class Service2Controller {

    @RequestMapping("message")
    public String test2(){
        return "This is service2";
    }
}
