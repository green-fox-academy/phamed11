package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  @Override
  public void sound() {
    System.out.println("Electric Guitar, a " + numberOfStrings + " stringed instrument that goes " + name);
  }

  public ElectricGuitar() {
    super(6, "Twang");
  }

  public ElectricGuitar(int numberOf) {
    super(numberOf, "Twang" );
  }

}
