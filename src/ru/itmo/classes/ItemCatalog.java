package ru.itmo.classes;

import ru.itmo.exceptions.ItemAlreadyExistsException;

import java.util.ArrayList;
import java.util.List;

public class ItemCatalog {


  List<Item> itemList;

  public ItemCatalog() {
    this.itemList = new ArrayList<Item>();
  }

  public boolean addItem(Item item) throws ItemAlreadyExistsException {
    if (this.itemList.contains(item)) {
      throw new ItemAlreadyExistsException();
    }
    this.itemList.add(item);
    return true;
  }
}
