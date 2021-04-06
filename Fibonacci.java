package maccess;
import java.util.*;
public class Fibonacci{

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter the Number");
			int n=sc.nextInt();
			int i=0,j=1,s=0;
			for(int k=1;k<=n;k++) {
				System.out.print(s+" ");
				i=j;
				j=s;
				s=i+j;
			}
				
				
			
			
			
		}
				
				
	}

}
