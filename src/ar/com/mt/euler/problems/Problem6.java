package ar.com.mt.euler.problems;

public class Problem6 {
	public static void main(String[] args) {
		System.out.println(sumDifference(100));
	}
	
	public static int sumDifference(int n){
		int sumSquares = 0;
		int sum = 0;
		for(int i =1 ; i<= n;i++){
			sumSquares += i*i;
			sum += i;
		}
		return (sum*sum) - sumSquares;
	}
}
