package com.ivson.modelagemconceitual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ivson.modelagemconceitual.model.Pagamento;

@Repository // nao é necessario
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
