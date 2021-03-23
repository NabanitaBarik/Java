package day_7;

import java.util.Random;

class Account{
	Thread t;
	public Account(Thread t) {
		this.t = t;
	}
	void trnsaction() {
		int credit_upperbound = 900;
		int debit_upperbound = 500;
		Random random = new Random();
		int initial_balance = 5000;
		int total_balance = 0; 
		//int credit = random.nextInt(); int debit = random.nextInt();
		int credit  = random.nextInt(credit_upperbound);
		int debit = random.nextInt(debit_upperbound);
		
		for(int i=1;i<=10;i++) {
			
			if(i==1) {
				total_balance = initial_balance + credit;
				System.out.print(" "+total_balance);
				try {
					Thread.sleep(2000);
				}catch(Exception e) {
					e.printStackTrace();
				}
				}
			
			else if(i%2!=0) {
				total_balance = total_balance + credit;
				System.out.print(" "+total_balance);
				try {
					Thread.sleep(2000);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			else if(i%2==0)
			{
				total_balance = total_balance - debit;
				System.out.println(" "+total_balance);
				try {
					Thread.sleep(2000);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
	} 
}
public class CreditDebitTransactionThread extends Thread {

	public static void main(String[] args) {
		Thread t = new Thread();
		t.start();
		Account a =  new Account(t);
		a.trnsaction();
	}

}
