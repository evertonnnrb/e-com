package com.ecom.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Cidade extends GenericId{
    private String nome;
    private String sigla;

    @ManyToOne
    @JoinColumn(name = "estado_id")
    private Estado estado;
}
