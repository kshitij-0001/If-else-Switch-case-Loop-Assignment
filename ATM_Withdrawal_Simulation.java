package if_else_switch_loop;
import java.util.Scanner;

public class ATM_Withdrawal_Simulation {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("account balance: ");
		int balance=sc.nextInt();
		
		System.out.print("Withdrawal amount: ");
		int withdrawal=sc.nextInt();
		
		if(balance >=1000) {
			if(balance>=withdrawal) {
				System.out.println("Amount withdrawal Successfuly "+withdrawal+" Rs");
				
				int amount=balance-withdrawal;
				System.out.println("Account Balance is "+amount+" Rs");
			}
			else {
				System.out.println("INSUFFICIENT BALANCE");
			}
			
		}
		else {
			System.out.println("Invalid amount");
		}
	}

}
