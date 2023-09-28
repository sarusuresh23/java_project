package java1;

public class Addanddisplay {
	
	    public static void main(String[] args) {
	    	int n=10;
	    	int m=30;
	    	int k=3;
	        for (n = 10; n <= m; n++) {
	            int digitSum = get(n);
	            if (digitSum == k) {
	                System.out.println(n);
	            }
	        }
	    }
	    public static int get(int number) {
	        int sum = 0;
	        while (number != 0) {
	            sum += number % 10;
	            number /= 10;
	        }
	        return sum;
	    }
	}



