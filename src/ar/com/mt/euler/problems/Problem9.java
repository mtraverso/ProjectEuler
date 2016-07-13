package ar.com.mt.euler.problems;

public class Problem9 {
	public static void main(String[] args) {
		System.out.println(pythagoreanTriplet(1000));
	}
	
	public static int pythagoreanTriplet(int n){
		for(int a = 0; a< n/3;a++){
			for(int b = 0; b<n/2;b++){
				int c = n - a -b;
				if(((a*a)+(b*b)) == (c*c)){
					return a*b*c;
				}
			}
		}
		return -1;
	}
}
