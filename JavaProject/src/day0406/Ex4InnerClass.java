package day0406;

//Member ���� Ŭ����
class Outer{
	int a = 10;
	static int b = 20;
	
	//���� Ŭ����
	class Inner{
		int c = 30;
		//static int d = 40; //member ���� Ŭ�������� static ������ ���� �Ұ�
		
		public void disp() {
			System.out.println("a="+a);
			System.out.println("b="+b);
			System.out.println("c="+c);
			
		}
	}
	//�ܺ� Ŭ���� ����
	public void outerDsip()
	{
		//����Ŭ���� ����
		Inner in = new Inner();
		in.disp();
	}
}
public class Ex4InnerClass {

	public static void main(String[] args) {
		//�ܺ� Ŭ������ ���� �޼��� ȣ�� (�޼��忡�� ����Ŭ���� �����)
		Outer out = new Outer();
		out.outerDsip();
		System.out.println();
		//�ܺ� Ŭ������ �޼��带 ��ġ�� �ʰ� �ٷ�
		//���� Ŭ������ �޼��带 ȣ���ϰ��� �� ���
		
		Outer.Inner inner = new Outer().new Inner();
		inner.disp();

	}

}
