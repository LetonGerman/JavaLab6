package ru.itmo.classes;

import ru.itmo.exceptions.CatalogLoadException;
import ru.itmo.exceptions.ItemAlreadyExistsException;
import ru.itmo.interfaces.CatalogLoader;

public class CatalogStubLoader implements CatalogLoader {

  private ItemCatalog itemCatalog;

  public CatalogStubLoader(ItemCatalog itemCatalog) {
    this.itemCatalog = itemCatalog;
  }

  public CatalogStubLoader() {
    this.itemCatalog = new ItemCatalog();
  }

  @Override
  public boolean load() throws CatalogLoadException {
    Item item1 = new Item("Sony TV", 23000.);
    Item item2 = new Item("Java Book", 1337.);
    Item item3 = new Item("Sony TV", 23000.);

    try {
      itemCatalog.addItem(item1);
      itemCatalog.addItem(item2);
      itemCatalog.addItem(item3);
    } catch (ItemAlreadyExistsException e) {
      e.printStackTrace();
      throw new CatalogLoadException();
    }

    return true;
  }
}
