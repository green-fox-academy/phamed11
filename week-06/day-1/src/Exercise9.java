import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise9 {
  public static void main(String[] args) {
    //# Exercise 9
    //    Write a Stream Expression to convert a char array to a string!

    char[] charList = new char[]{'a', 'b', 'd', 'e', 'm', 'f'};

    String result = new String(charList);

    String strResult = Stream.of(charList)
        .map(String::valueOf)
        .collect(Collectors.joining());

    System.out.println(result);
    System.out.println(strResult);
    System.out.println(changeToString(charList));

  }

  public static String changeToString(char[] list) {
    String result = "";
    for (Character letter : list) {
      result += letter;
    }
    return result;
  }
}
