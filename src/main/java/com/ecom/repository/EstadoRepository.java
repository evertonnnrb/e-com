package com.ecom.repository;

import com.ecom.domain.Cidade;
import com.ecom.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<Estado,Long> {
}
