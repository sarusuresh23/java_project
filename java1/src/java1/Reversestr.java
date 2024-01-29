package java1;

public class Reversestr {

	public static void main(String[] args) {
		String s="2123";		
		StringBuilder sb=new StringBuilder(); 
		sb.append(s);
		sb=sb.reverse();
		System.out.println(sb);

	}

}
