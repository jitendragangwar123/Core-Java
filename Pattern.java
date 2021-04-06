package maccess;
import java.util.*;
public class Pattern{

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter the Number");
			int n=sc.nextInt();
			for(int k=1;k<=n;k++) {
				for(int l=1;l<=k;l++) {
					System.out.print(l+" ");
					
				}
			
					System.out.print("\n");
			
				}
		}
	}
}

