package day0315;

import java.util.Scanner;

public class Ex9Operator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int kor; //��������
		String msg; //����޼���
		//���������� �Է� �� 90�̻��̸� "Excellent!" ��� msg �� ����
		//80 �̻��̸� "Good!" ����
		//80 �̸��̸� "Try!"��� ����
	
		System.out.println("��������");
		kor=sc.nextInt();
		
		
		//if������ �غ���
		if(kor>=90)
			msg="Excellent!";
		
		if(kor>=80)
			msg="Good!";
		
		else msg="Try!";
		
		System.out.println(kor+"=>"+msg);

		
		//���� �����ڷ� �غ���
		msg=kor>=90?"Excellent!":kor>=80?"Good!":"Try!"; 
		//{90�϶�:�ƴҶ�(80�̻�:�ƴҶ�)}
		System.out.println(kor+"=>"+msg);
		

	}

}
