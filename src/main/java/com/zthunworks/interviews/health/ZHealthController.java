package com.zthunworks.interviews.health;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class ZHealthController {

    private final ZHealthService healthService;

    @Autowired
    public ZHealthController(@NonNull final ZHealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public boolean get() {
        return this.healthService.get();
    }

}
