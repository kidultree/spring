package day0316;

import java.util.Scanner;

public class HomeWork0316 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		for (int i = 1; i <= 1; i++) {
			int rnd = (int) (Math.random() * 100) + 1;

			System.out.println("���� ����������");
			n = sc.nextInt();

			while (true) {

				if (i == 10)
					System.out.println("�ð��ʰ�!!");
				break;
			}
			if (n < rnd) {
				System.out.println(n + "���� Ů�ϴ�.");
			}

			else if (n > rnd) {
				System.out.println(n + "���� �۽��ϴ�.");
			} else if (n == rnd) {
				System.out.println("�¾Ҿ��! ������" + rnd + "�Դϴ�.");
			}

		}
	}
}
