package day0405;

class Color {
	private String colorName;

	Color() {
		// System.out.println("super ����Ʈ ������");
	}

	Color(String colorName) {
		this.colorName = colorName;
		// System.out.println("super 2��° ������");
	}

	// ����ϴ� �޼���
	public void write() {
		System.out.println("�ڵ�����:" + colorName);
	}
}

///////
class Red extends Color {

	private String myCar;

	Red() {
//		super(); 
//		�θ��� ����Ʈ ������ ȣ�� - �����Ǿ�����

//		super("���"); //���ڰ� �ִ� �����ڴ� �����ȵ�, �ݵ�� ù��
//		System.out.println("sub ����Ʈ ������");
	}

	Red(String myCar, String colorName) {
		super(colorName);
		this.myCar = myCar;

	}

	@Override
	public void write() {
		super.write(); //���� ��� ����, ���� ��ó���� �ؾ��� ��� ���� �ۼ�.. 
		System.out.println("�� �� �̸�:" + myCar);
	}
}

public class Ex4Inheritance {

	public static void main(String[] args) {

		Red r1 = new Red();
		r1.write();
		System.out.println("-------------");
		Red r2 = new Red("�ҳ�Ÿ", "�����޻�");
		r2.write();
	}

}
