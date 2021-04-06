package maccess;
import java.util.*;
public class MinMax{

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter the two Number: ");
			int n=sc.nextInt();
			int m=sc.nextInt();
		
			int max=n>m ? n:m;
			int min=n>m ? m:n;
			
			
		      
		    	System.out.println("max:"+max+"  "+"min:" + min);
		    
		}
	}
}



