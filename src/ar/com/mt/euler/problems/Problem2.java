package ar.com.mt.euler.problems;

public class Problem2 {
	public static void main(String[] args) {
		System.out.println(fibonacci());
	}
	
	private static int fibonacci(){
		int x = 0;
		int y = 1;
		int z;
		int sum = 0;
		do{
			z = x+y;
			x = y;
			y = z;
			if(z %2 == 0){
				sum += y;
			}
		}while(y <= 4000000);
		return sum;
	}
}
