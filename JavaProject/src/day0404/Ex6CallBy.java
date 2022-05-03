package day0404;

class Person {
	String name;
	String addr;
}

public class Ex6CallBy {

	public static void changeInt(int a) {
		a = 10;
	}

	public static void changeArray(int[] a) {

		a[2] = 25;
	}

	public static void changePerson(Person p) {
		p.addr = "���ֵ�";
	}

	//String�� Ŭ���� Ÿ�������� ���� ���޵ȴ�
	public static void changeString(String s)
	{
		s="apple";
	}
	
	public static void main(String[] args) {
		int n = 10;
		changeInt(n); // n���� ���� (call by value)
		System.out.println(n);

		int []arr = { 1, 5, 10 }; // �迭�� ������ ���۷��� Ÿ��(��ü�� �ν�)
		changeArray(arr); // �ּҸ� ����, call by reference
		for(int a : arr)
			System.out.println(a);

		Person p = new Person();
		p.name = "ȫ�浿";
		p.addr = "����";

		changePerson(p); // �ּҸ� ����, call by reference
		System.out.println(p.name + "," + p.addr);
		
		String s = "orange";
		changeString(s);
		System.out.println(s);

	}

}
