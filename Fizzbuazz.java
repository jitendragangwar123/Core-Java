package maccess;
import java.util.*;
public class Fizzbuazz{

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter the Number");
			int n=sc.nextInt();
            for(int i=1;i<=n;i++) {
            	if(i%3==0) {
            		System.out.print("Fizzz");
            		
            	}
            	else if(i%5==0) {
            		System.out.print("Buzz");
            	}
            	else if(i%3==0 && i%5==0) {
            		System.out.print("FizzzBuzz");
            	}
            	else {
            		System.out.print(i+" ");
            	}
            }
			
		}
				
				
	}

}
