import javax.swing.JOptionPane;
public class SwitchCase {

	public static void main(String[] args) {
		/**
		 * @author Tristan
		 * Write an application to prompt the user to enter his/her role from the following choices.

*1. Administrator
*2. Faculty
*3. Staff
*4. Student
*5. Guest

*After the user entered his/her role, the program will display:

*Welcome <USER ROLE>! (The word USER ROLE will be replaced with the user input.)
		 */

		
		String input = JOptionPane.showInputDialog("Enter your role, please.");
		
			switch (input) {
			case "Administrator":
				System.out.println("Welcome, Administrator!");
				break;
			case "Faculty":
				System.out.println("Welcome, Faculty Member!");
				break;
			case "Staff":
				System.out.println("Welcome, Staff Member!");
				break;
			case "Student":
				System.out.println("Welcome, Student!");
				break;
			default:
				System.out.println("Welcome, Guest!");
				
			
			}
	}

}
