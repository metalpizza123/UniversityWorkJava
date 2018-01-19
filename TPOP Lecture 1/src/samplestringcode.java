/**
 * 
 */

/**
 * @author Julian
 *
 */
public class samplestringcode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words="I am a String";
		char firstLetter=words.charAt(0);
		int numberOfCharacters = words.length();
		boolean contains_am=words.contains("am");
		int firstPositionOfS= 				words.indexOf('S');
		String aWord= words.substring(firstPositionOfS, numberOfCharacters);
		System.out.println(aWord);
		boolean compareString=aWord.equals("String");
		System.out.println(contains_am
				);
		
	}

}
