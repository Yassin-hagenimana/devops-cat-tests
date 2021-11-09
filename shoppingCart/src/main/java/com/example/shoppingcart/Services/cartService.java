package com.example.shoppingcart.Services;

import com.example.shoppingcart.Models.Item;
import com.example.shoppingcart.Models.shoppingCart;
import com.example.shoppingcart.repository.cartRepository;
import org.springframework.stereotype.Service;


@Service
public class cartService {


  cartRepository cartRepository;

 public Boolean deleteFromCart(int id){
   shoppingCart cart=new shoppingCart();
   cartRepository.deleteById(cart.removeFromCart(id));
   return null;
 }
 public void addingToCart(){
  shoppingCart cart=new shoppingCart();
   cartRepository.save(cart.addToCart(cart));
 }

  public Item updateCart(Integer id, Item student){
    cartRepository.findById(id)
        .orElseThrow(()-> new RuntimeException("Student not found with id"+ id));

    student.setId(id);

    return cartRepository.save(student);

  }
