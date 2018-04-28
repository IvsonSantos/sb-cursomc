package com.ivson.modelagemconceitual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ivson.modelagemconceitual.model.ItemPedido;

@Repository // nao é necessario
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {

}
