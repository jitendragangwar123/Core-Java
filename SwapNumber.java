package maccess;
import java.util.*;
public class SwapNumber{

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter the Number");
			int n=sc.nextInt();
			int m=sc.nextInt();
		      /*int temp;
		      temp=n;
		      n=m;
		      m=temp;18*/
			n=n+m;
			m=n-m;
			n=n-m;
			
		      
		    	System.out.println(n+"     "+m);
		    
		}
	}
}



