package day0404;

//�Ʒ� Apple�� ���� package �������� �� �� �ִ�!
//public class - ���ϸ�� ���� class�� ���� ����
class Apple {
	// ���������� ����(���� ��Ű�� ������ private�� �����ϰ� ��� ���� ����)
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
//		System.out.println(a1.c); //error? private�� ���� Ŭ���� �������� ���� ����
		System.out.println(a1.d);
		
		System.out.println(Apple.MESSAGE); //static ������ Ŭ���� ������ ȣ��
		

	}

}
