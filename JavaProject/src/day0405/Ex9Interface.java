package day0405;

//interface�� ����� �߻�޼��常 ������ �����ϴ�
interface InterA {
	int SPEED = 100; // final �����

	public void speedWrite(); // abstract �޼ҵ���
}

//�������̽��� �����ϴ� Ŭ���� - ������ override �ؾ���
class My implements InterA {
	@Override
	public void speedWrite() {
		// SPEED = 120; //����̹Ƿ� ������ �� �� ����
		System.out.println("���� ���ǵ�� " + SPEED + "�Դϴ�");
	}
}

public class Ex9Interface {

	public static void main(String[] args) {
		InterA a = new My();
		a.speedWrite();
	}
}
