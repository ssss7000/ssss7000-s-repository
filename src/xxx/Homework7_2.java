package xxx;

import java.io.*;

public class Homework7_2 {
	
//	請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡
//	(請使用append功能讓每次執行結果都能被保存起來)
	public static void main(String[] args) {
		try {

			FileWriter FW = new FileWriter("C:\\THA103_Workspace\\Java-1\\JavaTest\\Data.txt",true);
			BufferedWriter BW = new BufferedWriter(FW);
			PrintWriter PS = new PrintWriter(BW);
			

			for (int i = 1; i <= 10; i++) {

				PS.print(((int) (Math.random() * 1000)) + 1 + " ");
				
			}PS.print("\n");

			System.out.println("傳輸完畢!");
			PS.close();
			BW.close();
			FW.close();
		} catch (IOException ioe) {
			System.out.println("傳輸失敗!");
		}

	}
}