package com.toni.portifolio.repository;


import com.toni.portifolio.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long>{

}
