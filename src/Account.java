
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
	public static String validateUserInput(String acctNum, String pwd)
    {
        String result = "error";
       
        String a = "123456-5 password 1200.36";
        String b = "1234567-6 passwordtwo 560.20";
        String c = "98765-0 anotherpassword 250.74";
       
        if (acctNum.equals(a.substring(0, a.indexOf(" "))) && 
                pwd.equals(a.substring(a.indexOf(" ")+1,a.lastIndexOf(" "))))
            return result = a.substring(a.lastIndexOf(" ") + 1);

        if (acctNum.equals(b.substring(0, b.indexOf(" "))) && 
                pwd.equals(b.substring(b.indexOf(" ")+1,b.lastIndexOf(" "))))
            return result = b.substring(b.lastIndexOf(" ") + 1);

        if (acctNum.equals(c.substring(0, c.indexOf(" "))) && 
                pwd.equals(c.substring(c.indexOf(" ") + 1,c.lastIndexOf(" "))))
            return result = c.substring(c.lastIndexOf(" ") + 1);

        return result;
    }

}
