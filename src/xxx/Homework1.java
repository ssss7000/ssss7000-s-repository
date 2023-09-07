package xxx;

public class Homework1 {

	public static void main(String[] args) {
// 第1題 請設計一隻Java程式，計算12，6這兩個數值的和與積
		int num1 = 12, num2 = 6;
		int addition = num1 + num2;
		int multiplication = num1*num2;
		System.out.println("第1題:和=" + addition + ", 積=" + multiplication );
		
// 第2題 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		int egg = 200, dozen = 12;
		int dozens = egg / dozen;
		int eggs = egg % dozen;
		System.out.println("第2題:" + dozens + "打" + eggs + "顆");
		
// 第3題 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int times = 256559, day = 86400 ,hour = 3600, minute = 60;
		int days = times / day;
		int hours = (times % day) / hour;
		int minutes = (times % day % hour) / minute;
		int seconds = times % day % hour % minute;
		System.out.println("第3題:" + days + "天" + hours + "小時" + minutes + "分" + seconds + "秒");
		// 256559/86400=2...83759
		// 83759/3600=23...959
		// 959/60=15...59
		
// 第4題 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		final double pi = 3.1415, r = 5;
		double area = r*r*pi;
		double circumference =2*r*pi;
		System.out.println("第4題(算法1):圓面積=" + area +", 圓周長=" + circumference );
		//答案的小數點位數, 圓面積有14位且最後一位, 圓周長有15位
		float pi1 = 3.1415f, r1 = 5;
		float area1 = r1*r1*pi1;
		float circumference1 =2*r1*pi1;
		System.out.println("第4題(算法2):圓面積=" + area1 +", 圓周長=" + circumference1 );
		//答案的小數點位數為正常長度, 沒有多餘位數
		
// 第5題 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本金加利息共有多少錢(用複利計算，公式請自行google)
		double principal = 1500000, interest = 0.02;
		double asset =principal*Math.pow(1 + interest, 10);
		//Math.pow(n, m) (計算某一數值n的m次方)(Math的M要大寫)
		System.out.println("第5題:本金加利息共" + asset + "元");
				
// 第6題 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
		System.out.println("第6題:");
		System.out.println(5 + 5);
        // 整數字面常數可以直接算術運算
		System.out.println(5 + '5');
		// '5'字元, 位階為char, 位階比short大但比int小, 所以5 + '5'時, '5'會轉為int
		// 資料來源:
		// https://www.techiedelight.com/zh-tw/conversion-between-char-and-int-java/
		// 將'5'字元字面常數利用以下方式轉換成整數字面常數
        //	char c = '5';
        //	int i = c;
        //	System.out.println(i);
		// 可得知'5'= 53
		// 故 5 + '5' = 5 + 53 = 58
		System.out.println(5 + "5");   
        //	資料來源:
		//  基礎java講義第208張投影片(課本104頁)
		//  https://www.techiedelight.com/zh-tw/convert-string-to-integer-java/
        	String str = 5 + "5";
        	int i = Integer.parseInt(str);
        	System.out.println(i);
		//  答案55, 並不是數字55, 左邊5是數字5, 右邊5是字串5
		
	}
}

