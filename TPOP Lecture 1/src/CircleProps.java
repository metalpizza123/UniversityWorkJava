/**
 * 
 */

/**
 * @author Julian
 *
 */
import java.lang.Math;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CircleProps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);
		System.out.print("Enter the radius:");
		float number1 = keyboard.nextInt();
		double area=number1*(Math.PI)*(Math.PI);
		double circum=number1*2*Math.PI;
		DecimalFormat numberFormat=new DecimalFormat("###.00");
		System.out.println("The circumference is "+numberFormat.format(circum)+"cm");
		System.out.println("The area is "+numberFormat.format(area)+" square cm");
		}
		catch(InputMismatchException e) {
			System.out.println("Needs to be a number");
			
		}
	}

}
