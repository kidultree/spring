package day0404;

class Score {
	private int java;
	private int spring;

	// setter method
	public void setJava(int java) {
		this.java = java;
	}

	public void setSpring(int spring) {
		this.spring = spring;
	}

	// getter method
	public int getJava() {
		return this.java;
	}

	public int getSpring() {
		return spring;
	}
}

class Student {
	//��� ��������� �ʱⰪ�� ������� null�� �ʱⰪ
	
	private String name;
	public Score score = new Score(); //class�ȿ� class ���� ���

	// private�� name�� ���� setter & getter

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

public class Ex5Method {

	public static void main(String[] args) {
		Student stu=new Student();
		//�̸� ����
		stu.setName("������");
		//�� ������ ����
		stu.score.setJava(90);
		stu.score.setSpring(100);
		
		//��� (�̸�, �ڹ�����, ���������� ����غ���)
		System.out.println("�̸� : "+stu.getName());
		System.out.println("�ڹ����� : "+stu.score.getJava());
		System.out.println("���������� : "+stu.score.getSpring());
	
	}
}
