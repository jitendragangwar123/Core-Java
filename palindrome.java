package maccess;
import java.util.*;
public class palindrome{

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter the Number");
			int n=sc.nextInt();
			int i,r=0,k=n;
			while (n>0) {
				i=n%10;
				r=r*10+i;
				n=n/10;
			}
			if(r==k)
			{
				System.out.println("palindrome number");
			}else {
				System.out.println("not palindrome number");
			}
				
				
			
			
			
		}
				
				
	}

}
