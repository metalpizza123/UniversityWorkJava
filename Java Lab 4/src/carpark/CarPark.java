/**
 * @author Lilian
 *
 */

package carpark;


public class CarPark {
	
	public static final int DEFAULT_CARPARK_SIZE = 10;
	String[] spaces;
	
	public CarPark(int size){
		if (size<1){
			System.out.println("Size too small");
			//THROW?? wtf?
			throw new IllegalArgumentException();
			//like this?
		}
		else {
			spaces= new String[size];
		}
	}
	
	public CarPark(){
		spaces=new String[DEFAULT_CARPARK_SIZE];
	}
		
	public boolean isEmpty(int position){
		return spaces[position]==null;
	}
	
	public int getAvailableSpaces(int position){
		int availableSpaces = 0;
		while(position < spaces.length && spaces[position] == null){
			availableSpaces++;
			position++;
		}
		return availableSpaces;
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
