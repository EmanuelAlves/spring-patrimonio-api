package com.emanuel.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emanuel.patrimonio.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
