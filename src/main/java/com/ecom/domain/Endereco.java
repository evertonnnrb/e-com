package com.ecom.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Endereco extends GenericId {
    private String lagradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    @OneToMany(mappedBy = "enderecos")
    private Cliente cliente;

    @OneToOne
    private Cidade cidade;
}
