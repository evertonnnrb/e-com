package com.ecom.domain;

import com.ecom.domain.enuns.TipoCliente;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Cliente extends GenericId {
    private String nome;
    private String email;
    private String cpfOuCnpj;

    private Integer tipoCliente;

    @Setter(AccessLevel.NONE)
    @ManyToOne
    private List<Endereco> enderecos = new ArrayList<>();

    private Set<String> telefones = new HashSet<>();

    public Cliente(String nome, String email, String cpfOuCnpj, TipoCliente tipoCliente) {
        this.nome = nome;
        this.email = email;
        this.cpfOuCnpj = cpfOuCnpj;
        this.tipoCliente = tipoCliente.getCodCliente();
    }

    public TipoCliente getTipoCliente() {
        return TipoCliente.toTipoClienteEnun(tipoCliente);
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente.getCodCliente();
    }
}
