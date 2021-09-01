package com.servicio.registrocliente.service;


import com.servicio.registrocliente.entity.Cliente;
import com.servicio.registrocliente.repository.ClienteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente saveCliente(Cliente cliente) {
        log.info("Inside saveCliente of ClienteService");
        return clienteRepository.save(cliente);
    }

    public Cliente findClienteById(Long clienteId) {
        log.info("Inside saveCliente of ClienteService");
        return clienteRepository.findByClienteId(clienteId);
    }

    public Cliente findClienteByCedula(String cedula) {
        log.info("Inside saveCliente of ClienteService");
        return clienteRepository.findByClienteCedula(cedula);
    }
}