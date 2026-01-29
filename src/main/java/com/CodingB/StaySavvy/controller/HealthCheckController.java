package com.CodingB.StaySavvy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HealthCheckController {

    @GetMapping("/")
    public ResponseEntity<Map<String, String>> healthCheckController(){
        // Returning a Map avoids the String casting error
        return ResponseEntity.ok(Map.of("message", "ok"));
    }
}