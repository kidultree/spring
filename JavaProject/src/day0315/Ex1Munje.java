package day0315;

import java.util.Scanner;

public class Ex1Munje {

	public static void main(String[] args) {
//��ǰ��� ����, �ݾ��� �Է¹޾� ����ؾ��� �� �ݾ��� ����ϴµ�
//	���� 5�� �̻��� ��� �� �ݾ��� 10���θ� ���� �ݾ����� ����Ͻÿ�.(scanner, if��)
//		ex)
//		��ǰ��
//		���
//		���� 
//		6
//		�ܰ�
//		1000
//		�ѱݾ��� 10���� ���� 5400���Դϴ�.

		Scanner sc = new Scanner(System.in);
		
		String name;
		int num;
		int money;

		System.out.println("��ǰ��");
		name = sc.nextLine();
		System.out.println("����");
		num = sc.nextInt();
		System.out.println("�ܰ�");
		money = sc.nextInt();

		
		int total = (num * money);

		if (num >= 5) {
			System.out.println("�� �ݾ���" + (int) (total * 0.9) + "�� �Դϴ�.");
		}

		else {
			System.out.println("�� �ݾ���" + (int) total + "�� �Դϴ�.");
		}

	}

}
