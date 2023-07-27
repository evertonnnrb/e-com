package com.ecom.service;

import com.ecom.domain.Cliente;
import com.ecom.exceptions.ObjectNotFound;
import com.ecom.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public Cliente buscarPorId(long id){
        return clienteRepository.findById(id).orElseThrow(()-> new ObjectNotFound("No data found"));
    }
}
