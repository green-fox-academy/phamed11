package main.java.music;

public abstract class StringedInstrument extends Instrument {
 int numberOfStrings;
 String name;

 public abstract sound();

  public StringedInstrument(int numberOfStrings, String name) {
    this.numberOfStrings = numberOfStrings;
    this.name = name;
  }
}
