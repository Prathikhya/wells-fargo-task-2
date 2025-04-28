package com.wellsfargo.counselor.entity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController               // marks this as a controller whose methods return data
public class Home {

    @GetMapping("/")         // maps HTTP GET “/” to this method
    public String home() {
        return "API is running!";
    }
}
