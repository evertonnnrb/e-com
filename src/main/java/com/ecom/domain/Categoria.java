package com.ecom.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Categoria extends GenericId {
    private String nome;

    @ManyToMany(mappedBy = "categorias")
    @Setter(AccessLevel.NONE)
    private List<Produto> produtos = new ArrayList<>();

}
