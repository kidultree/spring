package day0316;

import java.util.Scanner;

public class Ex8ForGugu {

	public static void main(String[] args) {
		/*
		 * ������ ���ڸ� �Է¹޾� �ش� ���� ����Ͻÿ� (�ݺ�)
		 * �� 0 �Է½� ����
		 * while�� �ȿ� for���� �̿��ؼ� ������ ����ϱ�
		 */
		
		Scanner sc=new Scanner(System.in);
		int dan;
		while(true)
		{ //������ �Է� 
			System.out.println("������ �Է�:");
			dan=sc.nextInt();
			
		//0�� ��� break
			if (dan==0)
				break;
			
		//2~9�� �ƴ� ��� �ٽ� �Է�(continue)
			if(!(dan>=2&&dan<=9)) //! --> not
			{
				System.out.println("** �ٽ� �Է����ּ��� **");
				continue; //�ٽ� ó������
			}
			
		//�� ���� ���
			System.out.println(dan+"��");
			
		//for���� �̿��ؼ� ������ ���
			for(int i=1;i<=9;i++)
			{System.out.println(dan+"x"+i+"="+dan*i);
			
		}
	}
}
}