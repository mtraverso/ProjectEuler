package ar.com.mt.euler.problems;

public class Problem7 {
	public static void main(String[] args) {
		System.out.println(nthPrime(10001));
	}
	
	public static int nthPrime(int n){
		int count = 0;
		for(int i = 0; i< Long.MAX_VALUE; i++){
			if(isPrime(i)){
				if(count == n){
					return i;
				}
				count++;
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
