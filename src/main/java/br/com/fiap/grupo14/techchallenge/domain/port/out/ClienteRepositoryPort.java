package br.com.fiap.grupo14.techchallenge.domain.port.out;

import br.com.fiap.grupo14.techchallenge.domain.model.Cliente;

public interface ClienteRepositoryPort {

    Cliente criarCliente(Cliente cliente);
    
}
