// Name: Adam Haiken

/* Description: 
 The following program is a currency converter
 that allows users to enter their specified
 amount of USD and see currency equivalents represented in
 Pounds, Euros, Yen, and Bitcoin.
 */

package CurrencyConverter;

public class IsraeliShekel {
	private int numShekels; //private fields 
	private String originOfCurrency;
	
	//private char s;
	//private String d;

	public void setNumShekels(int numShekels) { //sets and gets
		this.numShekels = numShekels;
	}
	
	public void setOriginOfCurrency(String originOfCurrency) {
		this.originOfCurrency = originOfCurrency;
	}

	public int getNumShekels() {
		return this.numShekels;
	}
	
	public String getOriginOfCurrency(){
		return this.originOfCurrency;
	}

	public IsraeliShekel() { // constructor with no args
		numShekels = 0;
		originOfCurrency = "Egypt";
	}

	public IsraeliShekel(int numShekels, String originOfCurrency) { // constructor with args
		this.numShekels = numShekels;
		this.originOfCurrency = originOfCurrency;
	}
	public int shek(int x, int y) { //overloading a method
		return x + y;
	}
	public double shek(double a , double b) {
		return a + b;
	}
		
}
