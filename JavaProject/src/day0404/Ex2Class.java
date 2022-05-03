package day0404;

//아래 Apple은 같은 package 내에서만 쓸 수 있다!
//public class - 파일명과 같은 class만 생성 가능
class Apple {
	// 접근지정자 연습(같은 패키지 내에선 private을 제외하고 모두 접근 가능)
	int a = 10;
	protected int b = 20;
	private int c = 30;
	public int d = 40;

	public final static String MESSAGE = "Hello";

}

public class Ex2Class {

	public static void main(String[] args) {
		Apple a1 = new Apple();
		System.out.println(a1.a);
		System.out.println(a1.b);
//		System.out.println(a1.c); //error? private은 같은 클래스 내에서만 접근 가능
		System.out.println(a1.d);
		
		System.out.println(Apple.MESSAGE); //static 변수는 클래스 명으로 호출
		

	}

}
