package com.ecom.repository;

import com.ecom.domain.Categoria;
import com.ecom.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido,Long> {
}
