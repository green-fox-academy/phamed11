import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {

  public static void main(String[] args) {
//    # Exercise 4
//    Write a Stream Expression to find which number squared value is more then 20 from the following array:

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));


    List<Integer> biggerThan20 = numbers.stream()
        .filter((x -> x * x > 20))
        .collect(Collectors.toList());

    System.out.println(biggerThan20);

  }
}
