package com.ecom;

import com.ecom.domain.Categoria;
import com.ecom.service.CategoriaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EComApplicationTests {

    @Test
    void contextLoads() {
    }


    @Autowired
    private CategoriaService service;

    @Test
    public void cadastrarCategoria() {
        Categoria categoria = new Categoria();
        categoria.setNome("Eletronicos");
        Categoria cat = service.cadastrarCategoria(categoria);
        Assertions.assertNotNull(cat);
    }
}
