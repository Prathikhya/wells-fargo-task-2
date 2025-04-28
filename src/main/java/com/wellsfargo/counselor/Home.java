package com.wellsfargo.counselor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController               // marks this as a controller whose methods return data
public class Home {
    @GetMapping("/")
    public String helloWorld() {
        return "Hello, World! THIS IS ME MYSELF AND PORTFOLIO, WELCOMES YOU TO MY WORLD ✅";
    }
}
