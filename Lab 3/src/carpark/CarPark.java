/**
 * @author Lilian
 *
 */

package carpark;

import java.awt.List;
import java.util.ArrayList;

public class CarPark {
	
	public static final int DEFAULT_CARPARK_SIZE = 10;
	String[] spaces;
	
	public CarPark(int size){
		if (size<1) {
			System.out.println("Invalid input");
		}
		else {		
		ArrayList carpark=new ArrayList();
		for (int x=1; x<=size;x++)
			carpark.add(null);
		System.out.println(carpark.size());
		}
	}
	
	

	public boolean isEmpty(int position){
		return false;
	}
	
	public int getAvailableSpaces(int position){
		return -1;
	}
	
	public int getCarPosition(String numberPlate){
		return -1;
	}
	
	public int parkCar(String numberPlate, int size){
		return -1;
	}
		
	public boolean removeCar(String numberPlate){
			return false;
	}
	
}
