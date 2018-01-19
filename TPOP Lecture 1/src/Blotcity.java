import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * 
 */

/**
 * @author Julian
 *
 */
public class Blotcity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		try {
			Scanner keyboard= new Scanner(System.in);
			System.out.print("Enter the speed limit:");
			int number1 = keyboard.nextInt();
			Scanner keyboard1= new Scanner(System.in);
			System.out.print("Enter the car's speed:");
			int number2 = keyboard1.nextInt();
			int fastnfurious=90;
			if (number2>fastnfurious){
				System.out.println("This car is going over 90! Fine him $200");
			}	else if (number2>number1) {
				int fine= (number2-number1)*5;	
				System.out.println("This car is going over the limit! Fine him $"+fine);
			}	else {
				System.out.println("erryting is phine");

			}
		} catch (InputMismatchException e) {
			System.out.println("Needs to be a number");

		}
	}

}
