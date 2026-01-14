package if_else_switch_loop;
import java.util.Scanner;

public class companyLoginValidation {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter Your Password hear! ");
		int inputpass=sc.nextInt();
		int correctpass=1234;
		
		for(int i=1;i<=3;i++) {
			if(inputpass==correctpass) {
				System.out.println("login successful!");
				return;
			}
			if(inputpass!=correctpass) {
				System.out.println("Password is incorrect,try Again...");
				inputpass=sc.nextInt();
			}
		}
		System.out.println("Account Locked");
	}
}
