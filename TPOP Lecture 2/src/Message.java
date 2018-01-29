/**
 * 
 */

/**
 * @author Julian
 *
 */
public class Message {

	/**
	 * @param args
	 */
		private String message;
		
		public Message(String message) {
			this.message =message;
		}
		
		public String toString(){
			return "this is a message:" +this.message;
		}
		void printMessage(){
			System.out.println(this);
		}
		void Append(String b) {
			
		}
		public Message append(String m) {
			message += m;
			return this;
		}
		public static void main(String[] args) {
			Message m = new Message("test");
			Message m1= new Message ("anotha one");
			System.out.println(m.toString());
			System.out.println(m1.toString());
			m.append(" in").append(" progress");
			System.out.println(m.toString());
		}

}
