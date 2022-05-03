package day0404;

class Person {
	String name;
	String addr;
}

public class Ex6CallBy {

	public static void changeInt(int a) {
		a = 10;
	}

	public static void changeArray(int[] a) {

		a[2] = 25;
	}

	public static void changePerson(Person p) {
		p.addr = "제주도";
	}

	//String은 클래스 타입이지만 값이 전달된다
	public static void changeString(String s)
	{
		s="apple";
	}
	
	public static void main(String[] args) {
		int n = 10;
		changeInt(n); // n값을 전달 (call by value)
		System.out.println(n);

		int []arr = { 1, 5, 10 }; // 배열은 무조건 레퍼런스 타입(객체로 인식)
		changeArray(arr); // 주소를 전달, call by reference
		for(int a : arr)
			System.out.println(a);

		Person p = new Person();
		p.name = "홍길동";
		p.addr = "서울";

		changePerson(p); // 주소를 전달, call by reference
		System.out.println(p.name + "," + p.addr);
		
		String s = "orange";
		changeString(s);
		System.out.println(s);

	}

}
