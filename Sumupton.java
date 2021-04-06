package maccess;
import java.util.*;
public class Sumupton{

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter the  Number: ");
			int n=sc.nextInt();
			/*long sum =0;
			for(int i=1;i<=n;i++) {
				sum=sum+i;
				}
		
		System.out.println(sum);
			}
		}
	
}*/
			
			long sum=0;
			for(int i=1;i<=n;i++) {
				if(i%2!=0) {
					sum=sum+i;
			
				}
			}
			System.out.println(sum);
			}
			
			
		}
		}	

