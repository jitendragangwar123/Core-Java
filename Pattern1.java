package maccess;
import java.util.*;
public class Pattern1{

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter the Number");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++) {
				for(int s=i;s<=n;s++) {
				System.out.print("  ");
				}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			
				for(int l=i-1;l>=1;l--) {
					System.out.print(l+" ");
					
				}
			
					System.out.print("\n");
			
				}
		}
	}
	}
	


