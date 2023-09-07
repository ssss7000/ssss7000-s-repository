package xxx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class Homework7_4_5 {
//	請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
//	意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
//	承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何(請利用多
//	型簡化本題的程式設計)
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f1 = new File("C:\\data");
		File f2 = new File("C:\\data\\Object.ser");

		if (!f1.exists()) {
			f1.mkdir();
		}

		Cat[] c = new Cat[2];
		c[0] = new Cat("加菲貓");
		c[1] = new Cat("橘貓");

		Dog[] d = new Dog[2];
		d[0] = new Dog("柯基");
		d[1] = new Dog("金毛");



		FileOutputStream fos = new FileOutputStream(f2);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		for (int i = 0; i < c.length; i++) {
			oos.writeObject(c[i]);
			oos.writeObject(d[i]);
		}

		oos.close();
		fos.close();
		
		
		//輸入
		
		FileInputStream fis = new FileInputStream(f2);
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			while (true) {
				((Cat) ois.readObject()).speak();
				((Dog) ois.readObject()).speak();
				System.out.println("--------------------");
			}
		} catch (Exception e) {
			System.out.println("資料讀取完畢！");
		}
		
		
		
		ois.close();
		fis.close();
		}
		
	}
