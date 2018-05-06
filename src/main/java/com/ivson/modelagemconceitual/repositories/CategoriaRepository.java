package com.ivson.modelagemconceitual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ivson.modelagemconceitual.model.Categoria;

@Repository // nao é necessario
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}