/*
 * There are eight primitive data types in Java: byte: The byte data type is an 8-bit signed two's
 * complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The
 * byte data type can be useful for saving memory in large arrays, where the memory savings actually
 * matters. They can also be used in place of int where their limits help to clarify your code; the
 * fact that a variable's range is limited can serve as a form of documentation. short: The short
 * data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a
 * maximum value of 32,767 (inclusive). As with byte, the same guidelines apply: you can use a short
 * to save memory in large arrays, in situations where the memory savings actually matters. int: By
 * default, the int data type is a 32-bit signed two's complement integer, which has a minimum value
 * of -231 and a maximum value of 231-1. In Java SE 8 and later, you can use the int data type to
 * represent an unsigned 32-bit integer, which has a minimum value of 0 and a maximum value of
 * 232-1. Use the Integer class to use int data type as an unsigned integer. See the section The
 * Number Classes for more information. Static methods like compareUnsigned, divideUnsigned etc have
 * been added to the Integer class to support the arithmetic operations for unsigned integers. long:
 * The long data type is a 64-bit two's complement integer. The signed long has a minimum value of
 * -263 and a maximum value of 263-1. In Java SE 8 and later, you can use the long data type to
 * represent an unsigned 64-bit long, which has a minimum value of 0 and a maximum value of 264-1.
 * Use this data type when you need a range of values wider than those provided by int. The Long
 * class also contains methods like compareUnsigned, divideUnsigned etc to support arithmetic
 * operations for unsigned long. float: The float data type is a single-precision 32-bit IEEE 754
 * floating point. Its range of values is beyond the scope of this discussion, but is specified in
 * the Floating-Point Types, Formats, and Values section of the Java Language Specification. As with
 * the recommendations for byte and short, use a float (instead of double) if you need to save
 * memory in large arrays of floating point numbers. This data type should never be used for precise
 * values, such as currency. For that, you will need to use the java.math.BigDecimal class instead.
 * Numbers and Strings covers BigDecimal and other useful classes provided by the Java platform.
 * double: The double data type is a double-precision 64-bit IEEE 754 floating point. Its range of
 * values is beyond the scope of this discussion, but is specified in the Floating-Point Types,
 * Formats, and Values section of the Java Language Specification. For decimal values, this data
 * type is generally the default choice. As mentioned above, this data type should never be used for
 * precise values, such as currency. boolean: The boolean data type has only two possible values:
 * true and false. Use this data type for simple flags that track true/false conditions. This data
 * type represents one bit of information, but its "size" isn't something that's precisely defined.
 * char: The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000'
 * (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
 */

// Variables: are containers for storing data values. In Java, there are 8 different types of
// variables. Think of declaring a variable as making a box. Assigning a value to a variable is like
// putting an item inside that box.
// Scope: Variables are declared within functions, and are only accessible within the method that
// they exist in. A Variable is within a method, otherwise known as a function. You might have
// multiple methods in your program.
// Final: When a variable is declared with final keyword, its value can’t be modified, essentially,
// a constant. A variable can continously be reassigned to new values. A final cannot. Once it is
// assigned, it will always take on that initial value.

/*
 * Casting is when you assign a value of one primitive data type to another type. Widening Casting
 * (automatically) - converting a smaller type to a larger type size byte -> short -> char -> int ->
 * long -> float -> double Narrowing Casting (manually) - converting a larger type to a smaller size
 * type double -> float -> long -> int -> char -> short -> byte
 */

/*
 * Operator precedence: Operators with higher precedence are evaluated before operators with
 * relatively lower precedence. Operators on the same line have equal precedence. All binary
 * operators except for the assignment operators are evaluated from left to right; assignment
 * operators are evaluated right to left. Table below displays highest to lowest precedence.
 * Operators on the same line have equal precedence and should be evaluated from left to right.
 * Operators Precedence postfix: expr++ expr-- unary: ++expr --expr +expr -expr ~ ! multiplicative:
 * * / % additive: + - shift: << >> >>> relational: < > <= >= instanceof equality: == != bitwise:
 * AND & bitwise: exclusive OR ^ bitwise: inclusive OR | logical: AND && logical: OR || ternary: ? :
 * assignment: = += -= *= /= %= &= ^= |= <<= >>= >>>=
 */

