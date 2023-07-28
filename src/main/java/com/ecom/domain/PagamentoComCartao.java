package com.ecom.domain;

import com.ecom.domain.enuns.EstadoPagemento;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class PagamentoComCartao extends Pagamento {

    private int numeroParcelas;

    public PagamentoComCartao(EstadoPagemento estadoPagemento, Pedido pedido, int numeroParcelas) {
        super();
        this.numeroParcelas = numeroParcelas;
    }
}
