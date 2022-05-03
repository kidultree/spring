package day0317;

import java.util.Scanner;

public class Ex2Random {

	public static void main(String[] args) {

		/* 1번 문제에 추가하기 : 계속 이어서 다른 숫자 맞추기 */
		Scanner sc = new Scanner(System.in);
		int rnd, cnt, num;
		char ans;

		Exit: while (true) // 맞추고 경우 다시 하겠느냐? 해서 Y한 경우

		{
			System.out.println("** 게임을 시작합니다 **");
			cnt = 0;
			rnd = (int) (Math.random() * 100) + 1;

			while (true) {
				System.out.println(++cnt + ":");
				num = Integer.parseInt(sc.nextLine()); // 문자열로 읽은 후 int 타입으로 전환
				if (num > rnd)
					System.out.println("\t" + num + "보다 작습니다");
				else if (num < rnd)
					System.out.println("\t" + num + "보다 큽니다");
				else {
					System.out.println("*** 정답입니다. 정답은" + rnd + " 입니다 ***");
					System.out.println("** 계속하려면 y, 그만하려면 n을 눌러주세요**");

					
					ans = sc.nextLine().charAt(0);
					// 문자열 형태이므로 그중 첫글자만 char로 얻는다
					if (ans == 'y' || ans == 'Y') { // || 하나만 true여도 true (대,소문자 y면 ㅇㅋ)
						System.out.println(" ** 새로운 난수를 발생합니다 **");
						continue Exit; // 바깥 while문으로의 이동 (처음으로)
					} else {
						System.out.println("** 프로그램을 종료합니다 **");
						break Exit; // 바깥 while 문을 빠져나가서 종료
					}

				}
			}
		}

	}

}
