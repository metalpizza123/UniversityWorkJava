import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Julian
 *
 */
public class leapyear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
			Scanner keyboard= new Scanner(System.in);
			System.out.print("Enter the year you want to check:");
			int number1 = keyboard.nextInt();
			if (number1%400==0) {
				System.out.println("It's a leap year");
			}	else if (number1%100==0){
				System.out.println("It's not a leap year");
	
			}	else if (number1%4==0){
				System.out.println("It's  a leap year");
				
			}	else {
				System.out.println("It's not a leap year");
	
			}
		} 	catch(InputMismatchException e) {
			System.out.println("Needs to be a number");

		}
	}

	
}