package com.bn.exercicio5.services;

import com.bn.exercicio5.models.CategoriaModel;
import com.bn.exercicio5.repositories.CategoriaRepository;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<CategoriaModel> findAll(){
        return categoriaRepository.findAll();
    }

    public CategoriaModel criarCategoria(CategoriaModel categoriaModel){
        return categoriaRepository.save(categoriaModel);
    }

    public void deletarCategoria(Long id){
        categoriaRepository.deleteById(id);
    }

    public CategoriaModel buscarCategoriaPorId(Long id){
        return categoriaRepository.findById(id).get();
    }

    public CategoriaModel atualizarCategoria(Long id, CategoriaModel categoriaModel){
        CategoriaModel newCategoriaModel = categoriaRepository.findById(id).get();
        return categoriaRepository.save(categoriaModel);
    }

}
