package day0317;

import java.util.Scanner;

public class Ex8ArrayMunje {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		String []members = {"���Ҷ�","����","��ȣ��","��ȿ��","�չ̳�",
				"���缮","�輺��","������","����","������"};
		
		String name;//�Է¹��� �̸�
		int cnt; //�ο��� ���� ����
		
		/*
		 * �˻��� �̸� : ����
		 * 		�������� 2��°�� �ֽ��ϴ�. //�迭�� +1�ؼ� ����ϱ�
		 * �˻��� �̸� : ������
		 * 		��������� ��ܿ� �����ϴ�.
		 * �˻��� �̸� : exit
		 * 		** �˻��� �����մϴ� **
		 */
		
		while(true) {
			cnt = 0;
			System.out.println("�˻��� �̸�:");
			name=sc.nextLine();
			if(name.equalsIgnoreCase("exit")) //����� ��ҹ��� ���������
					{System.out.println("** �˻��� �����մϴ� **");
					break;
					}
			
			for(int i=0;i<members.length;i++)
			{
				if(name.equals(members[i]))
				{
					System.out.println("\t"+name+"���� "+(i+1)+"�� °�� �ֽ��ϴ�");
					cnt=1; //ã�ұ� ������ 1! ��ã���� �ʱⰪ �״�� 0
					break;
			}
		}
			if(cnt==0) //��ã�� ���..=�ʱⰪ
				System.out.println("\t"+name+"���� ��ܿ� �����ϴ�");
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}
}
