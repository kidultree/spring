package day0315;

public class Ex6Operator {

	public static void main(String[] args) {
		
		System.out.println("**���������� ���� **");
		int a = 5, b = 5, x, y;
		x= a++; //��ġ����������
		y= ++b; //��ġ����������
		
		System.out.println(a+","+b);
		System.out.println(x+","+y); 

		a = b = x = 3;
		y = ++a+b--*++x;
		System.out.println(y); //16 
		
		a=3;
		System.out.println(a++); //3 : ��� �� ���� (�޸𸮿��� 4)
		System.out.println(++a); //5 : ���� �� ���
		
		
		System.out.println("** ���� ������ ���� **");
		a = 5;
		a+=3;
		System.out.println(a); //8
		a*=5;
		System.out.println(a); //40
		a-=2;
		System.out.println(a); //38
		a/=3;
		System.out.println(a); //12
		a%=5; //���� ������
		System.out.println(a); //2
		
		
		
		
	}

}