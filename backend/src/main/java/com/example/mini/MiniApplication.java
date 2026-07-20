package com.example.mini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MiniApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniApplication.class, args);
    }
}

// This is the entire "backend logic" for this mini project.
// One endpoint: GET /api/hello -> returns a message.
@RestController
@CrossOrigin(origins = "https://mini-frontend-qs6v.onrender.com")// allows React (different port) to call this
class HelloController {

    @GetMapping("/api/hello")
    public String sayHello() {
        return "Hello from Spring Boot backend!";
    }
}
