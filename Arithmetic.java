package maccess;
import java.util.*;
public class Arithmetic{

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter the Number");
			int n=sc.nextInt();
			int m=sc.nextInt();
			System.out.println(n+m);
			System.out.println(n-m);
			System.out.println(n*m);
			System.out.println(n%m);
			System.out.println(n/m);
		}
	}
}



