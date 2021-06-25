
package currency.converter;

/**
 * An object class that utilizes private fields, accessors, mutators, and constructors to store and
 * return the sum of Shekel values as well as display where the Shekel originated.
 * 
 * @author Adam Haiken
 *
 */
public class IsraeliShekel {

  /**
   * The private variable numShekels stores a numerical value of Shekels of the type integer.
   */
  private int numShekels;
  /**
   * The private variable originOfCurrency stores a string literal that describes which country the
   * Shekel currency was formed in.
   */
  private String originOfCurrency;


  /**
   * This method handles the storage of Shekels that will later be added to another quantity of
   * Shekels.
   * 
   * @param numShekels Stores a specified quantity of Shekels
   */
  public void setNumShekels(int numShekels) {
    this.numShekels = numShekels;
  }

  /**
   * This method handles the storage of a location that tells the user where the Shekel currency
   * first started.
   * 
   * @param originOfCurrency Stores a string that should describe a country
   */
  public void setOriginOfCurrency(String originOfCurrency) {
    this.originOfCurrency = originOfCurrency;
  }

  /**
   * This method handles the return of a numerical value of Shekels.
   * 
   * @return this.numShekels A number of Israel Shekels
   */
  public int getNumShekels() {
    return this.numShekels;
  }

  /**
   * This method handle the return of a string literal value representing a geographical location
   * for the shekel's origin.
   * 
   * @return this.originOfCurrency The Shekel's location of origin
   */
  public String getOriginOfCurrency() {
    return this.originOfCurrency;
  }

  /**
   * This constructor does not have any arguments and defaults the values of numShekels and
   * originOfCurrency to 0 and "Egypt" respectively.
   */
  public IsraeliShekel() {
    numShekels = 0;
    originOfCurrency = "Egypt";
  }

  /**
   * This constructor contains 2 arguments and allows the developer to pass in two values upon the
   * creation of object "israel" in the driver class.
   * 
   * @param numShekels number of Shekels from Israel
   * @param originOfCurrency where did the Shekel originate?
   */
  public IsraeliShekel(int numShekels, String originOfCurrency) {
    this.originOfCurrency = originOfCurrency;
  }

  /**
   * This method handles the additon of two intgers values of shekels.
   * 
   * @param x intger value of a shekel to demonstrate method overloading
   * @param y intger value of a shekel to demonstrate method overloading
   * @return The sum of ints x and y
   */
  public int shek(int x, int y) {
    return x + y;
  }

  /**
   * This method handles the additon of two double values of shekels.
   * 
   * @param a double value of a shekel to demonstrate method overloading
   * @param b double value of a shekel to demonstrate method overloading
   * @return The sum of doubles a and b
   */
  public double shek(double a, double b) {
    return a + b;
  }

}
