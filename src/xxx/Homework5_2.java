package xxx;

public class Homework5_2 {
//	請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：
	public static void main(String[] args) {
		randAvg();
	}

	public static void randAvg() {
		int[] num = new int[10];
		double sum = 0;
		double avg = 0;
		System.out.print("本次亂數結果:");
		for (int i = 0; i < 10; i++) {
			num[i] = (int) (Math.random() * 101);
			System.out.print(num[i] + " ");
			sum += num[i];
		}
		avg = sum / num.length;
		System.out.println();
		System.out.println("平均值:" + avg);
	}

}
