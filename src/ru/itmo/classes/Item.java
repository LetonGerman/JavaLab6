package ru.itmo.classes;

import java.util.Objects;

public class Item {

  private String name;
  private Double price;

  public Item(String name, Double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Item)) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(name, item.name) &&
        Objects.equals(price, item.price);
  }

  @Override
  public int hashCode() {

    return Objects.hash(name, price);
  }

  public void setPrice(Double price) {
    this.price = price;
  }
}
