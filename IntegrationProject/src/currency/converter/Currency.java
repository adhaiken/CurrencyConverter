
package currency.converter;

/**
 * An object class that allows the user to suggest their favorite currency to 
 * the developers in order for it to be implemented in future versions of
 * the program.
 * 
 * @author Adam Haiken
 * 
 */
public class Currency {

  /**
   * The public string favCurrency stores a string literal relating to the 
   * user's most widely used currency.
   */
  public String favCurrency;

  /**
   * This method handles the storage of a favorite currency that will be reviewed and added to the
   * program later on.
   * 
   * @param favCurrency Stores a string that should describe one's favorite currency
   */
  public void setFavCurrency(String favCurrency) { // header and parameter
    this.favCurrency = favCurrency;
  }

  /**
   * This method handles the return of the user's favorite currency that they wished was on this
   * program.
   * 
   * @return this.favCurrency allows the driver class to access and 
   * print one's favorite currency and conisder adding it to the list of possible conversions
   */
  public String getFavCurrency() {
    return this.favCurrency;
  }
}
