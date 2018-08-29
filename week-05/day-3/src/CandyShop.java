import java.util.ArrayList;

public class CandyShop {
  int sugar;
  int income;
  double sugarPrice = 0.1;

  public static int CANDY = 0;
  public static int LOLLIPOP = 0;

  public CandyShop(int sugarInGramms) {
    this.sugar = sugarInGramms;
  }


  public void createSweets(int sweets) {
    Candy candy = new Candy();
    Lollipop lollipop = new Lollipop();
    if (sweets == CANDY) {
      sugar -= candy.grNeededToMake;
      CANDY++;
    } else if (sweets == LOLLIPOP){
      sugar -= lollipop.grNeededToMake;
      LOLLIPOP++;
    }
  }

  public void raise(int number) {
    Sweets sweets = new Sweets();
    sweets.priceToChangePercentage = number;
  }

  public void sell(int sweets, int pieceToSell) {
    Candy candy = new Candy();
    Lollipop  lollipop = new Lollipop();
    if (sweets == CANDY) {
      income += candy.price;
      CANDY -= pieceToSell;
      sugar -= candy.grNeededToMake;
    } else if (sweets == LOLLIPOP) {
      income += lollipop.price;
      LOLLIPOP -= pieceToSell;
      sugar -= lollipop.grNeededToMake;
    }
  }

  public void buySugar(int number) {
    sugar += number;
    income -= number * sugarPrice;
  }
  public String toString() {
    return "Invetory: " + CANDY + " candies, " + LOLLIPOP + " lollipops, " + " Income: " + income + "$, Sugar: " + sugar + "gr";
  }
}
