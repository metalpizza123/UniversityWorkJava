/**
 * 
 */

/**
 * @author Julian
 *
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Userinput1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a int:");
		int number = keyboard.nextInt();
		
		System.out.println("number entered is:" + number);
		}
	
		catch(InputMismatchException e) {
			System.out.println("Needs to be a number");
			
		}
	}

}
