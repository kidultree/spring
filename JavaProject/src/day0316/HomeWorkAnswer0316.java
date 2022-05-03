package day0316;

import java.util.Scanner;

public class HomeWorkAnswer0316 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cnt = 0; // 횟수
		int rnd, num;

		// 1~100 사이의 난수 발생
		rnd = (int) (Math.random() * 100) + 1;

		while (true) { //횟수를 모르니까 for 보다 while 사용
			System.out.print(++cnt + ":"); //카운팅 표시하기, 증가 후에 출력
			num = sc.nextInt();

			if (num > rnd)
				System.out.println("\t"+num +" 보다 작습니다");
			else if (num < rnd)
				System.out.println("\t"+num +" 보다 큽니다");
			else {
				System.out.println("***맞았어요!! 정답은 " + rnd + "입니다!");
				System.out.println("***프로그램을 종료합니다 ***");
				break;
			}
			if (cnt >= 10) {
				System.out.println("\t== 시간초과! 종료합니다 ===");
				break;
			}
		}
	}
}
