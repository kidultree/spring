package day0315;

import java.util.Scanner;

public class Ex1MunjeAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	String sang;
	int su,dan,total;
	
	System.out.println("��ǰ��");
	sang=sc.nextLine();
	System.out.println("������ �ܰ��� �Է��ϼ���");
	
	su=sc.nextInt();
	dan=sc.nextInt();
	
	total=su*dan;
	if(su>=5) { //���� �̻��� �� �ݵ�� {} ó�� �ϱ� 
		total=(int)(total*0.9);
		System.out.println("�� �ݾ��� 10���� ���� "+total+"�� �Դϴ�");
	}
	else {
		System.out.println("�� �ݾ���"+total+"�� �Դϴ�");
	}	
	}
}

