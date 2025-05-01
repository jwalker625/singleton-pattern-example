package org.example;

import org.example.singletons.BillPughSingleton;
import org.example.singletons.EagerSingleton;
import org.example.singletons.EnumSingleton;
import org.example.singletons.LazyDoubleCheckedSingleton;

public class Main {
  public static void main(String[] args) {
    // Test eager singleton
    EagerSingleton eager1 = EagerSingleton.getInstance();
    EagerSingleton eager2 = EagerSingleton.getInstance();
    System.out.println("Eager instances same? " + (eager1 == eager2));

    // Test lazy double-checked singleton
    LazyDoubleCheckedSingleton lazy1 = LazyDoubleCheckedSingleton.getInstance();
    LazyDoubleCheckedSingleton lazy2 = LazyDoubleCheckedSingleton.getInstance();
    System.out.println("Lazy instances same? " + (lazy1 == lazy2));

    // Test Bill Pugh singleton
    BillPughSingleton pugh1 = BillPughSingleton.getInstance();
    BillPughSingleton pugh2 = BillPughSingleton.getInstance();
    System.out.println("Bill Pugh instances same? " + (pugh1 == pugh2));

    // Test enum singleton
    EnumSingleton enum1 = EnumSingleton.INSTANCE;
    EnumSingleton enum2 = EnumSingleton.INSTANCE;
    System.out.println("Enum instances same? " + (enum1 == enum2));

    // Modify enum singleton state to demonstrate shared state
    enum1.setConfigValue("Modified Value");
    System.out.println("enum1 value: " + enum1.getConfigValue());
    System.out.println("enum2 value: " + enum2.getConfigValue());
  }
}