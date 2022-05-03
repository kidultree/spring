package day0406;

interface InterA {
	public void draw(); // 추상메서드
}

//interface가 interface를 상속받을 경우 extends (같은것(class간, interface간)끼리는 extends)
interface InterB extends InterA {
	public void play();
}

//class 에서 InterB를 구현할 경우 play뿐만 아니라 InterA가 가진것도 오버라이드 해야함
//InterB는 InterA를 상속받았기 때문!

class My1 implements InterB // (class랑 interface 상속 - implements)
{
	public void show() { 
		System.out.println("My1이 가진 메서드");
	}

	@Override
	public void draw() {
		System.out.println("draw");
	}

	@Override
	public void play() {
		System.out.println("play");
	}

}

public class Ex1Interface {

	public static void main(String[] args) {
		My1 a1 = new My1();
		a1.draw();
		a1.play();
		a1.show(); //My1만 가진 메서드면 My1로 선언해야 호출가능 

		System.out.println();

		InterB a2 = new My1();
		a2.draw();
		a2.play();

	}

}