/*
 * Inheritance; it is possible to inherit attributes and methods from one class to another. We group
 * the "inheritance concept" into two categories subclass (child) - the class that inherits from
 * another class superclass (parent) - the class being inherited from To inherit from a class, use
 * the extends keyword. Inheritance is the concept that you can create new classes that stem from
 * existing classes while adopting their methods and fields without actually re typing this
 * information into the new class. One benefit of using inheritance is that if you want to create a
 * class that only stores slightly more information than the previous class, inheritance can save
 * you a lot of time by offering the extends keyword. This means you no longer have to spend the
 * time to re type all the methods and fields that you just created in your previous class. Another
 * benefit of using inheritance is that you can keep you program extremely organized while still
 * keeping the same amount of information in your program. Inheritance also allows developers to use
 * code from other programmers' classes without copying and pasting this code into their own
 * project.
 */

/*
 * Polymorphism: is the ability of an object to take on many forms. The most common use of
 * polymorphism in OOP occurs when a parent class reference is used to refer to a child class
 * object. Any Java object that can pass more than one IS-A test is considered to be polymorphic. In
 * Java, all Java objects are polymorphic since any object will pass the IS-A test for their own
 * type and for the class Object. - occurs when we have many classes that are related to each other
 * by inheritance.
 */

package currency.converter;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * A driver class that allows the user to convert a random or specified value from US Dollars into
 * four other currency conversions.
 * 
 * @author Adam Haiken
 *
 */
public class Main {
  /**
   * This field allows eclipse to read input that the user types in the console.
   */
  static Scanner scan;

