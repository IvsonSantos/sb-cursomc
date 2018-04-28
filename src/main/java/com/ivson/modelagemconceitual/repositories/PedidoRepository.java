package com.ivson.modelagemconceitual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ivson.modelagemconceitual.model.Pedido;

@Repository // nao é necessario
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
