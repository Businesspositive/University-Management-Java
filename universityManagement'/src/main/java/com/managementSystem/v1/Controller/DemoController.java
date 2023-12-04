package com.managementSystem.v1.Controller;

import com.managementSystem.v1.Service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;
    @PostMapping("/addDemo")
    public Demo postDetails(@RequestBody Demo demo) {
        return demoService.saveDetails(demo);
    }

    @GetMapping("/hi")
    public String hi(){
        return"hi";
    }
}
