package if_else_switch_loop;
import java.util.Scanner;

public class EmployeePerformanceRating {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
	  System.out.println("Enter employee performance score");
	  int score=sc.nextInt();
	  
	  if(score>=50) {
		  if(score>=75) {
			  System.out.println("EXCELLENT");
		  }
		  else {
			  System.out.println("GOOD");
		  }
	   }
	  else {
		  System.out.println("NEED IMPROVEMENT");
	  }
	}

}
