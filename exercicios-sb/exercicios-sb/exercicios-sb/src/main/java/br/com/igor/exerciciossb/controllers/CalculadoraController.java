package br.com.igor.exerciciossb.controllers;

import javax.websocket.server.PathParam;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Retry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraController {
    
    @GetMapping(path = "/somar/{num1}/{num2}")
    public int soma(@PathVariable int num1, @PathVariable int num2){
        return num1 + num2; 
    }

    @GetMapping("/subtrair")
    public int sub(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2){
        return num1 - num2;
    }

}
