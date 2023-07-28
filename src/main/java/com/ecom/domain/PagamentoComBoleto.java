package com.ecom.domain;

import com.ecom.domain.enuns.EstadoPagemento;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class PagamentoComBoleto extends Pagamento {
    private Date dataVencimento;
    private Date dataPagemento;

    public PagamentoComBoleto(EstadoPagemento estadoPagemento, Pedido pedido, Date dataVencimento, Date dataPagemento) {
        super();
        this.dataVencimento = dataVencimento;
        this.dataPagemento = dataPagemento;
    }
}
