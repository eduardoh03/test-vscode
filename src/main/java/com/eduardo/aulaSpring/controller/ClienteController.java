package com.eduardo.aulaSpring.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Cliente;
@RestController
public class ClienteController {

    @GetMapping(value = "/clientes")
    public Cliente obtemCliente(){
		  return new Cliente(null, "111.111.111-11", "Fulano de Tal", "fulado@gmail.com", "(86) 99999-8888", false,
              null, null, null, null, null, null, null, null, false);
    }
    @PostMapping(value = "/clientes")
    public String postClientes(){
      return "POST CLIENTES FUNCIONANDO";
    }
    @PutMapping(value = "/clientes")
    public String putClientes(){
      return "PUT CLIENTES FUNCIONANDO";
    }
    @DeleteMapping(value = "/clientes")
    public String deleteClientes(){
      return "DELETE CLIENTES FUNCIONANDO";
    }
}
