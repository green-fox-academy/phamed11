public class Candy extends Sweets {

  public Candy() {
    this.price = 20 * (1 + (priceToChangePercentage / 100));
    this.grNeededToMake = 10;
  }
}
