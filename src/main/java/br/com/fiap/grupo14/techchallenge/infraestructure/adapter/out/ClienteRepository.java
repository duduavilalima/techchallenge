package br.com.fiap.grupo14.techchallenge.infraestructure.adapter.out;

import br.com.fiap.grupo14.techchallenge.domain.model.Cliente;
import br.com.fiap.grupo14.techchallenge.domain.port.out.ClienteRepositoryPort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long>, ClienteRepositoryPort {


}
