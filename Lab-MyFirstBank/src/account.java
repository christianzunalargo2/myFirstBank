import java.util.Scanner;

public class account {

	String firstName = ""; 
	String lastName = "";
	private int balance = 0; 
	private int previousWithdrawal = 0;
	private int previousDeposit;
 
	
	public account(String firstName, String lastName) {
		// TODO Auto-generated constructor stub
		this.firstName = firstName; 
		this.lastName = lastName; 
	}

	public void showMenu() {
		// TODO Auto-generated method stub
		int option = 0; 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Welcome " + firstName + " " + lastName + "!"); 
		System.out.println("see our menu below"); 
		System.out.println("1. See my balance"); 
		System.out.println("2. Make a deposit");
		System.out.println("3. Withdraw cash"); 
		System.out.println("4. See latest transactions"); 
		System.out.println("5. Calculate accrued interest in 5/10/15 years? "); 
		System.out.println("6. Exit");
		System.out.println();
				
		do {
			System.out.println("What would you like to do today?");
			System.out.print("Please, select a number from our menu and enter it here -> ");

				int option1 = scanner.nextInt();
				option = option1;

			
			switch(option) {
			case 1:
				System.out.println("/////////////////////////////////////////////////");
				System.out.println();
				System.out.println("your balance is: ");
				System.out.println("$" + balance);
				System.out.println();
				System.out.println("/////////////////////////////////////////////////");
				break; 
			case 2:
				System.out.println("how much are you depositing? ");
				int amount = scanner.nextInt(); 
				deposit(amount); 
				System.out.println("/////////////////////////////////////////////////");
				System.out.println();
				System.out.println("thanks! Your new balance is: $" + balance); 
				System.out.println();
				System.out.println("/////////////////////////////////////////////////");
				break; 
			case 3: 
				System.out.println("how much are you taking out? "); 
				int withdrawal = scanner.nextInt(); 
				withdraw(withdrawal);
				System.out.println("/////////////////////////////////////////////////");
				System.out.println();
				System.out.println("thanks! Your new balance is: $" + balance);
				System.out.println();
				System.out.println("/////////////////////////////////////////////////");
				break; 
			case 4: 
				System.out.println("see below for your latest transactions ");
				transactions();  
				break; 	
			case 5:
				System.out.println("See your acrued interests below: ");
				interest(); 
				break; 
			case 6:
				System.out.println("/////////////////////////////////////////////////");
				break; 
			default:
				System.out.println("/////////////////////////////////////////////////");
				System.out.println();
				System.out.println("wrong number!");
				System.out.println();
				System.out.println("/////////////////////////////////////////////////");
				break; 
			}
			
		} while (option != 6);
		
		System.out.println("Thanks for banking with us!");
		System.out.println("/////////////////////////////////////////////////");
	}

	private void interest() {
		// This calculate your interest in 5/10/15
		double interestAccrued = this.balance; 
		System.out.println("/////////////////////////////////////////////////");
		System.out.println();
		System.out.println("Your current balance at %0.05 per year will be " + ((interestAccrued*5*0.05)+this.balance) + " in 5 years");
		System.out.println("Your current balance at %0.05 per year will be " + ((interestAccrued*10*0.05)+this.balance) +" in 10 years");
		System.out.println("Your current balance at %0.05 per year will be " + ((interestAccrued*15*0.05)+this.balance) +" in 15 years");
		System.out.println();
		System.out.println("/////////////////////////////////////////////////");
	}

	private void transactions() {
		// This shows my most recent transactions
		if(previousWithdrawal < 0 && previousDeposit > 0) {
			System.out.println("/////////////////////////////////////////////////");
			System.out.println();
			System.out.println("today's deposit was: $" + previousDeposit);
			System.out.println("today's withdrawal was: $" + previousWithdrawal);
			System.out.println("thus, your current balance is: $" + balance);	
			System.out.println();
			System.out.println("/////////////////////////////////////////////////");
		}
		
	}

	private void withdraw(int withdrawal) {
		// This enables me to withdraw money 
		this.balance = balance - withdrawal; 
		previousWithdrawal = -withdrawal;  
	}

	private void deposit(int amount) {
		// This makes my deposit
		if (amount !=0) {
			this.balance = balance + amount;
			previousDeposit = amount; 
		}
	}
	
	

}
