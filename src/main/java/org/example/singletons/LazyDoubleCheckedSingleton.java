package org.example.singletons;

public class LazyDoubleCheckedSingleton {
  // volatile keyword ensures visibility across threads
  private static volatile LazyDoubleCheckedSingleton instance;

  private LazyDoubleCheckedSingleton() {
    // Initialization code
  }

  public static LazyDoubleCheckedSingleton getInstance() {
    // First check (not synchronized)
    if (instance == null) {
      // Synchronize only when instance might be null
      synchronized (LazyDoubleCheckedSingleton.class) {
        // Second check (synchronized)
        if (instance == null) {
          instance = new LazyDoubleCheckedSingleton();
        }
      }
    }
    return instance;
  }

  public void showConfiguration() {
    System.out.println("Lazy Double-Checked Singleton: Configuration shown");
  }
}
