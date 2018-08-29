public class Lollipop extends Sweets {

  public Lollipop() {
    this.price = 10 * (1 + (priceToChangePercentage / 100));
    this.grNeededToMake = 5;
  }
}
