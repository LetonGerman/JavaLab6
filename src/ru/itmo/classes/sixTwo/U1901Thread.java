package ru.itmo.classes.sixTwo;

import ru.itmo.sync.U1901Bank;

public class U1901Thread extends Thread {

  U1901Bank bankWork;
  int intTrans;
  long lngSleep;

  public U1901Thread(U1901Bank bankWork, int intTrans, long lngSleep) {
    this.bankWork = bankWork;
    this.intTrans = intTrans;
    this.lngSleep = lngSleep;
  }

  @Override
  public void run() {
    //
    bankWork.calc(intTrans, lngSleep);
    System.out.println(Thread.currentThread().getName());
  }
}
