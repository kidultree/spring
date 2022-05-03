package day0316;

public class Ex11Random {

	public static void main(String[] args) {

		/*
		 * 임의의 수(랜덤)을 구하는 방법이 자바에는 두가지가 있다. Math.random Random 클래스
		 */
		for (int i = 1; i <= 5; i++) {
			double a = Math.random();
			System.out.println(a);
		}

		System.out.println(("** 0~99 사이의 난수 구하기 **"));
		for (int i = 1; i <= 5; i++) {
			int a = (int) (Math.random() * 100);
			System.out.println(a);
		}

		System.out.println(("** 1~100 사이의 난수 구하기 **"));
		for (int i = 1; i <= 5; i++) {
			int a = (int) (Math.random() * 100) + 1;
			System.out.println(a);
		}
		System.out.println(("** 임의의 알파벳 A-Z(65~90) 구하기 **"));
		for (int i = 1; i <= 5; i++) {
			int a = (int) (Math.random() * 26) + 65; // 알파벳 갯수 26개
			System.out.println((char) a);

		}
	}
}
