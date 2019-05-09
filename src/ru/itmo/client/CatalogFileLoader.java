package ru.itmo.client;

import ru.itmo.classes.Item;
import ru.itmo.classes.ItemCatalog;
import ru.itmo.exceptions.CatalogLoadException;
import ru.itmo.exceptions.ItemAlreadyExistsException;
import ru.itmo.interfaces.CatalogLoader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CatalogFileLoader implements CatalogLoader {

  private ItemCatalog itemCatalog;
  private String fileName;

  public CatalogFileLoader(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public boolean load() throws CatalogLoadException {

    File f = new File(fileName);
    FileInputStream fis;
    String line;
    try {
      fis = new FileInputStream(f);
      Scanner s = new Scanner(fis);
      while (s.hasNextLine()) {
        line = s.nextLine();
        if (line.length() == 0) {
          break;
        }
        String[] item_fld = line.split(";");
        String name = item_fld[0];
        float price = Float.parseFloat(item_fld[1]);
        Item item = new Item(name, (double) price);
        itemCatalog.addItem(item);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      throw new CatalogLoadException(e.getMessage());
    } catch (ItemAlreadyExistsException e) {
      e.printStackTrace();
      throw new CatalogLoadException(e.getMessage());
    }

    return false;
  }


}

