package com.example.shoppingcart.Services;

import com.example.shoppingcart.Models.Item;
import com.example.shoppingcart.repository.cartRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class cartMockitoTest {

  @InjectMocks
  cartService cartService;
  @Mock
  cartRepository cartRepository;

  @Test
  public void deleteCart(){
    Item st = new Item(1,1,"sweater",12);
    when(cartRepository.findById(st.getId())).thenReturn(Optional.of(st));
    cartService.deleteFromCart(st.getId());
    verify(cartRepository).deleteById(st.getId());

  }

  @Test
  public  void createCart(){
    when(cartRepository.save(ArgumentMatchers.any(Item.class))).thenReturn(new Item(1,2,"shoes",10);
    assertEquals("shoes",cartService.addingToCart().getProductName());
//        assertEquals("Male",studentService.createStudent("Didier","Male",4).getGender());
  }

  @Test
  public void updateCart(){
    Item st = new Item(6,1,"g",23);
    Item newST = new Item(2,3,"chalk",23);
    given(cartRepository.findById(st.getId())).willReturn(Optional.of(st));

    cartService.updateCart(st.getId(),newST);
    verify(cartRepository).save(newST);
    verify(cartRepository).findById(st.getId());
  }


}
