package carpark;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Test;
import org.junit.Ignore;

public class CarParkTest {

	/**
	 * @Test the constructor CarPark(int). Ensure that the size is correct and
	 *       that all spaces are initialised to null
	 */
	
	@Test
	public void testCarParkInt() {
		CarPark park = new CarPark(12);
		assertTrue(park.spaces.length == 12);
		for (String numberPlate : park.spaces) {
			assertNull(numberPlate);
		}
	}

	/**
	 * @Test the constructor CarPark(int). Test if an
	 *       {@link IllegalArgumentException} exception is thrown when an
	 *       invalid size (i.e. less than 1) is given.
	 */
	
	@Test(expected = IllegalArgumentException.class)
	public void testCarParkIntError() {
		CarPark park = new CarPark(0);
	}

	/**
	 * @Test the constructor CarPark(). Ensure that the size is correct (i.e.
	 *       equals CarPark.DEFAULT_CARPARK_SIZE) to and that all spaces are
	 *       initialised to null
	 */
	
	@Test
	public void testCarPark() {
		CarPark park = new CarPark();
		assertTrue(park.spaces.length == CarPark.DEFAULT_CARPARK_SIZE);
		for (String numberPlate : park.spaces) {
			assertNull(numberPlate);
		}
	}

	/**
	 * @Test the method isEmpty(). 
	 */
	
	@Test
	public void testIsEmpty() {
		CarPark park = new CarPark();
		assertTrue(park.isEmpty(0));
		park.spaces[0] = "1";
		assertFalse(park.isEmpty(0));
	}

	/**
	 * @Test the method getAvailableSpaces(int). 
	 */
	
	@Test
	public void testGetAvailableSpaces() {
		CarPark park = new CarPark(6);
		// Test the method when the car park is empty
		assertEquals(6, park.getAvailableSpaces(0));
		assertEquals(3, park.getAvailableSpaces(3));
		assertEquals(1, park.getAvailableSpaces(5));
		
		// Set a new state of the car park
		park.spaces = new String[] { "1", null, null, null, "2", null };
		assertEquals(0, park.getAvailableSpaces(0));
		assertEquals(3, park.getAvailableSpaces(1));
		assertEquals(2, park.getAvailableSpaces(2));
	}

	
	/**
	 * @Test the method getCarPosition(String). 
	*/
	@Ignore
	@Test
	public void testGetCarPosition() {
		CarPark park = new CarPark(6);
		
		// Set a new state of the car park
		park.spaces = new String[] { "1", "1", null, "2", "3", "3" };
		
		// A car that is not in the car park
		assertEquals(-1, park.getCarPosition("4"));
		
		// Cars that are in the car park
		assertEquals(0, park.getCarPosition("1"));
		assertEquals(3, park.getCarPosition("2"));
		assertEquals(4, park.getCarPosition("3"));
	}

	/**
	 * @Test the method parkCar(String, int). 
	 */
	@Ignore
	@Test
	public void testParkCar() {
		CarPark park = new CarPark(6);
		// Check parking in an empty car park
		assertEquals(0, park.parkCar("1", 2));
		String[] expectedSpaces = new String[] { "1", "1", null, null, null, null };
		assertTrue(Arrays.equals(expectedSpaces, park.spaces));
		
		// check parking another car
		assertEquals(2, park.parkCar("2", 3));
		expectedSpaces = new String[] { "1", "1", "2", "2", "2", null };
		assertTrue(Arrays.equals(expectedSpaces, park.spaces));
		
		// check parking when not enought space
		assertEquals(-1, park.parkCar("3", 2));
		expectedSpaces = new String[] { "1", "1", "2", "2", "2", null };
		
		// check parking resulting in the car park being full
		assertTrue(Arrays.equals(expectedSpaces, park.spaces));
		assertEquals(5, park.parkCar("4", 1));
		expectedSpaces = new String[] { "1", "1", "2", "2", "2", "4" };
		assertTrue(Arrays.equals(expectedSpaces, park.spaces));
	}

	/**
	 * @Test the method removeCar(String). 
	 */
	@Ignore
	@Test
	public void testRemoveCar() {
		CarPark park = new CarPark(6);
		
		// check removing a car that is not in the car park
		assertFalse(park.removeCar("1"));
		
		// check removing a car from the car park
		park.spaces = new String[] { "1", "1", null, "2", "2", "2" };
		String[] expectedSpaces = new String[] { "1", "1", null, null, null, null };
		assertTrue(park.removeCar("2"));
		assertTrue(Arrays.equals(expectedSpaces, park.spaces));
		
		// check emptying the car park
		assertTrue(park.removeCar("1"));
		expectedSpaces = new String[] { null, null, null, null, null, null };
		assertTrue(Arrays.equals(expectedSpaces, park.spaces));

		// check removing a car that is no longer in the car park
		assertFalse(park.removeCar("1"));

	}

}
