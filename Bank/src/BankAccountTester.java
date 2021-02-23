import java.util.Scanner; 
public class BankAccountTester {

public static void main(String[] args) {
Scanner in = new Scanner(System.in);



{



		System.out.println("Enter starting balance for this account: "); 
		int starbBal = 0;
		Double startBal = in.nextDouble();
		BankAccount myBankAccount = new BankAccount(startBal);

         
  	
		
//Withdraw
		System.out.println("The amount that will be withdrawn from the account : ");
		double withdraw = in.nextDouble();
		myBankAccount.deposit(withdraw);
		
				
			
//Deposit
		 System.out.println("Enter the amount that will be deposited to the account : ");
		 double deposit = in.nextDouble();
		 myBankAccount.withdraw(deposit);
 
 
 //outcome
		 System.out.println("The balance of the account is: $" + myBankAccount.getBalance ());
		 
		 
	
		
				

		
				}
}
}


		