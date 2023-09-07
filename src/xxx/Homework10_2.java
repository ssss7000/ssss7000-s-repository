package xxx;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Homework10_2 {
//	請設計一隻程式，讓使用者可以輸入一個任意數後，可以選擇要以下列何種表示方法顯示(1)千分位
//	(2)百分比(3)科學記號，而輸入非任意數會顯示提示訊息如圖(提示： TestFormatter.java, Java API
//	文件, 判斷數字可用正規表示法)
//	• 補充(依此類推)：
//	輸入12345，千分位為12,345，輸入123，千分位為123
//	輸入0.75，百分比為75%，輸入1，結果為100%
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入數字：");
		String num1 = sc.next();
		
		if(num1.matches("^[+-]?\\d*[.]?\\d*$")) {
			System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號：");
			int num2 = sc.nextInt();
			double num11 = Double.parseDouble(num1);
			if(num2 == 1) {
				Format thousandths = new DecimalFormat("#,###.####");
				System.out.println(thousandths.format(num11));
			}else if(num2 == 2) {
				Format percentage = new DecimalFormat("0.#%");
				System.out.println(percentage.format(num11));
			}else if(num2 == 3) {
				Format scientificNotation = new DecimalFormat("0.#E0");
				System.out.println(scientificNotation.format(num11));
			}else {
				System.out.println("數字格式不正確，請再輸入一次!");
			}
		}else {
			System.out.println("數字格式不正確，請再輸入一次!");
		}
		sc.close();
	}
}
