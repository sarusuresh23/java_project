package java1;
import java.util.*;

public class Printabc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		for(int i=0;i<=str.length();i++) {
			if(i%2!=0) {
				int y=Integer.parseInt(str.charAt(i)+"");
				for(int j=1;j<=y;j++) {
					System.out.print(str.charAt(i-1));
				}
			}
		}
		
		

	}

}
