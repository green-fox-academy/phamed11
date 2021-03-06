import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
  public static void main(String[] args) {
//    # Exercise 1
//    Write a Stream Expression to get the even numbers from the following array:
//    ```java
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    List<Integer> evenNumbers = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    System.out.println(evenNumbers);
    System.out.println(evenNumbersMethod(numbers));
  }

  public static List<Integer> evenNumbersMethod(ArrayList<Integer> list) {
    List<Integer> evens = new ArrayList<>();
    for (Integer numbers : list) {
      if (numbers % 2 == 0) {
        evens.add(numbers);
      }
    }
    return evens;
  }
}
