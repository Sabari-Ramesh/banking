package banking;

import java.util.Scanner;

public class bankingapplication {
	public static void main(String[] args) { 
		BankAccount object =new BankAccount("daniel","ABC012345678910");
		object.showmenu();
		
					}

}
class BankAccount{
	int balance;
	int previousTranscation;
	String customberName;
	String customberId;

	
	 BankAccount(String cname,String cid) {
		 customberName =cname;
		 customberId=cid;
	 }
		
	
	
	void deposit(int amount) {
		if(amount!=0) {
			balance = balance+amount;
			previousTranscation = amount; 
		}
	}
	void withdraw(int amount) {
		if(amount!=0) {
			balance = balance-amount;
			previousTranscation = -amount; 
		}
	}
	void getpreviousTranscation() {
		if(previousTranscation>0) {
			System.out.println("deposited : "+ previousTranscation);
		}
		else if(previousTranscation<0) {
			System.out.println("withdraw : "+Math.abs(previousTranscation));
		}
		else {
			System.out.println("no transcation occured");
		}
		}
		void showmenu() {
			char option ='\0';
			Scanner scanner = new Scanner(System.in);
			System.out.println("Welcome "+  customberName );
			System.out.println("Your ID "+customberId);
			System.out.println("\n");
			System.out.println("A :check your balance");
			System.out.println("B :Deposit");
			System.out.println("C :Withdraw");
			System.out.println("D :Previsious Trancation");
			System.out.println("E :Exit the system");
			do {
				System.out.println("-------------------------------------------------------------------------------------------");
				System.out.println("enter your option");
				System.out.println("-------------------------------------------------------------------------------------------");
				option = scanner.next().charAt(0);
				System.out.println("\n");
				switch(option) {
				case 'A':
					System.out.println("___________________________________________________");
					System.out.println("Balance : "+balance);
					System.out.println("----------------------------------------------------");
					System.out.println("\n");
					break;
				case 'B':
					System.out.println("___________________________________________________");
					System.out.println("enter amount to deposit : ");
					System.out.println("----------------------------------------------------");
					int amount= scanner.nextInt();
					deposit(amount);
					System.out.println("\n");
					break;
				case 'C':
					System.out.println("___________________________________________________");
					System.out.println("enter amount to Withdraw : ");
					System.out.println("----------------------------------------------------");
					int amount2= scanner.nextInt();
					withdraw(amount2);
					System.out.println("\n");
					break;
				case 'D':
					System.out.println("___________________________________________________");
					getpreviousTranscation();
					System.out.println("___________________________________________________");
					System.out.println("\n");
					break;
				case 'E':
					System.out.println("###################################################################");
					break;
				default:
					System.out.println("invalid option : please enter the correct option...");
					break;
				}
			}
			while(option!='E');
			System.out.println("THANK YOU FOR USING OUR SERVICE");
		}
		
}
