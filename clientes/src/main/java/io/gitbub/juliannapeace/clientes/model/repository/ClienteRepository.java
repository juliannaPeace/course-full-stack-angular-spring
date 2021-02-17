package io.gitbub.juliannapeace.clientes.model.repository;

import io.gitbub.juliannapeace.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}
