package br.com.fiap.grupo14.techchallenge.domain.port.in;

import br.com.fiap.grupo14.techchallenge.domain.model.Cliente;
import org.springframework.data.domain.Page;


public interface ClienteService {

    public Page<Cliente> findAll(Integer page, Integer linesPerPage, String orderBy, String direction);

}
