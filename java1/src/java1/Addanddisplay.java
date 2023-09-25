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

	    // Function to calculate the sum of digits in a number
	    public static int get(int num) {
	        int sum = 0;
	        while (num != 0) {
	            sum += num % 10;
	            num /= 10;
	        }
	        return sum;
	    }
	}



