package com.ivson.modelagemconceitual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ivson.modelagemconceitual.model.Estado;

@Repository // nao é necessario
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
