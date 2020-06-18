package ex;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListTest {

	public static void main(String[] args) {
		// List<E> -> ArrayList<E>
		// List<E> : 저장 순서를 가진다. 데이터의 중복저장 가능
		// 순서 -> 일괄처리 -> 동일한 작업을 빠르게 처리
		
		// ArrayList 인스턴스 생성 : Integer 타입 객체만 
		// ArrayList<Integer> list = new ArrayList<Integer>();
		// ArrayList<Integer> list = new ArrayList<>();
		// List<Integer> list = new ArrayList<>();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		// List<E> 정의된 메소드
		// add(E) : 인스턴스의 참조값 저장
		// remove(index) : 해당 인덱스의 요소를 삭제
		// size() : List요소의 개수를 반환
		// get(index) : 해당 인덱스의 요소를 반환
		
		// 데이터의 저장
		list.add(new Integer(10));
		list.add(new Integer(20));
		list.add(new Integer(30));
		list.add(40); // Auto boxing
		
		// 데이터의 참조
		System.out.println("저장된 데이터를 확인합니다.");
		for(Integer number: list) {
			System.out.println(number);
		}
		
		// 데이터의 삭제
		System.out.println(list.get(0)+"삭제");
		list.remove(0);
		System.out.println(list.size());
		
		System.out.println("Iterator를 이용한 모든 요소 출력.");
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			int num = itr.next();
			System.out.println(num);
		}
	}

}
