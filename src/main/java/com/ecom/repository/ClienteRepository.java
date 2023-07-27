package com.ecom.repository;

import com.ecom.domain.Categoria;
import com.ecom.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
