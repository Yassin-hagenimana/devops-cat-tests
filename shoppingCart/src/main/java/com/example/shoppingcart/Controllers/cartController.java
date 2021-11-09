package com.example.shoppingcart.Controllers;

import com.example.shoppingcart.Models.Item;
import com.example.shoppingcart.Services.cartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class cartController {
private com.example.shoppingcart.Services.cartService cartService;

@DeleteMapping("/{id}")
  public ResponseEntity<?> delete(@PathVariable int id){
    Boolean isDeleted = cartService.deleteFromCart(id);

    return ResponseEntity.ok().build();
  }

//  @GetMapping
//  public List<Item> findAll(){
//    return cartService.findAll();
//  }

//  @GetMapping("/{id}")
//  public Item find(@PathVariable Long id){
//    return cartService.findById(id);
//  }
//
//  @PostMapping
//  public ResponseEntity<?> save(@RequestBody Item item){
//
//    Item savedBeneficiary = cartService.addNewBeneficiary(item);
//
//    URI location  = ServletUriComponentsBuilder
//        .fromCurrentRequest()
//        .path("/{id}")
//        .buildAndExpand(savedBeneficiary.getId())
//        .toUri();
//
//    return ResponseEntity.created(location).build();
//  }
}
