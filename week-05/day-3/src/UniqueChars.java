import java.util.ArrayList;
import java.util.HashMap;

public class UniqueChars {
  public static void main(String[] args) {
    // Create a function called `uniqueCharacters` that takes a string as parameter
    // and returns a list with the unique letters of the given string
    // Create basic unit tests for it with at least 3 different test cases
    System.out.println(uniqueCharacters("kelemen"));
    // Should print out:
    // ["n", "g", "r", "m"]



  }

  public static ArrayList<String> uniqueCharacters(String text) {
    ArrayList<String> result = new ArrayList<>();
    HashMap<String, Integer> unique = new HashMap<>();
    String[] temp = text.split("");
    for (int i = 0; i < temp.length; i++) {
      if (!unique.containsKey(temp[i])) {
        unique.put(temp[i], 1);
      } else {
        unique.put(temp[i], unique.get(temp[i]) + 1);
      }
    }
    for (String eachKey : unique.keySet()) {
      if (unique.get(eachKey) == 1) {
        result.add(eachKey);
      }
    }
    return result;
  }
}

