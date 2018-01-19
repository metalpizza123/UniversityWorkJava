import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Julian
 *
 */
public class ArithmeticOps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
		Scanner keyboard= new Scanner(System.in);
		System.out.print("Enter the first number:");
		float number1 = keyboard.nextInt();
		Scanner keyboard1= new Scanner(System.in);
		System.out.print("Enter the first number:");
		float number2 = keyboard1.nextInt();
		float addthem= (number1+number2);
		float minusthem= (number1-number2);
		float multiplythem= (number1*number2);
		float dividethem= (number1/number2);
		float remainderthem= (number1%number2);
		System.out.println(number1 +"+"+number2+"="+addthem);
		System.out.println(number1 +"-"+number2+"="+minusthem);
		System.out.println(number1 +"*"+number2+"="+multiplythem);
		System.out.println(number1 +"/"+number2+"="+dividethem);
		System.out.println(number1 +"%"+number2+"="+remainderthem);
		
		}
		catch(InputMismatchException e) {
			System.out.println("Needs to be a number");
			
		}
	}

}
