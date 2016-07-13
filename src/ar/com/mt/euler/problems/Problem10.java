package ar.com.mt.euler.problems;

public class Problem10 {
	public static void main(String[] args) {
		System.out.println(sumPrimes(2000000));
	}
	
	private static long sumPrimes (int n){
		long result = 0;
		for(int i = 2; i<n;i++){
			if(isPrime(i)){
				System.out.println(i);
				result+=i;
			}
		}
		return result;
	}
	
	private static boolean isPrime(int n){
		if(n == 2 ) return true;
		if(n %2 == 0) return false;
		for(int i = 3; i*i<=n; i+=2){
			if(n % i == 0) return false; 
		}
		return true;
	}
}
