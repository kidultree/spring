package day0315;

import java.util.Scanner;

public class Ex11Ddi {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int year; //�¾�⵵
		String ddi; //�� ����
		//�¾ ������ �Է��ϸ� �ش��ϴ� �츦 ����ϴ� ���α׷� ����
		//if�� ���� ���ϰ� ���� �����ڷε� ���ϱ�
		//��Ʈ : ���� 1���� �߶��̴�
		
		System.out.println("�¾ �⵵��?");
		year=sc.nextInt();
		
		// if�� ���
		if((year%12)==0)
			ddi="������";
		else if(year%12==1)
			ddi="��";
		else if(year%12==2)
			ddi="��";
		else if(year%12==3)
			ddi="����";
		else if(year%12==4)
			ddi="��";
		else if(year%12==5)
			ddi="��";
		else if(year%12==6)
			ddi="��";
		else if(year%12==7)
			ddi="�䳢";
		else if(year%12==8)
			ddi="��";
		else if(year%12==9)
			ddi="��";
		else if(year%12==10)
			ddi="��";
		else
			ddi="��";
		
		System.out.println( year+"����� �����" + ddi +"�� �Դϴ�");
		
		
		//���ǿ����ڸ� �̿��ؼ� ���ϱ�
		int a = year%12;
		ddi=a==0?"������":a==1?"��":a==2?"��":a==3?"����":
			a==4?"��":a==5?"��":a==6?"��":
			a==7?"�䳢":a==8?"��":a==9?"��":a==10?"��":"��";
		
		System.out.println(year+"����� �����" + ddi +"�� �Դϴ�"); //:������ ���� �ν��ϳ���

	}
}
