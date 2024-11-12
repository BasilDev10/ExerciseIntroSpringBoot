package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

    @GetMapping("/Name")
    public String name() {
        return "My name is Basil";
    }
    @GetMapping("/age")
    public int age() {
        return 20;
    }
    @GetMapping("/check/status")
    public String status() {

        return "Everything is Ok";
    }
    @GetMapping("/health")
    public String health(){
        return "Server health is up running";
    }
    @GetMapping("/names")
    public String[] names(){
        return new String[]{"Basil","Mohammed","Abdullah","Rayan","Mousa","Ibrahim"};
    }
}
