package day0315;

import java.util.Scanner;

public class Ex1Munje {

	public static void main(String[] args) {
//상품명과 갯수, 금액을 입력받아 계산해야할 총 금액을 출력하는데
//	만약 5개 이상일 경우 총 금액의 10프로를 디씨한 금액으로 출력하시오.(scanner, if문)
//		ex)
//		상품명
//		사과
//		수량 
//		6
//		단가
//		1000
//		총금액은 10프로 디씨한 5400원입니다.

		Scanner sc = new Scanner(System.in);
		
		String name;
		int num;
		int money;

		System.out.println("상품명");
		name = sc.nextLine();
		System.out.println("수량");
		num = sc.nextInt();
		System.out.println("단가");
		money = sc.nextInt();

		
		int total = (num * money);

		if (num >= 5) {
			System.out.println("총 금액은" + (int) (total * 0.9) + "원 입니다.");
		}

		else {
			System.out.println("총 금액은" + (int) total + "원 입니다.");
		}

	}

}
