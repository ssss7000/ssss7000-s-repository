package xxx;

import java.util.Scanner;

public class Homework4_5 {
	

	// 第5題
	// 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
	// 例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
	// (提示1：Scanner，陣列)
	// (提示2：需將閏年條件加入)
	// (提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
	
	

	public static void main(String[] Args) {
		System.out.println("輸入三個整數");
		Scanner sc = new Scanner(System.in);
		int [] input = new int[3];
		for(int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		int [] md = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(0 < input[0] && 0 < input[1] && input[1] <= 12 && 0 < input[2] && input[2] <= md[input[1] - 1]) {
			if(input[0] % 100 == 0 && input[0] % 400 == 0){
				System.out.println("輸入的日期為該年第" + TotalDay(29, input[1], input[2]) +"天" );
			}else if(input[0] % 4 == 0) {
				System.out.println("輸入的日期為該年第" + TotalDay(29, input[1], input[2]) +"天" );
			}else {
				if(input[2] == 29) {
					System.out.println("錯誤輸入");
				}else {
					System.out.println("輸入的日期為該年第" + TotalDay(28, input[1], input[2]) +"天" );
				}
			}
		}else {
			System.out.println("錯誤輸入");
		}
		sc.close();
	}
	
	static int TotalDay(int F, int input1,int input2){
		int sum = 0, total = 0;
		int [] md = {31, F, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int i = 0; i < input1 - 1; i++) {
			sum += md[i];
		}
		total = sum + input2;
		return total;
	}
}
