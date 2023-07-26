package com.ecom.service;

import com.ecom.domain.Categoria;
import com.ecom.exceptions.ObjectNotFound;
import com.ecom.repository.CategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public List<Categoria> getAllCategorias() {
        return categoriaRepository.findAll();
    }

    public Categoria getCategoriaById(long id) {
        return validateCategoria(id);
    }

    public Categoria cadastrarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Categoria atualizarcategoria(long id) {
        Categoria categoria = validateCategoria(id);
        return cadastrarCategoria(categoria);
    }

    public void deletarCategoria(long id) {
        Categoria categoria = validateCategoria(id);
        categoriaRepository.delete(categoria);
    }

    private Categoria validateCategoria(long id) {
        return categoriaRepository.findById(id).orElseThrow(() -> new ObjectNotFound(
                "No value result", Categoria.class.getName()));
    }
}
