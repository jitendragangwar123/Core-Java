package maccess;
import java.util.*;
public class SecondMax{

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter the two Number: ");
			int n=sc.nextInt();
			int m=sc.nextInt();
		    int l=sc.nextInt();
		    
			int max=n>m||n<m && n>l||n<l? n:m>n||m<n && m>l||m<l? m:l;
			
			
			
		      
		    	System.out.println("max:"+max);
		    
		}
	}
}



