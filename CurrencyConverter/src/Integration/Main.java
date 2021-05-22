// Name: Adam Haiken

/* Description: 
 The following program is a currency converter
 that allows users to enter their specified
 amount of USD and see currency equivalents represented in
 PPounds, Euros, Yen, and Bitcoin.
 */

/* There are eight primitive data types in Java:
byte: The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters. They can also be used in place of int where their limits help to clarify your code; the fact that a variable's range is limited can serve as a form of documentation.

short: The short data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive). As with byte, the same guidelines apply: you can use a short to save memory in large arrays, in situations where the memory savings actually matters.

int: By default, the int data type is a 32-bit signed two's complement integer, which has a minimum value of -231 and a maximum value of 231-1. In Java SE 8 and later, you can use the int data type to represent an unsigned 32-bit integer, which has a minimum value of 0 and a maximum value of 232-1. Use the Integer class to use int data type as an unsigned integer. See the section The Number Classes for more information. Static methods like compareUnsigned, divideUnsigned etc have been added to the Integer class to support the arithmetic operations for unsigned integers.

long: The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -263 and a maximum value of 263-1. In Java SE 8 and later, you can use the long data type to represent an unsigned 64-bit long, which has a minimum value of 0 and a maximum value of 264-1. Use this data type when you need a range of values wider than those provided by int. The Long class also contains methods like compareUnsigned, divideUnsigned etc to support arithmetic operations for unsigned long.

float: The float data type is a single-precision 32-bit IEEE 754 floating point. Its range of values is beyond the scope of this discussion, but is specified in the Floating-Point Types, Formats, and Values section of the Java Language Specification. As with the recommendations for byte and short, use a float (instead of double) if you need to save memory in large arrays of floating point numbers. This data type should never be used for precise values, such as currency. For that, you will need to use the java.math.BigDecimal class instead. Numbers and Strings covers BigDecimal and other useful classes provided by the Java platform.

double: The double data type is a double-precision 64-bit IEEE 754 floating point. Its range of values is beyond the scope of this discussion, but is specified in the Floating-Point Types, Formats, and Values section of the Java Language Specification. For decimal values, this data type is generally the default choice. As mentioned above, this data type should never be used for precise values, such as currency.

boolean: The boolean data type has only two possible values: true and false. Use this data type for simple flags that track true/false conditions. This data type represents one bit of information, but its "size" isn't something that's precisely defined.

char: The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
*/

// Variables: are containers for storing data values. In Java, there are 8 different types of variables. Think of declaring a variable as making a box. Assigning a value to a variable is like putting an item inside that box.
// Scope: Variables are declared within functions, and are only accessible within the method that they exist in. A Variable is within a method, otherwise known as a function. You might have multiple methods in your program.
// Final: When a variable is declared with final keyword, its value can’t be modified, essentially, a constant. A variable can continously be reassigned to new values. A final cannot. Once it is assigned, it will always take on that initial value.

package Integration;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello! Welcome to my Currency Converter.");
		System.out.println("I hope you enjoy!");
		System.out.println(" ");
		
		Scanner scan = new Scanner(System.in);
		// Takes input from the user
		System.out.println("How many US dollars do you want to convert? (Enter raw value: no '$' sign) ");
		double numDollars = scan.nextDouble();
		double pound = numDollars / 1.42;
		System.out.println(numDollars + " $ is equivalent to " + pound + " Great Britain Pound Sterlings, £");
		System.out.println("");
		
		double euro = numDollars / 1.22;
		System.out.println(numDollars + " $ is equivalent to " + euro + " European Euros, €");
		System.out.println("");
		
		double yen = numDollars * 108.93948;
		System.out.println(numDollars + " $ is equivalent to " + yen + " Japanese Yen, ¥");
		System.out.println("");
		
		double bitcoin = numDollars / 37626.90;
		System.out.println(numDollars + " $ is equivalent to " + bitcoin + " Bitcoins, ฿");
		System.out.println("");
	
		
		boolean accuracy = false;
		System.out.println("These converted values are always accurate: T/F?");
		System.out.println("Answer: " + accuracy);
		System.out.println("Were you correct? If not, here is why:");
		

		System.out.println("");
		System.out.println("Note: All currencies are part of the forex market. Conversion rates are subject to change at any instant as stock prices are always varying");
		System.out.println("Data was sourced from forex market on 5/22/21");
		
		
		System.out.println("");
		int numCurrencies = 4;
		System.out.println("There are " + numCurrencies + " currency conversions featured in this program.");
		
		
		System.out.println("");
		Scanner input = new Scanner(System.in);
		System.out.println("Did you enjoy my program?");
		final String likeOrDislike = input.nextLine();
		System.out.println("You said: " + likeOrDislike);
		System.out.println("I am glad you enjoyed it!");

		
		scan.close();
		input.close();
		// Make sure to close the scanners when you are done
	}

}
