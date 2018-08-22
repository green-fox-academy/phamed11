package main.java.music;

public abstract class Instrument {
  protected String name;

  public Instrument(String name) {
    this.name = name;
  }

  public Instrument() {
  }

  public String play() {
    String result = instrument.name;
    return result;
  }
}
