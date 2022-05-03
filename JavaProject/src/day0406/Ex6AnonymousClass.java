package day0406;

abstract class AbstA {
	abstract public void hello();
}

interface InterAnony {
	public void process();
}

public class Ex6AnonymousClass {
	AbstA aa=new AbstA(){

	@Override public void hello(){
		System.out.println("hello: 익명 내부클래스에서 구현함!");
		}
	}; 
	// 추상클래스, interface는 new 원래 안됨..
	// anonymous inner class에서 구현 가능

	
	InterAnony ia = new InterAnony() {
		@Override
		public void process() {
			System.out.println("process: 익명 내부에서 구현함!");
		}
	};

	public static void main(String[] args) {
		Ex6AnonymousClass ex = new Ex6AnonymousClass();
		ex.aa.hello();
		ex.ia.process();

	}
}
