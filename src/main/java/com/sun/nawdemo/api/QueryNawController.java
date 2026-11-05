package com.sun.nawdemo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@RestController
public class QueryNawController {

    @GetMapping("/api/hello")
    public Map<String, Object> hello(@RequestParam(defaultValue = "I'm nawDemo") String name) {
        return Map.of(

                "message", "Hello, " + name + "! I'm nawDemo",
                "timestamp", Instant.now().toString()
        );
    }
}

