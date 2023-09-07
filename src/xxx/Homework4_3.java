package xxx;

public class Homework4_3 {
	// 第3題
		// 有個字串陣列如下 (八大行星)：
		// {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
		// 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
		// (提示：字元比對，String方法)
	public static void main(String[] args) {
		String [] x = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int sum_a = 0, sum_e = 0, sum_i = 0, sum_o = 0, sum_u = 0;
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length(); j++) {
				switch(x[i].charAt(j)) {
				case 'a':
					sum_a += 1;
					break;
				case 'e':
					sum_e += 1;
					break;
				case 'i':
					sum_i += 1;
					break;
				case 'o':
					sum_o += 1;
					break;
				case 'u':
					sum_u += 1;
					break;
				}
			}			
		}		
		System.out.println("a母音:" + sum_a + "個");
		System.out.println("e母音:" + sum_e + "個");
		System.out.println("i母音:" + sum_i + "個");
		System.out.println("o母音:" + sum_o + "個");
		System.out.println("u母音:" + sum_u + "個");
	}		
}
