package day0405;

//interface는 상수와 추상메서드만 구현이 가능하다
interface InterA {
	int SPEED = 100; // final 상수임

	public void speedWrite(); // abstract 메소드임
}

//인터페이스를 구현하는 클래스 - 무조건 override 해야함
class My implements InterA {
	@Override
	public void speedWrite() {
		// SPEED = 120; //상수이므로 값변경 할 수 없음
		System.out.println("나의 스피드는 " + SPEED + "입니다");
	}
}

public class Ex9Interface {

	public static void main(String[] args) {
		InterA a = new My();
		a.speedWrite();
	}
}
