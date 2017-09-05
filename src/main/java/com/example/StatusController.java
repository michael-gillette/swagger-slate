package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class StatusController {

    @GetMapping("/v1/status")
    public Map<String, Object> getStatus() {
        return Collections.<String, Object>singletonMap("status", "ok");
    }

}
