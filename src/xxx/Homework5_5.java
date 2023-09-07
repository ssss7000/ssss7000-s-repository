package xxx;

public class Homework5_5 {
//	身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//	genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//	與數字的亂數組合
	public static void main(String[] args) {
		genAuthCode();
	}

	public static void genAuthCode() {
		char[] a = new char[8];

		for (int i = 0; i < a.length; i++) {
			int tep = (int) (Math.random() * 122) + 1;
//			48-57、 65-90、97-122
			if (tep >= 48 && 57 >= tep || tep >= 65 && 90 >= tep || tep >= 97 && 122 >= tep) {
				a[i] = (char) tep;
				System.out.print(a[i]);
			} else {
				i--;
			}

		}
	}

}
