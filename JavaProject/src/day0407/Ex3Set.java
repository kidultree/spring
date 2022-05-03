package day0407;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set의 특징 1. 비순차적(순서 중요X)  2. 중복데이터를 허용하지 않는다
public class Ex3Set {

	public static void main(String[] args) {
		// 명시한 타입만 넣을 수 있음
		// 제네릭 <String> : 문자열만 넣을 수 있다.
		Set<String> set = new HashSet<String>();
		set.add("apple");
		set.add("orange");
		set.add("banana");
		set.add("kiwi");
		set.add("apple"); // 중복된 것은 데이터 안들어감
		set.add("orange"); // 중복
		// set.add(100); //String이 아닌 경우 오류 발생

		System.out.println(set.size());

		System.out.println("출력 방법 1");
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println();
		
		System.out.println("출력 방법 2");
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}

	}

}
