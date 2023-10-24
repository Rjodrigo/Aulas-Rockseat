package br.rodrigooliveira.primeiroprojetospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/primeiroController/{id}")
public class PrimeiroController {
    @GetMapping("/primeiroMetodo")
    public String primeiroMetodo(@PathVariable String id) {
        return "O parâmetro é " + id;
    }
    
    @GetMapping ("/MetodoComQueryParams")
    public String metodoComQueryParams(String id) {
        return "O parâmetro com MetodoComQueryParams é " + id;
    }
}
