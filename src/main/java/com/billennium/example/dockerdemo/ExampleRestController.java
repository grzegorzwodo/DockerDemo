package com.billennium.example.dockerdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ExampleRestController {

    @GetMapping("/test-controller")
    public Status getExampleData() {
        log.info("Wywolano test-contoller!");
        return new Status("Ready");
    }
}
