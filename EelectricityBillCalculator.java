package if_else_switch_loop;
import java.util.Scanner;

public class EelectricityBillCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your units: ");
		int units=sc.nextInt();
		
		if(units>=0 && units<=200) {
			if(units>100) {
				int total=units * 7;
				System.out.println("Total Bill Amount is: "+total);
			}
			else {
				int total=units * 5;
				System.out.println("Total Bill Amount is: "+total);
			}
		}
		else {
			int total=units * 10;
			System.out.println("Total Bill Amount is: "+total);
		}
	}

}