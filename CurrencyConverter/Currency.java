// Name: Adam Haiken

/* Description: 
 The following program is a currency converter
 that allows users to enter their specified
 amount of USD and see currency equivalents represented in
 Pounds, Euros, Yen, and Bitcoin.
 */

package CurrencyConverter;

public class Currency {

	public String favCurrency;
	  
	public void setFavCurrency(String favCurrency) { // header and parameter
	        this.favCurrency = favCurrency;
	    }
	    
	public String getFavCurrency() {
	        return this.favCurrency;
	    }
}
