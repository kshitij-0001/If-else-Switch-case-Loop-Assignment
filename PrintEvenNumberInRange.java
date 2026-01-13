package if_else_switch_loop;
import java.util.Scanner;

public class PrintEvenNumberInRange {
public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter numbers");
		int num=sc.nextInt();
		
			for(int i=2;i<=num;i+=2) {
				System.out.println(i+ " ");
			}
	}

}
