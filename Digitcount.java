package maccess;
import java.util.*;
public class Digitcount{

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter the Number");
			int n=sc.nextInt();
            int count=0;
            while(n>0) {
            count++;
            	n=n/10;
            	}
            System.out.println(count);
            }
			
		}
				
				
	}


