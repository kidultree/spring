package day0317;

public class Ex3Array {

	public static void main(String[] args) {

		char []ch;
		ch=new char[4];
		System.out.println("length="+ch.length);
		
		System.out.println("** �ʱⰪ ��� **");
		for(int i=0;i<ch.length;i++) //i<=ch.length '����'�ָ� ���� �ȵ�! 4-->0 1 2 3
		{
			System.out.println((int)ch[i]);
		}
		
		ch[0]='A';
		ch[1]=67; //�ƽ�Ű�ڵ� (char�ϱ�)
		ch[2]=90;
		ch[3]='*';
		
		System.out.println("** �迭 ��� ��� 1");
		for(int i=0;i<ch.length;i++){
			System.out.printf("%3c",ch[i]); //"%3c"-->3�ڸ� char
		}
		
		System.out.println();
		System.out.println("** �迭 ��� ��� 2");
		for(char a:ch) //�� ch �迭���� �ϳ��� ������ ��(Ƚ����ŭ �ڵ����� �ݺ�)
			System.out.printf("%3c",a);
		
	}

}
