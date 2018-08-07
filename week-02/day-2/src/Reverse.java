import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse {
  public static void main(String[] args) {

    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    // Create a method that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.

    System.out.print(reverse(reversed));
  }


  public static String reverse(String text) {
    String result = "";
    for (int i = text.length() - 1; i >= 0; i--) {
      result += text.charAt(i);
    }
    return result;
  }
}

