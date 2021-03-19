import javax.swing.JOptionPane;

public class myFirstBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fname = JOptionPane.showInputDialog("What's your first name? "); 
		String lname = JOptionPane.showInputDialog("what's your last name? ");
		
		account mainMenu = new account(fname, lname); 
		
		mainMenu.showMenu();
		
	}

}
