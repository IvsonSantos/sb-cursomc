package com.ivson.modelagemconceitual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ivson.modelagemconceitual.model.Cliente;

@Repository // nao é necessario
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
