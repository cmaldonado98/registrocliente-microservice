package com.servicio.registrocliente.controller;

import com.servicio.registrocliente.entity.Cliente;
import com.servicio.registrocliente.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/clientes")
@Slf4j
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/")
    public Cliente saveCliente(@RequestBody Cliente cliente){
        log.info("Inside saveCliente method of ClienteController");
        return clienteService.saveCliente(cliente);
    }

    @GetMapping("/{id}")
    public Cliente findClienteById(@PathVariable("id") Long clienteId){
        log.info("Inside findClienteById method of ClienteController");
        return clienteService.findClienteById(clienteId);
    }

    @GetMapping("/login/{cedula}")
    public Cliente findClienteByCedula(@PathVariable("cedula") String cedula){
        log.info("Inside findClienteByCedula method of ClienteController");
        return clienteService.findClienteByCedula(cedula);
    }
}
