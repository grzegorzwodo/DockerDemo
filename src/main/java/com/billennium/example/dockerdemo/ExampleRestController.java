package com.billennium.example.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleRestController {

    @GetMapping("/test-controller")
    public Status getExampleData() {
        return new Status("Ready");
    }
}
