package io.gitbub.juliannapeace.clientes;

import io.gitbub.juliannapeace.clientes.model.entity.Cliente;
import io.gitbub.juliannapeace.clientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientesApplication {

    @Bean
    public CommandLineRunner run(@Autowired ClienteRepository clienteRepository){
        return args -> {
            Cliente cliente = Cliente.builder().cpf("01354365321").nome("Julianna Paz").build();
            clienteRepository.save(cliente);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientesApplication.class,args);
    }
}
