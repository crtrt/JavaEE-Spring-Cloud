package com.example.producer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Producer {

    @RequestMapping("/producer/demo")
    public String produce(){
        return "Hello !This is from producer!";
    }
}
