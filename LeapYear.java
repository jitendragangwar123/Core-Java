package maccess;
import java.util.*;
public class LeapYear{

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter the two Number: ");
			int n=sc.nextInt();
			if(n%400==0) {
				System.out.println("true");
				
			}
			else if(n%100==0) {
				System.out.println("false");
				
			}
			else if(n%4==0) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
		}
	}
}



