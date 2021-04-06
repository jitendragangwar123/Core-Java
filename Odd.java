package maccess;
import java.util.*;
public class Odd{

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter the Number");
			int n=sc.nextInt();
			int count=0;
		 xyz:
			for(int k=1;k<=n;k++) {
				if(n%k==0) {
					count++;
				if(count==3) {
					break xyz;
				}
				}
			}
				if(count==2) {
					System.out.println("Prime");
				}
				else {
					System.out.println("not prime");
			
				}
		}
	}
}

