package com.academify.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teste")
public class TesteResource {

    @GetMapping("/ola")
    public String olaMundo() {
        return "Olá mundo";
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

}
