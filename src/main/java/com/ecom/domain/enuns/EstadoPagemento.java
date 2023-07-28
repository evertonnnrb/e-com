package com.ecom.domain.enuns;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum EstadoPagemento {
    PENDENTE(1, "Pendente"),
    QUITADO(2, "Quitado"),

    CANCELADO(3, "Cancelado");

    private int codEstadoPagemento;

    private String estadoPagementoStr;

    public static EstadoPagemento createEstadoPagemento(Integer cod) {
        if (cod == null) {
            return null;
        }
        for (EstadoPagemento estadoPagemento : EstadoPagemento.values()) {
            if (cod.equals(estadoPagemento.codEstadoPagemento)) {
                return estadoPagemento;
            }
        }
        throw new IllegalArgumentException("No data found");
    }
}
