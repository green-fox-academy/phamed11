import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {

  public static void main(String[] args) {
//    # Exercise 6
//    Write a Stream Expression to find the strings which starts with `A` and ends with `I` in the following array:


    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH",
        "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    List<String> filteredList = cities.stream()
        .filter(s -> s.startsWith("A") && s.endsWith("I"))
        .collect(Collectors.toList());

    String result = cities.stream()
        .filter(s -> s.startsWith("A") && s.endsWith("I"))
        .collect(Collectors.joining());

    
    System.out.println(result);
    System.out.println(filteredList);
    System.out.println(startsWith(cities));
  }

  public static String startsWith(ArrayList<String> list) {
    String result = "";
    for (String word : list) {
      if (word.startsWith("A") && word.endsWith("I")) {
        result = word;
      }
    }
    return result;
  }
}
