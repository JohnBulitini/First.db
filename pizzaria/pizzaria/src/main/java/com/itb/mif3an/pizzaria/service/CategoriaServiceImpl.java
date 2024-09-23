package com.itb.mif3an.pizzaria.service;

import com.itb.mif3an.pizzaria.exceptions.BadRequest;
import com.itb.mif3an.pizzaria.model.Categoria;
import com.itb.mif3an.pizzaria.repository.CatetoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    private final CatetoriaRepository categoriaRepository;

    public CategoriaServiceImpl(CatetoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }
    @Override
    public Categoria save(Categoria categoria) {
        if(!categoria.validarCategoria()) {
            throw new BadRequest(categoria.getMensagemErro());
        }
        return categoriaRepository.save(categoria);
    }
}