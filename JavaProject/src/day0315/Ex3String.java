package day0315;

public class Ex3String {

	public static void main(String[] args) {
		
		String s1 = "Happy"; //���1
		String s2 = new String("Apple"); //���2
		System.out.println(s1);
		System.out.println(s2);
	
		int a = 5, b = 5;
		System.out.println(a==b);
		System.out.println(s1==s2); //==Ŭ����Ÿ�Կ����� �ּ� ��
		//���ڿ����� ���� ������ ���Ϸ��� equals �޼��� �̿�
		
		System.out.println(s1.equals("Happy"));
		System.out.println(s1.equals("happy"));
		System.out.println(s1.equals(s2));
		
		//��ҹ��� ������� ö�ڸ� ���� ���
		System.out.println(s1.equalsIgnoreCase("happy"));
		System.out.println(s2.equalsIgnoreCase("aPPle"));
	
		//���ڿ��� ���� ���ϱ�
		System.out.println(s1.length());
		
		//���ڿ��� ù���� ���ϱ�
		char startChar=s1.charAt(0);
		System.out.println(startChar); 
		//ex) HAPPY --> 01234
		
		//��ü�� ������ �빮�� Ȥ�� �ҹ��ڷ� ���
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		String s3="Have a Nice Day!!";
		System.out.println(s3.startsWith("Have"));
		System.out.println(s3.endsWith("Have"));
		System.out.println(s3.startsWith("Happy"));
		System.out.println(s3.endsWith("!"));

		
		
		
		
		
	
	}
}
