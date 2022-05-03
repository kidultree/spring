package day0405;

abstract class Parent {
	// �߻�(abstract) �޼��带 �ϳ��� ���� �ִ°��
	// class�� abstractȭ ���Ѿ���
	// abstract Ŭ������ �Ϲ� �޼���� �߻� �޼��嵵 ��� ������ �����ϴ�

	// public void process() {
//		System.out.println("�θ� ���� �ϴ����� ����");
//	 }

	public void title() {
		System.out.println("�θ��� �ϴ� �� ó��");
	}

	// process�� �ϴ� ���� ������ �������̵带 ���ؼ� �޼��� ����� �ʿ���
	abstract public void process(); 
	// �̿ϼ��� �޼��� (abstract:�߻�ȭ)�� ������

}

//////////////////////////////////////
class ChildA extends Parent {

	@Override
	public void process() {
		System.out.println("����Ʈĥ�� �մϴ�");
	}
}

//////////////////////////////////////
class ChildB extends Parent {
	@Override
	public void process() {
		System.out.println("���� û�Ҹ� �մϴ�");
	}
}
/////////////////////////////////////

public class Ex7Abstract {

	public static void process(Parent p) {
		p.title(); //�θ��� ���� �޼��嵵 ȣ�� ����
		// ������ ó��
		p.process(); // �������̵�� �޼��常 ȣ���� ����(���� : �θ� ���� ��� ȣ�� ����)
	}

	public static void main(String[] args) {
		
		//process(new Parent()); - process �� �̿ϼ�(�߻�Ŭ����)�̱� ������ error
		//�߻� Ŭ������ ��ü ������ �� �� ����
		
		process(new ChildA());
		process(new ChildB());

	}

}
