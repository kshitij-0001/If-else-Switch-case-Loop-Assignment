package if_else_switch_loop;
import java.util.Scanner;

public class Password_Length_Check {
	public static void main (String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Password length");
		int length=sc.nextInt();
		
		if(length>=8) {
			System.out.println("STRONG PASSWORD");
		}
		else {
			System.out.println("WEAK PASSWORD");
		}
		
	}

}
