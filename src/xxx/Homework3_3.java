package xxx;

import java.util.Scanner;

public class Homework3_3 {
	// 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
	// 厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
	// 的號碼與總數，如圖：
	// (提示：Scanner)
	// (進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)
	public static void main(String[] args) {
		System.out.println("阿文，請輸入不想要的數字");
		Scanner sc = new Scanner(System.in);
		int hatenum = sc.nextInt();

		if (0 < hatenum && hatenum < 10) {
			int count = 0;
			System.out.println("整數1~49篩選後可選的數字：");
			for(int i = 1; i < 50; i++) {
				if((i % 10) == hatenum) {
				}else if((i / 10) == hatenum) {
				}else {
					if(count != 0 && count % 6 == 0) {
						System.out.println();
					}
					if(i < 10) {
						System.out.print(i + "  ");
					}else {
						System.out.print(i + " ");
					}
					count++;
				}
			}
			System.out.println("總共" + count + "個數字");
			System.out.println();
			
			System.out.println("整數1~49篩選後亂數印出6個不重複的號碼：");
			int[] desirednum = new int[6];
				for (int i = 0; i < desirednum.length;) {
					int random = (int) (Math.random() * 49 + 1);
					if ((random % 10) == hatenum || (random / 10) == hatenum) {
						continue;
					}else if(random == desirednum[0] || random == desirednum[1] || random == desirednum[2] || random == desirednum[3] || random == desirednum[4] || random == desirednum[5]) {
						continue;
					} else {
						desirednum[i] = random;
						System.out.print(desirednum[i] + " ");
						i++;
					}
				}
				System.out.println();
		} else {
			System.out.print("輸入錯誤，請輸入1~9整數");
		}
		sc.close();
	}
}
