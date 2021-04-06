package maccess;
import java.util.*;
public class Avgofnum{

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter the Number");
			int n=sc.nextInt();
			float avg=0,sum=0;
			for(int i=1;i<=n;i++) {
				sum=sum+i;
			
			}
			avg=sum/n;
			System.out.println(avg);
			
				
				
			
			
			
		}
				
				
	}

}
