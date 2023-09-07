package xxx;

import java.util.Iterator;
import java.math.BigInteger;
import java.util.ArrayList;
//• 請建立一個Collection物件並將以下資料加入:
//Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//Object物件、“Snoopy”、BigInteger(“1000”)
//
//• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//• 移除不是java.lang.Number相關的物件
//• 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功

public class Homework8_1 {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));


//		使用iterator
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("========================================");
		// 使用for
//		for (Iterator it2 = list.iterator(); it2.hasNext();) {
//			System.out.println(it2.next());
//		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("========================================");
		// for_each
		for (Object fe : list) {
			System.out.println(fe);
		}
		System.out.println("========================================");
//		移除不是java.lang.Number相關的物件

		for (int i = 0; i < list.size();) {
			if (!(list.get(i) instanceof Number)) {
				list.remove(list.get(i));
			} else {
				i++;
			}
		}
		System.out.println(list);

	}
}
