package xxx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Homework8_2 {
	//請設計一個Train類別,並包含以下屬性:
	//- 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
	//- 目的地 dest,型別為String - 票價 price,型別為double
	//• 設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件,放到每小題
	//需使用的集合裡
	//- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
	//- (1254, “區間”, “屏東”, “基隆”, 700)
	//- (118, “自強”, “高雄”, “台北”, 500)
	//- (1288, “區間”, “新竹”, “基隆”, 400)
	//- (122, “自強”, “台中”, “花蓮”, 600)
	//- (1222, “區間”, “樹林”, 七堵, 300)
	//- (1254, “區間”, “屏東”, “基隆”, 700)
	
	public static void main(String[] args) {
// • 請寫一隻程式,能印出不重複的Train物件
		System.out.println("•請寫一隻程式,能印出不重複的Train物件");
		Set<Train> set1 = new HashSet<>();
		set1.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		set1.add(new Train(1254, "區間", "屏東", "基隆", 700));
		set1.add(new Train(118, "自強", "高雄", "台北", 500));
		set1.add(new Train(1288, "區間", "新竹", "基隆", 400));
		set1.add(new Train(122, "自強", "台中", "花蓮", 600));
		set1.add(new Train(1222, "區間", "樹林", "七堵", 300));
		set1.add(new Train(1254, "區間", "屏東", "基隆", 700));
		// Iterator
		Iterator<Train> it1 = set1.iterator();
		while(it1.hasNext()) {
			it1.next().getItem();
		}
		System.out.println("========================================================");
		// set 集合不能用 get()取得陣列內元素，因此不適合用 for迴圈
		// for-each
		for (Train fe: set1) {
			fe.getItem();
		}
		System.out.println("========================================================");
		System.out.println();
// • 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
		System.out.println("•請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出");
		List<Train> list1 = new ArrayList<>();
		list1.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		list1.add(new Train(1254, "區間", "屏東", "基隆", 700));
		list1.add(new Train(118, "自強", "高雄", "台北", 500));
		list1.add(new Train(1288, "區間", "新竹", "基隆", 400));
		list1.add(new Train(122, "自強", "台中", "花蓮", 600));
		list1.add(new Train(1222, "區間", "樹林", "七堵", 300));
		list1.add(new Train(1254, "區間", "屏東", "基隆", 700));
		// Iterator
		Collections.sort(list1);
		Iterator<Train> it2 = list1.iterator();
		while(it2.hasNext()) {
			it2.next().getItem();
		}
		System.out.println("========================================================");
		// for loop
		Collections.sort(list1);
		for(int i = 0; i < list1.size(); i++) {
			list1.get(i).getItem();
		}
		System.out.println("========================================================");
		// for-each
		Collections.sort(list1);
		for(Train fe: list1) {
			fe.getItem();
		}
		System.out.println("========================================================");
		System.out.println();
		System.out.println("• 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件");
		Set<Train> set2 = new TreeSet<>();
		set2.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		set2.add(new Train(1254, "區間", "屏東", "基隆", 700));
		set2.add(new Train(118, "自強", "高雄", "台北", 500));
		set2.add(new Train(1288, "區間", "新竹", "基隆", 400));
		set2.add(new Train(122, "自強", "台中", "花蓮", 600));
		set2.add(new Train(1222, "區間", "樹林", "七堵", 300));
		set2.add(new Train(1254, "區間", "屏東", "基隆", 700));
		// Iterator
		Iterator<Train> it3 = set2.iterator();
		while(it3.hasNext()) {
			it3.next().getItem();
		}
		System.out.println("========================================================");
		// set 集合不能用 get()取得陣列內元素，因此不適合用 for迴圈
		// for-each
		for(Train fe: set2) {
			fe.getItem();
		}
		
	}
}
