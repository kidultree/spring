package day0316;

import java.util.Scanner;

public class Ex10For {

	public static void main(String[] args) {

		/*
		 * (��)
		 * 1. ������ ���ϱ�
		 * 2. ���� n������ �հ� ���ϱ�
		 * 3. ���� n������ ���丮�� ���ϱ�
		 * 4. ����
		 */
		
		Scanner sc=new Scanner(System.in);
		int menu;
		while(true)
		{
			System.out.println("1. ������ ���ϱ�");
			System.out.println("2. ���� n������ �հ� ���ϱ�");
			System.out.println("3. ���� n������ ���丮�� ���ϱ�");
			System.out.println("4. ����");
			
			menu=sc.nextInt();
			//4�ϰ�� ����
			if(menu==4) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
			switch(menu)
			{
			case 1: 
			{
				int x,y,r=1;         //�������� �� ,Ƚ��
				System.out.println("�������� ���� x,y �� ���� �Է�");
				x=sc.nextInt();
				y=sc.nextInt();
				for(int i=1;i<=y;i++)
				{
					r*=x;
				}
			System.out.println(x+"��"+y+"����"+r+"�Դϴ�");
			}
				
			break;
			
			case 2:
			{ 
			int a;
			int sum=0;
			
			System.out.println("�հ踦 ���� n�� �Է�");
			a=sc.nextInt();
			for(int i=1;i<=a;i++) {
				sum+=i;
			}
			
			System.out.println("1����"+a+"������ ����"+sum+"�Դϴ�.");
			
			}
			
			break;
			
			case 3:
			{
			 int n; 
			 int fac=1; //�ʱⰪ �� �����ϱ� 
			 
			 System.out.println("���丮���� ���� n�� �Է�");
			 n=sc.nextInt();
			 for(int i=1;i<=n;i++) 
			 { fac *= i;
			 }
				System.out.println(n+"�� ���丮�� ����"+fac+"�Դϴ�.");
			
			}
				
			break;
			
			default:
				System.out.println("**�޴��� �ٽ� �����ϼ���**");
			}
		 System.out.println();
		}
	}
}

