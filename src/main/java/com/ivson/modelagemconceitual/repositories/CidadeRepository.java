package com.ivson.modelagemconceitual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ivson.modelagemconceitual.model.Cidade;

@Repository // nao é necessario
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
