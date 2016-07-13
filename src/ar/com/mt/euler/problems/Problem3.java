package ar.com.mt.euler.problems;

public class Problem3 {
	public static void main(String[] args) {
		System.out.println(largestPrimeFactor(600851475143l));
	}
	
	public static double largestPrimeFactor(long n){
		for(long i = new Double(Math.sqrt(n)).longValue();i>=1;i--){
			if(n%i == 0 && isPrime(i)){
				return i;
			}
		}
		return -1;
	}
	
	private static boolean isPrime(double num) {
        if (num == 2 ) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
	}
	
}
