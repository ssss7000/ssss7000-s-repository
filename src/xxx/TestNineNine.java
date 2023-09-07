package xxx;

public class TestNineNine {
// 請建立一個TestNineNine.java程式，可輸出九九乘法表
	

//	一：使用for迴圈+ while迴圈
	public static void main(String[] args) {
		System.out.println("一：使用for迴圈+ while迴圈");
		int i, j;
		for (i = 1; i <= 9; i++) {
			j = 0;
			while (j < 9) {
				j++;
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
//	public static void main(String[] args) {
//		System.out.println("一：使用for迴圈+ while迴圈");
//		int i = 1, j = 0;
//		for(i = 1; i <= 9; i++) {
//			while (j < 9) {
//				j++;
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
		}
		System.out.println();
//	二：使用for迴圈+ while迴圈		
		System.out.println("二：使用for迴圈+ do while迴圈");
		int  a, b;
		for (a = 1; a <= 9; a++) {
			b = 1;
			do {
				System.out.print(a + "*" + b + "=" + a*b + "\t");
				b++;
			}
			while (b <= 9);
			System.out.print("\n");
		}
		System.out.println();
		
//	三：使用while迴圈+ do while迴圈		
		System.out.println("三：使用while迴圈+ do while迴圈");
		int c = 0;
		while (c < 9) {
			c++;
			int d = 0;
			do {
				d++;
				System.out.print(c + "*" + d + "=" + c*d + "\t");
			}
			while(d < 9);
			System.out.print("\n");
		}
		
	}
}
