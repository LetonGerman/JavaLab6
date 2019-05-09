package ru.itmo.exceptions;

public class CatalogLoadException extends Exception {

  public CatalogLoadException() {
    super("Catalog load exception");
  }

  public CatalogLoadException(String message) {
    super(message);
  }
}
