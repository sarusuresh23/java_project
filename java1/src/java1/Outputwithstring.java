package java1;
import java.util.*;

public class Outputwithstring {

	public static void main(String[] args) {
		Scanner str=new Scanner(System.in);
		System.out.println("Enter your String: ");
		String input=str.nextLine();
		int []inc= new int [5];
		
		
		for(int j=0;j<input.length();j++) {
			char s=input.charAt(j);
			if(s=='a') {
				inc[0]++;
			}
			else if(s=='e') {
				inc[1]++;
			}
			else if(s=='i') {
				inc[2]++;
			}
			
			else if(s=='o') {
				inc[3]++;
			}
			else if(s=='u') {
				inc[4]++;
			
			}
			
			
			
			
			
		}
		str.close();
		System.out.println("a: "+inc[0]+"\n"+"e: "+inc[1]+"\n"+"i: "+inc[2]+"\n"+"o: "+inc[3]+"\n"+"u: "+inc[4]);

	}

}
