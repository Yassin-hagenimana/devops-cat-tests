package com.example.shoppingcart.repository;

import com.example.shoppingcart.Models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cartRepository extends JpaRepository<Item,Integer> {

}
