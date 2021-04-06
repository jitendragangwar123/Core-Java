package maccess;
import java.util.*;
public class MinMax3{

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter the two Number: ");
			int n=sc.nextInt();
			int m=sc.nextInt();
		    int l=sc.nextInt();
		    
			int max=n>m && n>l? n:m>n&& m>l? m:l;
			
		
			int min=n<m && n<l ? n : m<n &&m<l ?m:l;
			
			
		      
		    	System.out.println("max:"+max+"  "+"min:" + min);
		    
		}
	}
}



