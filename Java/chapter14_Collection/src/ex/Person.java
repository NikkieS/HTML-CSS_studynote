package ex;

import java.util.Iterator;
import java.util.TreeSet;

public class Person implements Comparable<Person> {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void showData() {
		System.out.println("이름: "+this.name+", 나이: "+this.age);
	}

	@Override
	public int compareTo(Person o) {
//		int result = 0;
		
//		if(this.age>o.age)
//			result = 10000;
//		else if(age<o.age)
//			result = -1;
//		
//		return result;
		
		// 오름차순
		int resultA = this.age-o.age;
		// 내림차순
		int resultD = (this.age-o.age)*-1;
		
		return resultA;
	}
	
	public static void main(String[] args) {
		TreeSet<Person> tree = new TreeSet<Person>();
	
		tree.add(new Person("Son", 27));
		tree.add(new Person("King", 30));
		tree.add(new Person("Lee", 20));
		
		// 객체의 참조값을 저장해준다.
		Iterator<Person> itr = tree.iterator();
		
		while(itr.hasNext()) {
			itr.next().showData();
		}
	}
}
