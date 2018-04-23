package com.ivson.modelagemconceitual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivson.modelagemconceitual.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
