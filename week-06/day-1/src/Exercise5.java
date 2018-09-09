import java.util.ArrayList;
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
    System.out.println(uppercase(testString));

  }

  public static String uppercase(String string) {
    String result = "";
    ArrayList<Character> letters = new ArrayList<>();
    for (int i = 0; i < string.length(); i++) {
      letters.add(string.charAt(i));
    }
    for (int j = 0; j < letters.size(); j++) {
      if (Character.isUpperCase(letters.get(j))) {
        result += letters.get(j);
      }
    }
    return result;
  }
}
