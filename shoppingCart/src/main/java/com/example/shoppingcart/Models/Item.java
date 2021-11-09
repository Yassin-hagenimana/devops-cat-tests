package com.example.shoppingcart.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@table(name="items")
public class Item {
  @Id
  @GeneratedValue
  private Integer id;
  int price;
  String productName;
  int quantity;


  public Item() {

  }

  public Item(Integer id, int price, String productName, int quantity) {
    this.id = id;
    this.price = price;
    this.productName = productName;
    this.quantity = quantity;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
