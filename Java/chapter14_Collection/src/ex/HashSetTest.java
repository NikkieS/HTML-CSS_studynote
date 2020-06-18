package ex;

import java.util.HashSet;

import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		// HashSet<String> set = new HashSet<>();
		// Set<String> set = new HashSet<>();
		
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("First");	// 동일값은 저장되지 않는다
		
		System.out.println(set.size());
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			// next() 시작점의 다음점부터 출력
			System.out.println(itr.next());
		}
		
		
	}
}
