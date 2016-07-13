package ar.com.mt.euler.problems;

public class Problem4 {
	public static void main(String[] args) {
		System.out.println(palindromeNumber());
	}
	
	public static int palindromeNumber(){
		int low = 999;
		int high = 999;
		int max = 0;
		for(int j = high; j>=100;j--){
			for(int i = low;i>=100;i--){
				if(isPalindrome(j*i)){
					System.out.println(j+" "+i);
					max = j*i> max?j*i:max ;	
				}
			}
		}
		return max;
	}
	
	public static boolean isPalindrome(Integer number){
		String numberStr = number.toString();
		
		for(int i = 0; i<= numberStr.length()/2;i++){
			if(numberStr.charAt(i) != numberStr.charAt(numberStr.length()-1-i)){
				return false;
			}
		}
		return true;
	}
	
}
