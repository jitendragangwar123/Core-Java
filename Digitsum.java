package maccess;
import java.util.*;
public class Digitsum{

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter the Number");
			int n=sc.nextInt();
            int sum=0;
            while(n>0) {
             int lastdigit=n%10;
             sum=sum+lastdigit;
            	n=n/10;
            	}
            System.out.println(sum);
            }
			
		}
				
				
	}


