package day0316;

import java.util.Scanner;

public class HomeWorkAnswer0316 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cnt = 0; // Ƚ��
		int rnd, num;

		// 1~100 ������ ���� �߻�
		rnd = (int) (Math.random() * 100) + 1;

		while (true) { //Ƚ���� �𸣴ϱ� for ���� while ���
			System.out.print(++cnt + ":"); //ī���� ǥ���ϱ�, ���� �Ŀ� ���
			num = sc.nextInt();

			if (num > rnd)
				System.out.println("\t"+num +" ���� �۽��ϴ�");
			else if (num < rnd)
				System.out.println("\t"+num +" ���� Ů�ϴ�");
			else {
				System.out.println("***�¾Ҿ��!! ������ " + rnd + "�Դϴ�!");
				System.out.println("***���α׷��� �����մϴ� ***");
				break;
			}
			if (cnt >= 10) {
				System.out.println("\t== �ð��ʰ�! �����մϴ� ===");
				break;
			}
		}
	}
}
