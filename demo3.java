package maccess;
import java.util.*;
public class demo3 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter the Number");
			int n=sc.nextInt();
			int i,r=0;
			while (n>0) {
				i=n%10;
				r=r*10+i;
				n=n/10;
			}
				System.out.print("reverse the number:"+r);
				
			
			
			
		}
				
				
	}

}
