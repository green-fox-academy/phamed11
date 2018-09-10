import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise8 {
  public static void main(String[] args) {
//    # Exercise 8
//    Write a Stream Expression to find the frequency of numbers in the following array:
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

//    Map<Integer, Integer> frequencyNum =
//        numbers.stream()
//            .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

    System.out.println(frequencyNumbers(numbers));
  }

  public static HashMap<Integer, Integer> frequencyNumbers(ArrayList<Integer> list) {
    HashMap<Integer, Integer> result = new HashMap<>();
    for (int i = 0; i < list.size() ; i++) {
      if (!result.containsKey(list.get(i))) {
        result.put(list.get(i), 1);
      } else {
        result.put(list.get(i), result.get(list.get(i)) + 1);
      }
    }
    return result;
  }
}
