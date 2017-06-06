
public class Account implements iATM{

	private String account_number;
	private String user_name;
	private String PIN;
	private double balance;

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPIN() {
		return PIN;
	}

	public void setPIN(String pIN) {
		PIN = pIN;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public double deposit(double currentBalance, double depositAmt) {
		currentBalance = depositAmt + currentBalance;

		return currentBalance;
	}
	@Override
	public double withdraw(double curretnBalance, double withdrawAmount) {
		
		curretnBalance = curretnBalance - withdrawAmount;

		return curretnBalance;
	}
	@Override
	public void displayBalance(double currentBalance)
    {
        System.out.printf("\nYour Current Balance is $%.2f\n", currentBalance);
    }
	public static String validateUserInput(String accountNumber, String password)
    {
        String result = "error";
       
        String accountOne = "123456-5 password 1200.36";
        String accountTwo = "1234567-6 passwordtwo 560.20";
        String accountThree = "98765-0 anotherpassword 250.74";
       
        if (accountNumber.equals(accountOne.substring(0, accountOne.indexOf(" "))) && 
        		password.equals(accountOne.substring(accountOne.indexOf(" ")+1,accountOne.lastIndexOf(" "))))
            return result = accountOne.substring(accountOne.lastIndexOf(" ") + 1);

        if (accountNumber.equals(accountTwo.substring(0, accountTwo.indexOf(" "))) && 
        		password.equals(accountTwo.substring(accountTwo.indexOf(" ")+1,accountTwo.lastIndexOf(" "))))
            return result = accountTwo.substring(accountTwo.lastIndexOf(" ") + 1);

        if (accountNumber.equals(accountThree.substring(0, accountThree.indexOf(" "))) && 
        		password.equals(accountThree.substring(accountThree.indexOf(" ") + 1,accountThree.lastIndexOf(" "))))
            return result = accountThree.substring(accountThree.lastIndexOf(" ") + 1);

        return result;
    }

}
