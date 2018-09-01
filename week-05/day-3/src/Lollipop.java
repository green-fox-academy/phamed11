public class Lollipop extends Sweets {

//  public Lollipop() {
//    this.price = 10 * (1 + (priceToChangePercentage / 100));
//  }

  public Lollipop() {
    super(5,10);
    price = 10 + priceToChangePercentage;
  }
}
