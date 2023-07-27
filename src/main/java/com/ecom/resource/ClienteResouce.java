package com.ecom.resource;

import com.ecom.domain.Cliente;
import com.ecom.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteResouce {

    private final ClienteService clienteService;

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getClientePorId(@PathVariable long id) {
        return new ResponseEntity(clienteService.buscarPorId(id), HttpStatus.OK);
    }
}
