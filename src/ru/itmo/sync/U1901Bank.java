package ru.itmo.sync;

public class U1901Bank {

  int intTo;
  int intFrom = 220;

  public synchronized void calc(int intTransaction, long lngTimeout) {
    System.out.println("Before " + intTo + " " + intFrom + " " + Thread.currentThread().getName());
    this.intFrom = intFrom - intTransaction;
    try {
      Thread.currentThread().sleep(lngTimeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out
        .println("In the middle " + intTo + " " + intFrom + " " + Thread.currentThread().getName());
    this.intTo += intTransaction;
    System.out.println("After " + intTo + " " + intFrom + " " + Thread.currentThread().getName());

  }

}
