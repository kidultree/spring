package day0315;

import java.util.Scanner;

public class Ex4Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Scanner �Ҷ� ctrl + 1 or s ����(���� import ���� �ڵ�����)
		String msg = "";
		System.out.println("����� �̸��� �Է��ϼ���.");
		msg=sc.nextLine();//�Է��� ������ ��°�� �о�´�(���ڿ�Ÿ��)
		// msg=sc.next(); �� �ܾ �о�´�
		System.out.println("�� �̸��� "+msg+"�Դϴ�.");
	
		int age;
		System.out.println("����� ���̴�?");
		age=sc.nextInt(); //int Ÿ������ �о�´�
		System.out.println(msg+"���� ���̴� "+age+"�� �Դϴ�.");
	
	
	}
}