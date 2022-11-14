package com.vusalmustafayev.tutorials.FirstApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
@GetMapping("/welcome")
public static String welcome(){
    return "Welcome to My Spring Boot Project";
}

}
