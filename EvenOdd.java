package maccess;
import java.util.*;
public class EvenOdd{

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter the Number");
			int n=sc.nextInt();
		    if(n%2==0) {
		    	System.out.println("Even Number");
		    }
		    else {
		    
			System.out.println("odd Nmuber");
		}
	}
}


}
