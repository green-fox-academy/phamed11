import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;

public class TakesLonger {
  public static void main(String[] args) {
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    String quote2 = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    String quote3 = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    // When saving this quote a disk error has occured. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)
//    System.out.println(quote.length());

//    //This is the first method
//    String[] newText = new String[3];
//    newText[0] = quote.substring(0, 21);
//    newText[2] = quote.substring(22, 82);
//    String between = "always takes longer than";
//    newText[1] = between;
//    System.out.println(Arrays.toString(newText));

    //second method
//    System.out.println(quote2.indexOf("It "));
//    String method2;
//    method2 = quote2.substring(quote2.indexOf("It")) + "always takes longer than " + quote2.substring(quote2.indexOf("you"), quote2.length());
//    System.out.println(method2);
    System.out.println(quote2.substring(0,quote2.indexOf("you")) + "always takes longer than " + (quote2.substring(quote2.indexOf("you"))));
//    System.out.println(quote2.substring(quote2.indexOf("you")));

//    //method3
//    StringBuilder newString = new StringBuilder(quote3);
//    newString.insert(quote3.indexOf("you"), "always takes longer than ");
//    System.out.println(newString);

  }
}