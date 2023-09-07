package xxx;

import java.io.*;

public class Homework7_3 {
//	請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//	代表的檔案會複製到第二個參數代表的檔案

	public void CopyFile(String x, String y) throws IOException {
		
			File DIR = new File(x);
			FileInputStream IS = new FileInputStream(DIR);
			BufferedInputStream BIS = new BufferedInputStream(IS);
			File DOR = new File(y);
			FileOutputStream OS = new FileOutputStream(DOR, true);
			BufferedOutputStream BOS = new BufferedOutputStream(OS);

			int c;
			while ((c = BIS.read()) != -1) {
				BOS.write(c);
				System.out.print((char) c);
			}
				BOS.close();
				OS.close();
				BIS.close();
				IS.close();
			
	
	}

	public static void main(String[] args) throws IOException {
		Homework7_3 HW = new Homework7_3();
		HW.CopyFile("Copy1.txt","Copy2.txt");

	}
}
