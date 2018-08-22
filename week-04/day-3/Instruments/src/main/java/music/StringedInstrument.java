package main.java.music;

public abstract class StringedInstrument extends Instrument {
 int numberOfStrings;

 public abstract void sound();

  public StringedInstrument(int numberOfStrings, String name) {
    super(name);
    this.numberOfStrings = numberOfStrings;
  }

  public void play() {
    sound();
  }
}
