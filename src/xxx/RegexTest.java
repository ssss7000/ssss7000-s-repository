package xxx;

import java.util.Scanner;

public class RegexTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tel = sc.next();
		
		String regx = "[A-Za-z][12]\\d{8}$";
		
		if (tel.matches(regx)) {
			System.out.println("OK");
		}else {
			System.out.println("No good...");
		}
	}
}
