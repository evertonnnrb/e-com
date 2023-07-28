package com.ecom.domain;

import com.ecom.domain.enuns.EstadoPagemento;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pagamento {

    @Id
    private Long id;

    private Integer estadoPagemento;

    @OneToOne
    @JoinColumn(name = "pedido_id")
    @MapsId
    private Pedido pedido;

    public Pagamento(Long id, EstadoPagemento estadoPagemento, Pedido pedido) {
        this.id = id;
        this.estadoPagemento = estadoPagemento.getCodEstadoPagemento();
        this.pedido = pedido;
    }

    public void setEstadoPagemento(EstadoPagemento estadoPagemento) {
        this.estadoPagemento = estadoPagemento.getCodEstadoPagemento();
    }

    public EstadoPagemento getEstado() {
        return EstadoPagemento.createEstadoPagemento(estadoPagemento);
    }
}
