package com.eduardo.testvscode.controller;

import org.springframework.web.bind.annotation.GetMapping;

import model.Cliente;

public class ClienteController {
@GetMapping(value = "/clientes")
    public Cliente obterCliente(){
		return new Cliente("111.111.111-11","Fulano de Tal","fulado@gmail.com","(86) 99999-8888");
    }


}
