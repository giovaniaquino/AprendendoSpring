package com.example.aprend_spring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
public class HelloController {

    @GetMapping("/hello")
    public String helloMensagem(){
        return "Hello World";
    }

    //PathVariable atribui valor a variavel dentro {}
    @GetMapping("/custom/{message}")
    public String customMessage(@PathVariable String message){
        return message;
    }
}
