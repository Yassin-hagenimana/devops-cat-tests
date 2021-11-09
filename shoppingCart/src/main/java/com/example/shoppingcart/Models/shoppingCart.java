package com.example.shoppingcart.Models;

import java.util.ArrayList;
import java.util.ListIterator;

public class shoppingCart {
  ArrayList<Item> item;
  int totalAmount;
  String discount;

  public shoppingCart(ArrayList<Item> item, int totalAmount, String discount) {
    this.item = item;
    this.totalAmount = totalAmount;
    this.discount = discount;
  }

  public shoppingCart() {

  }

  public ArrayList<Item> getItem() {
    return item;
  }

  public void setItem(ArrayList<Item> item) {
    this.item = item;
  }

  public int getTotalAmount() {
    ListIterator<Item> iterator2 = item.listIterator();
    this.totalAmount = 0;
    while(iterator2.hasNext()) {
      Item item3 = iterator2.next();
      this.totalAmount = this.totalAmount + (item3.getPrice() * item3.getQuantity());
    }
    return this.totalAmount;

  }
  public void addToCart(Item item) {
    this.item.add(item);
  }


  public int removeFromCart(Item id) {
    ListIterator<Item> iterator1 = item.listIterator();
    while(iterator1.hasNext()) {
      Item item2 = iterator1.next();
      if (item2.getProductName().equals(id.getProductName())) {
        this.item.add(id);
        break;
      }
    }
    return 0;
  }

}
