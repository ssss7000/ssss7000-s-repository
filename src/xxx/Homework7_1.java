package xxx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
public class Homework7_1 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\THA103_Workspace\\Java-1\\homework\\Sample.txt");
		FileReader FR1 = new FileReader(file);
		FileReader FR2 = new FileReader(file);
		BufferedReader BR1 = new BufferedReader(FR1);
		BufferedReader BR2 = new BufferedReader(FR2);
		long len = file.length();

		int count = 0;
		int x;
		while ((x = BR1.read()) != -1) {

			count++;
		}

		int count2 = 0;
		String y;
		while ((y = BR2.readLine()) != null) {

			count2++;
		}
		System.out.println("Sample.txt檔案共有" + len + "個位元組," + count + "個字元" + count2 + "列資料。");
	}
}