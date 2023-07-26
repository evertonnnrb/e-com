package com.ecom.domain.enuns;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int codCliente;
    private String tipoCliente;

    public static TipoCliente toTipoClienteEnun(Integer cod) {
        if (cod == null) {
            return null;
        }
        for (TipoCliente x : TipoCliente.values()) {
            if (cod.equals(x.getCodCliente())) {
                return x;
            }
        }
        throw new IllegalArgumentException("No data corresponding");
    }
}
