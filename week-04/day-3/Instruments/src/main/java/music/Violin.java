package main.java.music;

public class Violin extends StringedInstrument {
  public Violin() {
    super(4, "Screech");
  }

  public Violin(int numberOf) {
    numberOfStrings = numberOf;
  }
}
