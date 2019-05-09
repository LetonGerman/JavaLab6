package ru.itmo.exceptions;

public class ItemAlreadyExistsException extends Exception {

  public ItemAlreadyExistsException() {
    super("Already in list");
  }

  public ItemAlreadyExistsException(String message) {
    super(message);
  }
}
