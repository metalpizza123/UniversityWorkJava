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
		for(int pos = 0; pos < spaces.length; pos++){
			if (numberPlate.equals(spaces[pos])){
				return pos;
			}
		}
		return -1;
	}
	
	public int parkCar(String numberPlate, int size){
		if (getCarPosition(numberPlate)>=0) {
			return -1;
		}
		int position = 0;
		while(position + size -1 < spaces.length){
			if(getAvailableSpaces(position) >= size){
				for(int i = 0; i < size; i++){
					spaces[position+i] = numberPlate;
				}
				return position;
			}
			position++;
		}
		return -1;		
	}
		
	public boolean removeCar(String numberPlate){
			return false;
	}
	
}
