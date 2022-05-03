package day0406;

interface InterA {
	public void draw(); // �߻�޼���
}

//interface�� interface�� ��ӹ��� ��� extends (������(class��, interface��)������ extends)
interface InterB extends InterA {
	public void play();
}

//class ���� InterB�� ������ ��� play�Ӹ� �ƴ϶� InterA�� �����͵� �������̵� �ؾ���
//InterB�� InterA�� ��ӹ޾ұ� ����!

class My1 implements InterB // (class�� interface ��� - implements)
{
	public void show() { 
		System.out.println("My1�� ���� �޼���");
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
		a1.show(); //My1�� ���� �޼���� My1�� �����ؾ� ȣ�Ⱑ�� 

		System.out.println();

		InterB a2 = new My1();
		a2.draw();
		a2.play();

	}

}
