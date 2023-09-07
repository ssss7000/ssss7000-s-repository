package xxx;

import java.util.Arrays;

import java.util.Scanner;

public class Homework3_1 {
	// 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形，如圖示結果：
	// (提示：Scanner，三角形成立條件，判斷式if else)
	// (進階功能：加入直角三角形的判斷)
	
	public static void main(String[] args ) {	
		System.out.println("請輸入三邊長:");
		Scanner sc = new Scanner(System.in);
//		int input[]=new int[3];
//		for(int i=0;i<3;i++)
//			input[i]=sc.nextInt();		

		double[] x = new double[3];
		x[0] = sc.nextInt();
		x[1] = sc.nextInt();
		x[2] = sc.nextInt();
		Arrays.sort(x);
		boolean a = x[0] + x[1] <= x[2];
		boolean b = x[0] == x[1] && x[1] == x[2];
		boolean c = x[0] == x[1] || x[1] == x[2];
		boolean d = x[2]*x[2] == x[1]*x[1] + x[0]*x[0];
		
		if(a) {
			System.out.println("不是三角形");
		}else if(b){
			System.out.println("正三角形");
		}else if(c) {
			if (d) {System.out.println("等腰直角三角形");
			}else {
			System.out.println("等腰三角形");
			}
		}else if(d) {
			System.out.println("直角三角形");
		}else {
			System.out.println("不等邊三角形");
		}
		sc.close();
	}	
}
