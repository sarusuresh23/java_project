package java1;
import java.lang.*;
import java.util.Scanner;
public class excephandling {



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		try {
		int integer=sc.nextInt();
		System.out.println("Integer is:"+integer);

	}
		catch(Exception e) {
			System.out.println("Invalid integer");
			
			
		}

}
}