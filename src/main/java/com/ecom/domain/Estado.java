package com.ecom.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Estado extends GenericId {

    private String nome;
    private String uf;

    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "estado")
    private List<Cidade> cidades = new ArrayList<>();

    public Estado(String nome, String uf) {
        this.nome = nome;
        this.uf = uf;
    }
}
