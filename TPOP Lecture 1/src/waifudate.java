import java.awt.List;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Julian
 *
 */
public class waifudate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);		
		System.out.println
		("Example date in correct format: 19/01/2018");
		System.out.println("Enter the date you want to check:");
		String datestring = keyboard.next();
		int day=Integer.parseInt(datestring.substring(0,2));
		int month=Integer.parseInt(datestring.substring(3,5));
		int year=Integer.parseInt(datestring.substring(6,10));
		boolean valid=true;
			if (Arrays.asList(1,3,5,7,8,10,12).contains(month)) {
					//System.out.print(31);
					if (day>31 || day<0) {
						valid=false;
					}
					else {
						
					}
			}
			else if (Arrays.asList(4,6,9,11).contains(month)) {
				if (day>30 || day<0) {
					valid=false;
				}
				else {
					
				}
			}
			else if (month==2) {
				if (day>28 || day<0) {
					valid=false;
				}
				else {
					
				}
			}
			else {
				valid=false;
			}
		if (valid=true) {
			System.out.println("This is a valid date");
		} else {
			System.out.println("This is not a valid date");

		}
		
		
		
			
		
	}

}
