package day0315;

import java.util.Scanner;

public class Ex8Operator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int kor; //��������
		String msg; //����޼���
		//���������� �Է� �� 90�̻��̸� "Excellent!" ��� msg �� ����
		//90 �̸��̸� "Try!"��� ����
	
		System.out.println("��������");
		kor=sc.nextInt();
		
		
		//if������ �غ���
		if(kor>=90)
			msg="Excellent!";
		
		else
			msg="Try!";
		
		System.out.println(kor+"=>"+msg);

		
		//���� �����ڷ� �غ���
		msg=kor>=90?"Excellent!":"Try!";
		System.out.println(kor+"=>"+msg);
		

		
	}

}