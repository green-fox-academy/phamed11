package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    super(4, "Duum-duum-duum");
  }
  public BassGuitar(int numberOf) {
    numberOfStrings = numberOf;
  }
}
