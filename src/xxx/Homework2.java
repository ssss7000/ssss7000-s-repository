package xxx;

public class Homework2 {
	public static void main(String[] args ) {
		// 請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		int sum1 = 0;
		for(int i = 1; i <= 1000; i++ ) {
			if(i % 2 == 0 ) {
				sum1 = sum1 + i;
			}
		}
		System.out.println("第一題:" + sum1);
		
		// 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int sum2 = 1;
		for(int a = 1; a <= 10; a++) {
			sum2 *= a;
				}
		System.out.println("第二題:" + sum2);
		
		// 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		int sum3 = 1;
		int c = 1;
		while(c <= 10) {
			sum3 *= c++;
			
		}
		System.out.println("第三題:" + sum3);
		
		// 請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100
		int answer1;
		System.out.print("第四題:"); 
		for(int d = 1; d <= 10; d++ ) {
			answer1 = d*d;
			System.out.print(answer1 + " ");
			
		}
		System.out.println();
		// 阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		System.out.print("第五題:"); 
		for(int e = 1; e <= 49; e++ ){
			if(e % 4 != 0) {
				int sum4 = e;
				System.out.print(sum4 + " ");
			}
			
		}
		System.out.println();
//		請設計一隻Java程式，輸出結果為以下：
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
//	
		System.out.println("第六題:"); 
		for(int f = 10; f > 0;f--) {
			for(int g = 1; g <= f; g++) {
				int answer2 = g;
				System.out.print(answer2 + " ");
				
			}
			System.out.println();
		}
		
//		請設計一隻Java程式，輸出結果為以下：
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
		System.out.println("第七題:");
		for(char h = 'A'; h <= 'F'; h++) {
			for(char k = 'A'; k <= h; k++) {
				System.out.print(h);
			}
			System.out.println();
		}
	}
}
