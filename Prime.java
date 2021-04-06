package maccess;
import java.util.*;
public class Prime{

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter the two Number: ");
			int n=sc.nextInt();
	        int count=0;
	        xyz:
	        	for(int i=1;i<=n;i++) {
	        		if(n%i==0) {
	        			count++;
			if(count==3) {
				break xyz;
			}
	        		}
	        	}
			if(count==2) {
				System.out.println("prime");
			}
				else {
					System.out.println("not prime");
				}
			}
	        	}
	        
		}
	




