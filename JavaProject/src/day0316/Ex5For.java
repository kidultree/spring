package day0316;

public class Ex5For {

	public static void main(String[] args) {

		int a;
		for(a=1;a<=5;a++) // for�� �ٷ� �ڿ� ; ���� ����! ����� �޶���
		{ 
		System.out.printf("%3d",a);	
	}
		System.out.println();
		for(a=5;a>=1;a--)
		{
			System.out.printf("%3d",a);
		}
		System.out.println();
		for(a=1;a<=20;a+=3) //���������� �Ӹ� �ƴ϶� ���Կ����ڵ� �����ϴ�.
		{
			System.out.printf("%3d",a);
		}
		System.out.println();
		System.out.println("1���� 100���� �� ¦���� �� ���ϱ�");
		int sum=0; //�ʱⰪ ����
		for(a=1;a<=100;a++)
		{
			if(a%2==1) //Ȧ���� ���
				continue; //������(a++)���� �������� 
			else
				sum+=a;
			}
		System.out.println(sum);
		}
	}