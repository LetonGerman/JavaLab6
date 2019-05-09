package ru.itmo.exceptions;

public class NegativeQuantityException extends Exception {

  public NegativeQuantityException() {
    super("Negative quantity");
  }

  public NegativeQuantityException(String message) {
    super(message);
  }
}
