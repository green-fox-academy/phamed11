package main.java.music;

public class BassGuitar extends StringedInstrument {

  @Override
  public void sound() {
    System.out.println("Bass guitar, a " + numberOfStrings + " stringed instrument that goes " + name);
  }

  public BassGuitar() {
    super(4, "Duum-duum-duum");
  }

  public BassGuitar(int numberOf) {
    super(numberOf, "Duum-duum-duum");
  }
}
