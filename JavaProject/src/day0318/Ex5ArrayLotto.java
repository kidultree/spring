package day0318;

import java.util.Scanner;

public class Ex5ArrayLotto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int money;

		int []lotto = new int[6];
		/*
		 * 문제 : 금액을 입력하면 금액에 해당하는 횟수만큼 로또 숫자 출력
		 * 1000원 미만으로 입력하면 끝내버리기
		 * 1~45 사이의 중복되지 않은 난수를 
		 * 배열에 저장 후 오름차순으로 출력하시오.
		 */

		System.out.println("로또 구입 금액 입력");
		money = sc.nextInt();
		if(money < 1000)
		{
			System.out.println("** 금액이 부족하므로 프로그램을 종료합니다 **");
			//break는 while문에서만 사용 가능함!
			return; //현재 메인 함수 종료(현재는 void기 때문에 그냥 return)
		}

		for(int m = 0; m<money/1000; m++) //돈을 입력한 만큼 몇 회 살지 결정
		{
			System.out.println((m+1)+"회 : ");
			
			// 난수 발생(중복처리) - 다중 for	
			for (int i = 0; i <= lotto.length -1; i++)
			{
				lotto[i] = (int) (Math.random() * 45) + 1; //난수 발생

				for (int j = 0; j < i; j++) // 중복처리
				{
					if (lotto[i] == lotto[j]) 
					{
						i--;
						break;
					}
				}
			}

			// 오름차순 정렬 - 다중 for
			for (int i = 0; i < lotto.length - 1; i++) 
			{
				for (int j = i + 1; j < lotto.length -1; j++)

				{
					if (lotto[i] < lotto[j]) // 부등호 바꾸면 내림차순으로
					{
						int temp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = temp;
					}
				}
			}

			// 출력 - 단일 for
			for (int n : lotto)
				System.out.printf("%4d", n);
			
			System.out.println();
		}
	}
}