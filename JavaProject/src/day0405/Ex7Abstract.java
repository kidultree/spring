package day0405;

abstract class Parent {
	// 추상(abstract) 메서드를 하나라도 갖고 있는경우
	// class도 abstract화 시켜야함
	// abstract 클래스는 일반 메서드와 추상 메서드도 모두 구현이 가능하다

	// public void process() {
//		System.out.println("부모가 딱히 하는일이 없음");
//	 }

	public void title() {
		System.out.println("부모만이 하는 일 처리");
	}

	// process가 하는 일은 없지만 오버라이드를 위해서 메서드 존재는 필요함
	abstract public void process(); 
	// 미완성의 메서드 (abstract:추상화)로 구현함

}

//////////////////////////////////////
class ChildA extends Parent {

	@Override
	public void process() {
		System.out.println("페인트칠을 합니다");
	}
}

//////////////////////////////////////
class ChildB extends Parent {
	@Override
	public void process() {
		System.out.println("집안 청소를 합니다");
	}
}
/////////////////////////////////////

public class Ex7Abstract {

	public static void process(Parent p) {
		p.title(); //부모만이 가진 메서드도 호출 가능
		// 다형성 처리
		p.process(); // 오버라이드된 메서드만 호출이 가능(예외 : 부모만 가진 경우 호출 가능)
	}

	public static void main(String[] args) {
		
		//process(new Parent()); - process 가 미완성(추상클래스)이기 때문에 error
		//추상 클래스는 객체 생성을 할 수 없음
		
		process(new ChildA());
		process(new ChildB());

	}

}
