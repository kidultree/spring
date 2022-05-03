package day0404;

public class Ex8Overloading {

	public static void write(String s) {
		System.out.println("���ڿ� " + s);
	}

	public static void write(String s1, String s2) {
		System.out.println("���ڿ� " + s1 + "," + s2);
	}

	public static void write(int s) {
		System.out.println("������ " + s);
	}

	public static void write(String[] s) {
		System.out.println("���ڿ��迭 ");
		for (String a : s)
			System.out.println(a);
	}

	// �հ踦 ���ϴ� overloading �޼���
	public static int sum(int a, int b) {
		return a + b;

	}

	public static double sum(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		write(100);
		write("���");
		write("red", "pink");
//		write("red","pink","orange"); //����

		String[] s = { "red", "orange", "pink", "green" };
		write(s);

		System.out.println("�հ�:" + sum(4, 5));
		System.out.println("�հ�:" + sum(1.2, 6.4));
//		System.out.println("�հ�:"+sum("red",5)); //����

	}

}
