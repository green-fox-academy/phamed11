package main.java.music;

public abstract class StringedInstrument extends Instrument {
 int numberOfStrings;
 String name;

 public abstract String sound();

  public StringedInstrument() {

  }

  public StringedInstrument(int numberOfStrings, String name) {
    super(name);
    this.numberOfStrings = numberOfStrings;
  }
}
