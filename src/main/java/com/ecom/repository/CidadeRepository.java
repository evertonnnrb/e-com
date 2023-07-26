package com.ecom.repository;

import com.ecom.domain.Categoria;
import com.ecom.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade,Long> {
}
