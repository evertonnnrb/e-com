package com.ecom.service;

import com.ecom.domain.Categoria;
import com.ecom.repository.CategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public List<Categoria> getAllCategorias() {
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> getCategoriaById(long id) {
        return categoriaRepository.findById(id);
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
        if (getCategoriaById(id).isPresent()) {
            return getCategoriaById(id).get();
        }
        return getCategoriaById(id).orElseThrow();
    }
}