  /**
   * The main method is part of this driver class and allows the programmer to see visible output
   * when running the program.
   * 
   * @param args Allows print statements and method calls to appear in the console
   */
  public static void main(String[] args) {

    System.out.println("Hello! Welcome to my Currency Converter.");
    System.out.println("I hope you enjoy!");

    scan = new Scanner(System.in);
    Random rand = new Random();
    System.out.println("\nWould you like to convert a random or desired value of currency? "
        + "\nEnter 'random' or 'desired'");

    String response = scan.nextLine();
    if (response.equals("random")) {
      /*
       * == is used to compare number values while seeing if they are equal. The equals and
       * compareTo methods allow the coder to compare objects by seeing if two strings have the same
       * contents and same unicode values lexicographically.
       */
      int randomNum = rand.nextInt(1000001);
      System.out.println(
          "We wil be using " + (double) randomNum + "$ as our random value for this example.");
      String odd = (randomNum % 2 != 0) ? "odd" : "even";
      System.out.println("This randomly generated value is an " + odd + " number\n");

      double pound = randomNum / 1.42;
      System.out.println(
          randomNum + " $ is equivalent to " + pound + " Great Britain Pound Sterlings, £\n");

      double euro = randomNum / 1.22;
      System.out.println(randomNum + " $ is equivalent to " + euro + " European Euros, €\n");

      double yen = randomNum * 108.93948;
      System.out.println(randomNum + " $ is equivalent to " + yen + " Japanese Yen, ¥\n");

      double bitcoin = randomNum / 37626.90;
      System.out.println(randomNum + " $ is equivalent to " + bitcoin + " Bitcoins, B\n");

      boolean accuracy = false;
      System.out.println("These converted values are always accurate: T/F?");
      System.out.println("Answer: " + accuracy);
      System.out.println("Were you correct? If not, here is why:");

      System.out.println("\nNote: All currencies are part of the forex market. Conversion "
          + "rates are subject to change at any instant as stock prices are always varying");
      System.out.println("Data was sourced from forex market on 5/22/21\n");

      double numCurrencies = Math.pow(2, 2);
      System.out.println(
          "There are " + numCurrencies + " currency conversions featured in this program.\n");

      System.out.println("Did you enjoy my program?");
      final String likeOrDislike = scan.nextLine();

      if (likeOrDislike.equals("yes")) {
        System.out.println("I am glad you enjoyed it!");
      } else {
        System.out.println("I am sorry you disliked my program.");
      }

      System.out.println("\nWhat currencies would you like to see implemented in future "
          + "versions of this program?");
      Currency yourCurrency = new Currency();
      String yourCurrency1 = scan.nextLine();
      yourCurrency.setFavCurrency(yourCurrency1); // method call with argument
      System.out.println("Thanks for yout input! We will include " + yourCurrency.getFavCurrency()
          + " in this program");



    } else if (response.equals("desired")) {
      System.out
          .println("How many US dollars do you want to convert? (Enter raw value, no '$' sign) ");
      int tryCatch = 1;
      do {
        try {
          String s = scan.nextLine();
          double numDollars = Double.parseDouble(s);
          String even = (numDollars % 2 == 0) ? "even" : "odd"; // ternary operator
          System.out.println("You entered an " + even + " number");
          double pound = numDollars / 1.42;
          System.out.println(
              numDollars + " $ is equivalent to " + pound + " Great Britain Pound Sterlings, £\n");

          double euro = numDollars / 1.22;
          System.out.println(numDollars + " $ is equivalent to " + euro + " European Euros, €\n");

          double yen = numDollars * 108.93948;
          System.out.println(numDollars + " $ is equivalent to " + yen + " Japanese Yen, ¥\n");

          double bitcoin = numDollars / 37626.90;
          System.out.println(numDollars + " $ is equivalent to " + bitcoin + " Bitcoins, B\n");
          tryCatch = 2;
        } catch (Exception e) {
          System.out.println("Please enter an numerical value.");
        }
      } while (tryCatch == 1);

      boolean accuracy = false;
      System.out.println("These converted values are always accurate: T/F?");
      System.out.println("Answer: " + accuracy);
      System.out.println("Were you correct? If not, here is why:\n");

      System.out.println("Note: All currencies are part of the forex market. Conversion rates "
          + "are subject to change at any instant as stock prices are always varying");
      System.out.println("Data was sourced from forex market on 5/22/21\n");

      System.out.println(
          "There are " + Math.pow(2, 2) + " currency conversions featured in this program.");

      System.out.println("Did you enjoy my program?");
      String likeOrDislike = scan.nextLine();
      if (likeOrDislike.equals("yes")) {
        System.out.println("I am glad you enjoyed it!");
      } else {
        System.out.println("I am sorry you disliked my program.");
      }


      System.out.println("\nWhat currencies would you like to see implemented in future "
          + "versions of this program?");
      Currency yourCurrency = new Currency();
      String yourCurrency1 = scan.nextLine();
      yourCurrency.setFavCurrency(yourCurrency1); // method call with argument
      System.out.println("Thanks for yout input! We will include " + yourCurrency.getFavCurrency()
          + " in this program");
    } else {
      System.out.println("Your input was incorrect. Check for whitespace around your input");
    }
    System.out.println("\nWhat is the currency of Albania?");
    String currencyCountry = "Albania";

    switch (currencyCountry) {
      case "Albania":
        System.out.println("Lek!");
        break;
      /*
       * When a break statement is used in a loop, the loop is immediately terminated and the
       * program control resumes at the next statement following the loop. It can also be used to
       * terminate a case in a switch statement.
       */
      case "Bahamas":
        System.out.println("Dollar");
        break;
      case "Cambodia":
        System.out.println("Riel");
        break;
      case "Djibouti":
        System.out.println("Franc");
        break;
      case "Ecuador":
        System.out.println("Sucre");
        break;
      default:
        System.out.println("Invalid Country");
    }
    System.out.println("The Lek is the national currency of " + currencyCountry);

    String comparing = "Bahamian Dollar";
    System.out.println("\nThe " + comparing + " has " + comparing.compareTo("Ecuadorian Sucre")
        + " characters compared to the Ecuadorian Sucre.\n");

    for (int value = 10, year = 2021; value < 15 && year < 2026; value++, year++) {
      System.out.println(
          "The US dollar is predicted to be down " + value + "% by the end of " + year + ".");
    }

    int northAmerica = 22;
    int southAmerica = 7;
    int gdp;
    gdp = (northAmerica > southAmerica) ? northAmerica : southAmerica;
    System.out.println("\n" + gdp + " trillion dollars is the GDP of North America.\n");

    int averageIncomeFlorida = 28;
    do {
      System.out
          .println("The average income in Florida is " + averageIncomeFlorida + ",000 dollars");
      averageIncomeFlorida++;
    } while (averageIncomeFlorida < 31);

    int georgia = 30;
    while (georgia < 34) {
      if (georgia == 32) {
        georgia++;
        continue;
        /*
         * The continue statement breaks one iteration (in the loop), if a specified 
         * condition occurs, and continues with the next iteration in the loop.
         */
      }
      System.out.println("The average income in Georgia is " + georgia + ",000 dollars.\n");
      georgia++;
    }

    IsraeliShekel israel = new IsraeliShekel(400, "Israel");
    System.out.println("I have " + israel.getNumShekels() + " Shekels.");
    System.out.println(israel.getOriginOfCurrency() + " is the origin of the Shekel.\n");

    int myInt = israel.shek(2, 9); // overloading a method
    double myDub = israel.shek(4.6, 24.9);
    System.out.println(myInt + " shekels is not that many shekels.");
    System.out.println(myDub + " shekels is more than 11 shekels.\n");

    int[] dollarArray = new int[6];
    dollarArray[0] = 4324;
    dollarArray[1] = 23;
    dollarArray[2] = 21;
    dollarArray[3] = 245;
    dollarArray[4] = 57;
    dollarArray[5] = 1;
    System.out.println("The following set of numbers is your weekly income for the next 6 weeks.");
    String intArrayString = Arrays.toString(dollarArray);
    System.out.println(intArrayString);
    int count;
    int sum = 0;
    for (count = 0; count < dollarArray.length; count++) {
      sum += dollarArray[count];
    }
    System.out.println("You have " + sum + " dollars");
    int tryCatch1 = 1;
    System.out.println(
        "\nThis program finds the smallest number in the array.\nFirst, enter "
        + "how many elements you would like in the array.\nThen, enter the numbers to "
        + "be stored in the array.");
    do {
      try {
        String minS = scan.nextLine();
        int k = Integer.parseInt(minS);
        int[] array = new int[k];
        for (int counter = 0; counter < k; counter++) {
          array[counter] = scan.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
          if (array[i] < min) {
            min = array[i];

          }
        }
        System.out.println("The smallest number is " + min + ".\n");
        tryCatch1 = 2;
      } catch (Exception e) {
        System.out.println("Please enter an Integer.");
      }
    } while (tryCatch1 == 1);

    String[] types = {"dollar", "riel", "franc", "sucre", "shekel"};
    for (int i = 0; i < types.length; i++) {
      if (types[i].equals("franc")) {
        System.out.println("Franc appears at index position " + i + " in the array.\n");
      }
    }
    int[] numbers = {3, 4, 5, -5, 0, 12};
    System.out.println(
        "The follow set is the top five most used currencies' % change "
        + "in buying power since 1999:\n"
            + Arrays.toString(numbers));
    int sumOf = 0;

    // enhanced for loop
    for (int number : numbers) {
      sumOf += number;
    }

    System.out.println("total % change of currency buying power = " + sumOf);

    int[][] grid = {{5, 32, 20433, 32, 320, 64, 19, 40, 326}, {2, 0, 80, 20, 34, 62, 92, 49, 93},
        {324, 243, 14, 32, 53, 46, 64, 43, 22}};
    grid[2][8] = 23;
    for (int row = 0; row < grid.length; row++) {
      for (int col = 0; col < grid[row].length; col++) {
        if (grid[row][col] == 19) {
          System.out.println(
              "The value 19 has the coordinates row: " + (row + 1) + ", col: " + (col + 1));
        }
      }
    }

    ArrayList<String> currency = new ArrayList<String>();
    currency.add("Lek");


    scan.close();

  }

}
