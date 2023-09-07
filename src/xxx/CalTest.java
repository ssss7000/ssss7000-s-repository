package xxx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		try {
			int[] inputnum = new int[2];
			Calculator Cal = new Calculator();
			Scanner Sc = new Scanner(System.in);
			System.out.println("請輸入X值");
			inputnum[0] = Sc.nextInt();
			System.out.println("請輸入Y值");
			inputnum[1] = Sc.nextInt();

			System.out.println(inputnum[0] + "的" + inputnum[1] + "次方為" + Cal.powerXY(inputnum[0], inputnum[1]));
		} catch (InputMismatchException e1) {
			System.out.println("輸入格式不正確");
		} catch (CalException e2) {
			System.out.println(e2.getMessage());
		} catch (Exception e3) {
			System.out.println(e3.getMessage());
		}
	}
}

