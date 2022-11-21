package br.com.igor.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.igor.exerciciossb.models.Cliente;

@RestController
@RequestMapping(path = "/Clientes")
public class ClienteController {

    @GetMapping( "/qualquer") // não precisa colocar o path
    public Cliente obterCliente(){
        return new Cliente(25, "pedro", "2556815");
    }
    
}
