import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise10 {
  public static void main(String[] args) {

//    Create a Fox class with 3 properties(name, type, color) Fill a list with at least 5 foxes, it's up to you how you name/create them!
//    Write a Stream Expression to find the foxes with green color! Write a Stream Expression to find the foxes with green color and
//    pallida type!

    Fox one = new Fox("Charlie", "Greenfox", "green");
    Fox two = new Fox("Johnny", "redfox", "red");
    Fox three = new Fox("Adam", "pallinda", "green");
    Fox four = new Fox("George", "blackfox", "black");
    Fox five = new Fox("Albino", "whitefox", "white");
    Fox six = new Fox("Jesus", "bluefox", "blue");

    ArrayList<Fox> theHound = new ArrayList<>();
    theHound.add(one);
    theHound.add(two);
    theHound.add(three);
    theHound.add(four);
    theHound.add(five);
    theHound.add(six);

    List<String> onlyGreen = theHound.stream()
        .filter(fox -> fox.getColor().equals("green"))
        .map(Fox::getName)
        .collect(Collectors.toList());

    List<String> pallidaAndGreen = theHound.stream()
        .filter(fox -> fox.getColor().equals("green") && fox.getType().equals("pallinda"))
        .map(Fox::getName)
        .collect(Collectors.toList());

    System.out.println(one.toString());
    System.out.println(onlyGreen);
    System.out.println(pallidaAndGreen);
    System.out.println("\nThis is the method result: ");
    System.out.println(onlyGreenMethod(theHound));
    System.out.println(onlyPallindaMethod(theHound));
  }

  public static ArrayList<String> onlyGreenMethod(ArrayList<Fox> list) {
    ArrayList<String> result = new ArrayList<>();
    for (Fox fox : list) {
      if (fox.getColor().equals("green")) {
        result.add(fox.getName());
      }
    }
    return result;
  }

  public static ArrayList<String> onlyPallindaMethod(ArrayList<Fox> list) {
    ArrayList<String> result = new ArrayList<>();
    for (Fox fox : list) {
      if (fox.getColor().equals("green") && fox.getType().equals("pallinda")) {
        result.add(fox.getName());
      }
    }
    return result;
  }
}
