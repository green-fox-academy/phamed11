import java.awt.*;
import java.util.stream.Collectors;

public class Exercise5 {
  public static void main(String[] args) {
//    Write a Stream Expression to find the uppercase characters in a string!


    String testString = "MyOtherMoskitoYale";

    String onlyUpper = testString
        .chars()
        .filter(Character::isUpperCase)
        .mapToObj(c -> Character.toString((char) c))
        .collect(Collectors.joining());

    System.out.println(onlyUpper);



  }
}
