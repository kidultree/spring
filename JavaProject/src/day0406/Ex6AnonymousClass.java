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
		System.out.println("hello: �͸� ����Ŭ�������� ������!");
		}
	}; 
	// �߻�Ŭ����, interface�� new ���� �ȵ�..
	// anonymous inner class���� ���� ����

	
	InterAnony ia = new InterAnony() {
		@Override
		public void process() {
			System.out.println("process: �͸� ���ο��� ������!");
		}
	};

	public static void main(String[] args) {
		Ex6AnonymousClass ex = new Ex6AnonymousClass();
		ex.aa.hello();
		ex.ia.process();

	}
}
