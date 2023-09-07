package xxx;

import java.util.Scanner;

public class Homework3_2 {
//	請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息，如圖示結果：
//	(提示：Scanner，亂數方法，無窮迴圈)
//	(進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)	
	public static void main(String[] args ) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = (int)(Math.random()*101);
		System.out.println("請輸入0~100整數");
		
		for(;;) {
			int b = sc.nextInt();
			if(a == b) {
				System.out.println("答對了!答案是" + a);
				break;
			}
			else if(a < b) {
				System.out.println("答錯了，大於答案");
				continue;
			}
			else{
				System.out.println("答錯了，小於答案");
				continue;
			}
		}			
	}	
}
