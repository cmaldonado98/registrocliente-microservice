package com.servicio.registrocliente.repository;

import com.servicio.registrocliente.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findByClienteId(Long clienteId);

    @Query(value = "SELECT * FROM cliente WHERE cedula = :cedula", nativeQuery = true)
    Cliente findByClienteCedula(String cedula);
}
