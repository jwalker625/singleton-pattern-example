package org.example.singletons;

public class EagerSingleton {
  // Instance created when class is loaded
  private static final EagerSingleton INSTANCE = new EagerSingleton();

  // Private constructor prevents instantiation from other classes
  private EagerSingleton() {
    // Initialization code (if needed)
  }

  public static EagerSingleton getInstance() {
    return INSTANCE;
  }

  // Method representing singleton functionality
  public void showConfiguration() {
    System.out.println("Eager Singleton: Configuration shown");
  }
}
