package ar.com.mt.euler.problems;


public class Problem5 {
	public static void main(String[] args) {
		System.out.println(smallestMultiple(20));
	}
	
	public static long smallestMultiple(int n){
		long multiple = 1;
		for(long i = 2;i<=n;i++){
			multiple *= i/gcd(i, multiple);
		}
		return multiple;
	}
	
	static long gcd(long a, long b) {
	    while ( 0 != b ) {
	        long temp = a;
	        a = b;
	        b = temp % b;
	    }

	    return a;
	}
	
}
