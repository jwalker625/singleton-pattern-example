package org.example.singletons;

public class BillPughSingleton {
  private BillPughSingleton() {
    // Initialization code
  }

  // Static inner class - not loaded until getInstance() is called
  private static class SingletonHelper {
    private static final BillPughSingleton INSTANCE = new BillPughSingleton();
  }

  public static BillPughSingleton getInstance() {
    return SingletonHelper.INSTANCE;
  }

  public void showConfiguration() {
    System.out.println("Bill Pugh Singleton: Configuration shown");
  }
}
