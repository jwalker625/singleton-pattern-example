package org.example.singletons;

public enum EnumSingleton {
  INSTANCE;

  // Field for singleton state
  private String configValue = "Default";

  // Methods for singleton functionality
  public String getConfigValue() {
    return configValue;
  }

  public void setConfigValue(String value) {
    this.configValue = value;
  }

  public void showConfiguration() {
    System.out.println("Enum Singleton: Configuration value = " + configValue);
  }
}
