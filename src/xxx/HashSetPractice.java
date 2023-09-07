package xxx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractice {
	public static void main(String[] args){
		Set<Integer> set = new HashSet<>();
		while(set.size() != 6) {
			int r = (int)(Math.random()*49 + 1);
			set.add(r);
		}
		Iterator<Integer> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

}
