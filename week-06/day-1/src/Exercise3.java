import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {
  public static void main(String[] args) {
//# Exercise 3
//    Write a Stream Expression to get the squared value of the positive numbers from the following array:

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    List<Integer> squared =
        numbers.stream()
        .filter(x -> x > 0)
        .map(x -> x * x)
        .collect(Collectors.toList());

    System.out.println(squared);
    System.out.println(squaredNumbers(numbers));
  }

  public static List<Integer> squaredNumbers(ArrayList<Integer> list) {
    List<Integer> result = new ArrayList<>();
    for (Integer number : list) {
      if (number > 0) {
        result.add(number * number);
      }
    }
    return result;
  }
}
