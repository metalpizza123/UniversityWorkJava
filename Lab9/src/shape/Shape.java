/**
 * 
 */
package shape;

/**
 * @author Julian
 *
 */
public class Shape {

	String colour;
	boolean filled;

public Shape(String colour,boolean filled) {
	this.colour=colour;
	this.filled=filled;
}
public String getColour() {
	return this.colour;
	
}
public boolean isFilled() {
	return this.filled;
}
public void setFilled(boolean filled) {
	this.filled=filled;

}
public void setColour(String Colour) {
	this.colour=Colour;
}
public  String toString(){
	String statusshape = String.format("Your Shape with colour of %s and is", this.colour);
	statusshape += filled?"filled.":"not filled.";
	return statusshape;
}
public static void main(String[] args) {
  Shape testingshape= new Shape("Yellow", false );
  testingshape.setFilled(true);  
  System.out.println(testingshape.isFilled());
  testingshape.setColour("Green");
//  System.out.println(testingshape.getColour());
  System.out.println(testingshape.toString());
  

}
}
