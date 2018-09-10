public class Fox {
  private String name;
  private String type;

  @Override
  public String toString() {
    return "Fox{" +
        "name='" + name + '\'' +
        ", type='" + type + '\'' +
        ", color='" + color + '\'' +
        '}';
  }

  private String color;

  public Fox(String name, String type, String color) {
    this.name = name;
    this.type = type;
    this.color = color;
  }


  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public String getColor() {
    return color;
  }


}
