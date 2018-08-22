package main.java.music;

public class Violin extends StringedInstrument {
  @Override
  public void sound() {
    System.out.println("Violin, a " + numberOfStrings + " stringed instrument that goes " + name);
  }

  public Violin() {
    super(4, "Screech");
  }

  public Violin(int numberOf) {
    super(numberOf, "Screech");
  }
}
