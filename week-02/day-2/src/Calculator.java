import org.omg.PortableInterceptor.INACTIVE;

import java.util.Scanner;

public class Calculator {
  public static void main(String... args) {
    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations,
    // create a method named "calculate()":
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit
    String plus = "+";
    String minus = "-";
    String multi = "*";
    String divi = "/";
    String perc = "%";


    Scanner scanner = new Scanner(System.in);
    System.out.print("Please type in the expression (Example: \"+ 3 3\"): ");
    String calcu = scanner.nextLine();
    String[] alone = calcu.split(" ");
    int one = Integer.parseInt(alone[1]);
    int two = Integer.parseInt(alone[2]);
    double doubleone = Double.parseDouble(alone[1]);
    double doubletwo = Double.parseDouble(alone[2]);
    int result = 0;
    double result2 = 0;

    if (alone[0].equals(plus)) {
      result = one + two;
    } else if (alone[0].equals(minus)) {
      result = one - two;
    } else if (alone[0].equals(multi)) {
      result = one * two;
    } else if (alone[0].equals(perc)) {
      result2 = (doubleone / doubletwo) * 100;
    } else if (alone[0].equals(divi)) {
      if (one % two == 0) {
        result = one / two;
      } else {
        result2 = doubleone / doubletwo;
      }
    }
    if (result == 0) {
      System.out.println(result2);
    } else if (result2 == 0) {
      System.out.println(result);
    }
  }
}