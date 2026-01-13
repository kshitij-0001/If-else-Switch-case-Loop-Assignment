package if_else_switch_loop;
import java.util.Scanner;

public class PrintFirstNNaturalNumbers {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter numbers");
		int num=sc.nextInt();
		
		if(num>0) {
			for(int i=1;i<=num;i++) {
				System.out.println(i+ " ");
			}
		}
		else {
			System.out.println("INVALID number!");
		}
		
		
	}

}
