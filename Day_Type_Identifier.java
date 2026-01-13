package if_else_switch_loop;
import java.util.Scanner;

public class Day_Type_Identifier {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the choice");
		System.out.println("1 = MONDAY");
		System.out.println("2 = TUESDAY");
		System.out.println("3 = WENESDAY");
		System.out.println("4 = THRUSDAY");
		System.out.println("5 = FRIDAY");
		System.out.println("6 = SATURDAY");
		System.out.println("7 = SUNDAY");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("WORKING DAY");
			break;
			
		case 2:
			System.out.println("WORKING DAY");
			break;
		case 3:
			System.out.println("WORKING DAY");
			break;
		case 4:
			System.out.println("WORKING DAY");
			break;
		case 5:
			System.out.println("WORKING DAY");
			break;
		case 6:
			System.out.println("WEEKEND");
			break;
		case 7:
			System.out.println("WEEKEND");
			break;
		default:
			System.out.println("INVALID CHOICE YOU ENTER !");
		}
	}

}
