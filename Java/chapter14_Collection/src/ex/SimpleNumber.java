package ex;

import java.util.HashSet;
import java.util.Iterator;

class SimpleNumber {
	int num;
	public SimpleNumber(int n) {
		num=n;
	}
	public String toString() {
		return String.valueOf(num);
		// static 메소드인 valueOf는 기본 자료형 데이터를 String 인스턴스로 변환
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		// num의 값을 비교
		if(obj instanceof SimpleNumber) {
			SimpleNumber sm = (SimpleNumber)obj;
			result = this.num == sm.num;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		HashSet<SimpleNumber> hSet = new HashSet<SimpleNumber>();
		
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(20));
		hSet.add(new SimpleNumber(20));
		
		System.out.println("저장된 데이터 수: "+hSet.size());
		
		Iterator<SimpleNumber> itr=hSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
