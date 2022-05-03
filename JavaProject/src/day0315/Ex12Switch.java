package day0315;

import java.util.Scanner;

public class Ex12Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("n?");
		n = sc.nextInt();
		switch (n) { // 정수형일때 swtich문 많이 사용함, char도 가능
		case 1:
			System.out.println("One!");
			break;
		case 2:
			System.out.println("Two!");
			break;
		case 3:
			System.out.println("Three!");
			break;
		default: //모두 아닐 경우 나오는 것
			System.out.println("1,2,3 제외!");
		}

		sc.nextLine();
		String s;
		System.out.println("노랑,빨강,파랑 중 입력");

		s = sc.nextLine();

		switch (s) {
		case "노랑":
			System.out.println("내가 제일 좋아함");
			break;
		case "빨강":
			System.out.println("빨강색은 매운맛");
			break;
		case "파랑":
			System.out.println("푸른바다색");
			break;
		default:
			System.out.println("모든 색은 아름다워요.");
		}
	}
}
