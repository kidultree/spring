package day0404;
//Getter & Setter - private �ν��Ͻ� �ʵ忡 ���� ����

public class Ex4Method {

	private String name;
	private int age;

	// setter method : �� ����� �ʿ��� �޼���
	public void setName(String name) {
//		name //������ ���� ��� String name���� �ν�
//		this.name = name; //this.�� �νĽ������ ���� private�� �ν�

		this.name = name; // ���ڰ� ���� �̸��� ��� ��� ������ �տ� �ݵ�� this�� ���δ�
	}

	public void setAge(int age) {
		this.age = age;
	}

	// getter method : ��� ���� ���� ��ȯ�ϱ� ���� �޼���
	public String getName() {
		return this.name; // this�� �������� (���� �ȿ� ���� �̸� ���)
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Ex4Method ex1 = new Ex4Method();
		ex1.setName("�̱���");
		ex1.setAge(25);

		Ex4Method ex2 = new Ex4Method();
		ex2.setName("������");
		ex2.setAge(26);

		System.out.println("�̸� :" + ex1.getName());
		System.out.println("���� :" + ex1.getAge());
		System.out.println();

		System.out.println("�̸� :" + ex2.getName());
		System.out.println("���� :" + ex2.getAge());
	}

}
