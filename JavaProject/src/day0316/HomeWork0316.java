package day0316;

import java.util.Scanner;

public class HomeWork0316 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		for (int i = 1; i <= 1; i++) {
			int rnd = (int) (Math.random() * 100) + 1;

			System.out.println("수를 맞혀보세요");
			n = sc.nextInt();

			while (true) {

				if (i == 10)
					System.out.println("시간초과!!");
				break;
			}
			if (n < rnd) {
				System.out.println(n + "보다 큽니다.");
			}

			else if (n > rnd) {
				System.out.println(n + "보다 작습니다.");
			} else if (n == rnd) {
				System.out.println("맞았어요! 정답은" + rnd + "입니다.");
			}

		}
	}
}
