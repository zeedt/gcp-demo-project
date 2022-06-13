package com.zeed.gcp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {


    @GetMapping
    public String get() {
        return "Welcome to my world. You will be fairly treated once the deplyment is finally automated on GKE";
    }

}
