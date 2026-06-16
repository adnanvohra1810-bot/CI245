package chapter9;

public class Lab09_TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account myAcc = new Account(1122, 20000);
		
		myAcc.setAnnualInteresestRate(0.045);
		
		myAcc.withdraw(2500);
		
		myAcc.deposit(3000);
		
		System.out.println("Balnce:             $ " + myAcc.getBalance() );
		System.out.println("Monthly intrest :   $ "+ myAcc.getMonthlyInteresest() );
		System.out.println("Account Create Date:"  + myAcc.getDateCreated() );
	
	}

}
