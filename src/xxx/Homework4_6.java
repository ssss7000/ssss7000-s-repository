package xxx;

public class Homework4_6 {
	// 第6題
		// 班上有8位同學，他們進行了6次考試結果如下：
		// { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
		// { 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
		// { 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 }
		// 請算出每位同學考最高分的次數
	public static void main(String[] args) {
		int[][] test = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		int[] maxnum = new int[6];
		int[] maxstu = new int[6]; // 每次考試最高分的同學
		int[][] stu = { { 1, 2, 3, 4, 5, 6, 7, 8 }, { 0, 0, 0, 0, 0, 0, 0, 0 } };

		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				if (maxnum[i] < test[i][j]) {
					maxnum[i] = test[i][j];
					maxstu[i] = j + 1;
				}
			}
		}

		a:for (int i = 0; i < maxnum.length; i++) {
			for (int j = 0; j < stu[1].length; j++) {
				while (maxstu[i] == stu[0][j]) {
					stu[1][j]+=1;
					continue a;
				}
			}
		}
		for (int i = 0; i < stu[1].length; i++) {
			System.out.println("第" + (i+1) + "位同學考最高分次數:" + stu[1][i]);
		}
	}
}
