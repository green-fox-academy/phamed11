import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise7 {
  public static void main(String[] args) {
//
//    # Exercise 7
//    Write a Stream Expression to find the frequency of characters in a given string!

    String test = "AbrakadabraBabra";

    Map<Character, Integer> frequency =
        test.chars()
            .mapToObj(c -> (char)c)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c -> 1)));

    System.out.println(frequency);
    System.out.println(countLetters(test));
  }

  public static HashMap<Character, Integer> countLetters(String word) {
    HashMap<Character, Integer> result = new HashMap<>();
    for (int i = 0; i < word.length(); i++) {
      if (!result.containsKey(word.charAt(i))) {
        result.put(word.charAt(i), 1);
    } else {
        result.put(word.charAt(i), result.get(word.charAt(i)) + 1);
      }
    }
    return result;
  }
}
