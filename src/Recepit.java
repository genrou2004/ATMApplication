import java.util.Date;

public abstract class Recepit {
	
	Date date = new Date();
	public void recepit(int random, String accountNumber, String userName, String transType, double transAmount, double currentBalance){
		
		System.out.println("+--------------------------------------------+");	
		System.out.println("|      CapitalOne Bank ATM Receipt           |");
		System.out.println("|"+     date   +                            "|");
		System.out.println("|      ATM Location # "+random             +"|");
		System.out.println("|                                            |");
		System.out.println("|                                            |");
		System.out.println("|     Account Number: "+   accountNumber   +"|");
		System.out.println("|     Customer:    "+      userName        +"|");
		System.out.println("|     Transaction Type:"+  transType       +"|");
		System.out.println("|     Transaction Amount:"+transAmount     +"|");
		System.out.println("|     Account Balance: "+  currentBalance  +"|");
		System.out.println("|                                            |");
		System.out.println("|      Thank you for banking with us         |");
		System.out.println("|            Have a coffee day               |");
		System.out.println("|                                            |");
		System.out.println("+--------------------------------------------+");
		
		
	}

}


/*System.out.println("+--------------------------------------+");
System.out.println("|      Java Bank ATM Receipt           |");
System.out.println("|      Wednesday, December 2, 2015     |");
System.out.println("|      ATM Location # 123              |");
System.out.println("|                                      |");
System.out.println("|                                      |");
System.out.println("|      Account Number:      1234567    |");
System.out.println("|      Customer:     John Q. Public    |");
System.out.println("|      Transaction Type:    Deposit    |");
System.out.println("|      Transaction Amount:  $500.00    |");
System.out.println("|      Account Balance:   $1,500.00    |");
System.out.println("|                                      |");
System.out.println("|      Thank you for banking with us   |");
System.out.println("|            Have a coffee day         |");
System.out.println("|                                      |");
System.out.println("+--------------------------------------+");*/