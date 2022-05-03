package day0405;

//������ ó�� : method�� �����ؾ���
//A = �θ� B = �ڽ� // A = new B --> ������ ó��

class SuperObj {
	public void process() {
		System.out.println("super �θ� �������� ���� ó����");
	}
}

////////////////////////////////////////////////
class Draw extends SuperObj // overriding
{
	@Override
	public void process() {
		super.process(); //�θ� ���� ���� ó���ؾ� �Ұ�� �־���
		System.out.println("���� �׸��� �׷���!!!");
	}
}

//////////////////////////////////////////////
class Game extends SuperObj {
	@Override
	public void process() {
		super.process();
		System.out.println("���� ������ �ؿ�!!!");
	}
}

//////////////////////////////////////////////
public class Ex6Inheritance {

	public static void process(SuperObj obj){
		obj.process();
	}
	
	public static void main(String[] args) {
//		SuperObj obj = null; //�ʱ�ȭ ���� ����
//		obj = new Draw();
//		obj.process(); //�ڽ� class(Draw)�� ���� process�� ȣ��
//		
//		obj = new Game();
//		obj.process();//Game�� ���� process�� ȣ��
		
		process(new Draw()); // �׸� �׸��� ���� ó�� 
		process(new Game()); // ���ӿ� ���� ���� ó��
		

	}
}
