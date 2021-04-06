package maccess;
import java.util.*;
public class Factorial{

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter the Size: ");
	        int n=sc.nextInt();
	        System.out.println( fact(n));
		}
	}
	      public static int fact(int num) {
	       if(num==0) {
	    	   return 1;
	       }
	    	   else if(num==1) {
	    		  return 1;
	    		   
	    	   }
	    	   else{
	    		  return num * fact(num-1);
	    		   
	    		   
	    	   
	        }
	 
	        	
	        	
	    	}
	        	
	        
}
	




