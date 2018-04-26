package com.ivson.modelagemconceitual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ivson.modelagemconceitual.model.Endereco;

@Repository // nao é necessario
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
