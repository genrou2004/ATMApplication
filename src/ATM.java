import java.util.Random;
import java.util.Scanner;

public class ATM extends Recepit{

	
	Scanner scan = new Scanner(System.in);
	Account account = new Account();
	Random random = new Random();
	
	int choice, count;
	double deposit, withdraw, currentBalance;
	String account_number, password, originalBalance ="error", userName;
	boolean foundNoDigit = false;
	
	public void accepetUserInput(){
		
		do{
			foundNoDigit = false;
            System.out.println("Please Enter Your Account Number: ");
            account_number = scan.next();

            System.out.println("Enter Your Password: ");
            password = scan.next();
            
            System.out.println("Enter your Name: ");
            userName = scan.next();

            originalBalance = account.validateUserInput(account_number, password);

            count++;

            if (count >= 3 && originalBalance.equals("error")){
                System.out.print("Maximum Login Attempts Reached.");
                System.exit(0);
            }
            if (!(originalBalance.equals("error"))){
            	System.out.println("\nYour Current Balance is:");
                 recepit(random.nextInt(100),account_number, userName, "Current Balance", 0.00, currentBalance=Double.parseDouble(originalBalance));
            }
            else
                System.out.println(originalBalance);


        }while(originalBalance.equals("error"));
		currentBalance=Double.parseDouble(originalBalance);
	}
	
	public void serviceType(){
	while(true){
		
		System.out.println("Choose 1 for Deposit");
		System.out.println("Choose 2 for Withdraw");
		System.out.println("Choose 3 to Check your Balance ");
		System.out.println("Choose 4 to EXIT");
		choice = scan.nextInt();
		
		switch(choice){
		
		case 1:
			System.out.println("Enter the amount of money you would like to Deposit");
			deposit = scan.nextDouble();
			currentBalance =  account.deposit(deposit, currentBalance);
			
			recepit(random.nextInt(100),account_number, userName, "Deposit", deposit, currentBalance);
			
			//System.out.printf("Your New Balance is $%.2f\n", currentBalance);
			System.out.println();
			break;
		case 2:
			System.out.println("Enter the amount you would like to withdraw: ");
			withdraw = scan.nextDouble();
			currentBalance = account.withdraw(withdraw, currentBalance);
				while(withdraw > currentBalance){
                    System.out.println("ERROR: INSUFFICIENT FUNDS!! "
                            + "PLEASE ENTER A DIFFERENT AMOUNT: $");
                    withdraw = scan.nextDouble();
                }
				currentBalance = account.withdraw(currentBalance, withdraw);
				recepit(random.nextInt(100),account_number, userName, "Withdraw", withdraw, currentBalance);
               // System.out.printf("your current balance is $%.2f\n: "+ currentBalance);
                System.out.println();
				
			break;
		case 3:
			recepit(random.nextInt(100),account_number, userName, "Balance", 0.00, currentBalance);
			System.out.printf("\nYour Current Balance is $%.2f\n", currentBalance);
			System.out.println();
			break;
			
		case 4: 
			System.out.println(" Thank you for Using our Application!");
			System.exit(0);
		
		}
	}
	}
}
