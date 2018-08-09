import java.util.*;

public class CandyShop{
  public static void main(String... args){
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);





    // Accidentally we added "2" and "false" to the list. 
    // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
    // No, don't just remove the lines
    // Create a method called sweets() which takes the list as a parameter. 

    System.out.println(sweets(arrayList));
    // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
  }
  public static Object sweets(ArrayList sweet) {
    if (sweet.contains(2)) {
      sweet.set(sweet.indexOf(2), "Croissant");
    } else {

    }
    if (sweet.contains(false)) {
      sweet.set(sweet.indexOf(false), "Ice cream");
    } else {

    }
    return sweet;
  }
}