package xxx;

public class Homework10_1 {
//	請設計一隻程式，用亂數產生5個介於1～100之間的整數，而輸出結果可以判斷出這5個整數為是否
//	為質數(提示：Math類別)
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			int num = (int)(Math.random()*100 + 1);
			if(isPrimeNumber(num)) {
				System.out.println("第" + i + "個亂數" + num + "是質數");
			}else {
				System.out.println("第" + i + "個亂數" + num + "不是質數");
			}			
		}	
	}
	
	public static boolean isPrimeNumber(final int n) {
	    if (n % 2 == 0) {
	        return n == 2;
	    } else if (n > 2) {
	        final int nSqrt = (int) Math.floor(Math.sqrt(n));
	 
	        for (int i = 3; i <= nSqrt; i += 2) {
	            if (n % i == 0) {
	                return false;
	            }
	        }	 
	        return true;
	    } else {
	        return false;
	    }
	}
}
