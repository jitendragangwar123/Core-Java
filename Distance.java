package maccess;
import java.util.*;
public class Distance{

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter the Number: ");
	        float x1=sc.nextFloat();
	        float x2=sc.nextFloat();
	        float y1=sc.nextFloat();
	        float y2=sc.nextFloat();
	        float l=x2-x1;
	        float m=y2-y1;
	         double d=Math.sqrt(l*l+m*m);
	        
				System.out.printf("%.3f",d);
	
				}
			}
	        	}
	        
		
	




