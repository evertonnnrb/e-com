package com.ecom.service;

import com.ecom.domain.Categoria;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@DisplayName("teste categoria")
@Log4j2
public class CategoriaServiceTest {

    @Autowired
    private CategoriaService service;

    @Test
    public void cadastrarCategoria() {
        Categoria categoria = new Categoria();
        categoria.setName("Eletronicos");
        Categoria cat = service.cadastrarCategoria(categoria);
        Assertions.assertNotNull(cat);
    }

    @Test
    public void acharCategoria() {
        Categoria categoria = service.getCategoriaById(3L).get();
        Assert.assertNull(categoria);
    }

}