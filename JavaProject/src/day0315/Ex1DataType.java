package day0315;

public class Ex1DataType {

	public static void main(String[] args) {
		//�⺻�� ����
		char ch='A';
		char ch2='��';
		char ch3=67; //'C'
		char ch4=(char)(ch3+2);
		
		System.out.println(ch);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch3+2); //char+int=int
		System.out.println((char)(ch3+2)); //char�� ���
		
		int a = 7;
		int b = 4;
		System.out.println(a+b);
		System.out.println(a/b); //����� int 
		System.out.println((double)a/b); //a�� ����Ҷ��� double�� ��ȯ�ؼ� ���
		System.out.println((double)(a/b)); //�̹� (a/b)���� int�� ��� ����

	}

}
