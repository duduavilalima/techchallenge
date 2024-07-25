package br.com.fiap.grupo14.techchallenge.infraestructure.adapter.in;

import br.com.fiap.grupo14.techchallenge.domain.model.Cliente;
import br.com.fiap.grupo14.techchallenge.domain.port.in.ClienteService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    private static final String LINHAS_POR_PAGINA = "15";

    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<Page<Cliente>> findAll(
            @RequestParam(value="page", defaultValue = "0") Integer page,
            @RequestParam(value="linesPerPage", defaultValue = LINHAS_POR_PAGINA) Integer linesPerPage,
            @RequestParam(value="orderBy", defaultValue = "id") String orderBy,
            @RequestParam(value="direction", defaultValue = "ASC") String direction
    ) {
        return ResponseEntity.ok().body(this.clienteService.findAll(page, linesPerPage, orderBy, direction));
    }
}
