package day0315;

public class Ex2DataType {

	public static void main(String[] args) {
		
		byte b1 = 127;
		byte b2 = (byte)129;
		System.out.println(b1);
		System.out.println(b2); //���̳ʽ��� ���(2�� ����)
		float f1 = 123.564564f;//f�� ���̸� 4����Ʈ�� float�� ����ȴ�
		double d1 = 123.564564;
		System.out.println(f1); //�Ҽ��� ���� 8�ڸ�
		System.out.println(d1); // ���� 15�ڸ�
		
		boolean b = true;
		System.out.println(b);
		System.out.println(!b);
		//printf�� ��ȯ��ȣ�� �̿��ؼ� ����� �� ���
		//���� :%d, �Ǽ�"%f, ����:%c, ���ڿ�:%s
		
		System.out.printf("f1=%7.1f,d1=%7.2f",f1,d1);
		char ch='A';
		System.out.printf("ch=%c", ch);
		System.out.printf("\nch=%c\n",ch); //\n:����, \t:1��
		
		
		System.out.println("Red" + "Blue");
		//" ��ü�� ����Ϸ��� \" �̷��� ����.
		
		
		
		System.out.println(("\"Red\",\"Blue\""));
	
	
	
		//������ ��θ� ��Ÿ�� �� /�� �ǰ� \�� �ȴ�.
		System.out.println("c:\\image\\sun.jpg");
		System.out.println("c:/image/sun.jpg");
		
	}
}







