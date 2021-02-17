package io.gitbub.juliannapeace.clientes.model.repository;

import io.gitbub.juliannapeace.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico,Integer> {
}
