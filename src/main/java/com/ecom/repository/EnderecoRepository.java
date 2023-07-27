package com.ecom.repository;

import com.ecom.domain.Cliente;
import com.ecom.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco,Long> {
}
