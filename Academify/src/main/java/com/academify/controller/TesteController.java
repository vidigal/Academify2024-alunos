package com.academify.controller;

import com.academify.model.entity.Teste;
import com.academify.model.repository.TesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/teste")
public class TesteController {

    @Autowired
    private TesteRepository testeRepository;

    @GetMapping("/ola")
    public String olaMundo() {
        return "Olá mundo";
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/list")
    public List<Teste> list() {
        return testeRepository.findAll();
    }
    
}
