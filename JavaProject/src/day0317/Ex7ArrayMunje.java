package day0317;

import java.util.Scanner;

public class Ex7ArrayMunje {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


		/*����: ���� �Է��ϸ� �ش� ���� ���� ����� ����ϰ�
		 * �� ������� ����ϱ�
		 * 
		 * ��) �˻��� ��: ��
		 * 			1: ����
		 * 			3: ��ȿ��
		 /			9: ������
		  *�� 3��
		  *�˻��� �� : ��
		  *�ھ����� ����
		  *�˻��� �� : ��        //equals ���
		  * *** �����մϴ� ***
		
		  * String�� startsWith ���
		  *
		  */
		
		String []members = {"���Ҷ�","����","��ȣ��","��ȿ��","�չ̳�",
				"���缮","�輺��","������","����","������"};
		
		String name;//�Է¹��� �̸�
		int cnt; //�ο��� ���� ����
		
		while(true)
		{
			
			cnt = 0;
			System.out.print("�˻��� ��:");
			name=sc.nextLine();
			if(name.equals("��"))
			{System.out.println("** ���α׷��� �����մϴ� **");
			break;
			}
			
			for(int i=0;i<members.length;i++)
			{
				if(members[i].startsWith(name)) //�ش� ������ ������ ��� true
				{
					System.out.println(i+":"+members[i]);
					cnt++;
				}
			}
		if (cnt ==0) //�ش� �ȵǴ� ��� ������ �ȵǾ 0��
			System.out.println(name+"�� ���� ����!");
		else
			System.out.println("�� "+cnt+"��");
		System.out.println();	
	
		}
		
		
	
		
	}

}
