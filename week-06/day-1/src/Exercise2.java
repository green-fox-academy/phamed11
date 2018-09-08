import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise2 {
  public static void main(String[] args) {
//    # Exercise 2
//    Write a Stream Expression to get the average value of the odd numbers from the following array:

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    double average = numbers.stream()
        .filter(x -> x % 2 != 0)
        .mapToInt(x -> x)
        .average()
        .getAsDouble();

    System.out.println(average);
    System.out.println(aver(numbers));
  }

  public static double aver(ArrayList<Integer> list) {
    int sum = 0;
    int numberOfOdds = 0;
    for (Integer numb : list) {
      if (numb % 2 != 0) {
        sum += numb;
        numberOfOdds++;
      }
    }
    return (double) sum / numberOfOdds;
  }
}
