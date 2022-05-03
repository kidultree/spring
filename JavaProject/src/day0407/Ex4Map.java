package day0407;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex4Map {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		// map에 k(key),v(value) 의 쌍으로 데이터 추가
		map.put("name", "김태희");
		map.put("age", "32");
		map.put("addr", "서울");
		map.put("name", "이소라"); // 같은 key일 경우 덮어쓴다.
		System.out.println(map.size());

		System.out.println("** 출력1 : key값으로 얻고자 할 경우 **");
		System.out.println("이름 :" + map.get("name"));
		System.out.println("나이 :" + map.get("age"));
		System.out.println("주소 :" + map.get("addr"));
		System.out.println("혈액형 :" + map.get("blood")); // 해당 key가 없을경우도 확인하기

		System.out.println("** 출력2 : key를 먼저 전체 얻은 후 해당 v값 출력 **");
		// key는 타입이 Set 타입 (비순차적이고 중복 X)
		Set<String> keys = map.keySet();
		for (String key : keys) {
			String v = map.get(key);
			System.out.println(key + ":" + v);
		}
	}

}
