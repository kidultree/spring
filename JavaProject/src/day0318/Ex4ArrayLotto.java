package day0318;

public class Ex4ArrayLotto {

	public static void main(String[] args) {

		int []lotto = new int[6];
		/*
		 * 문제 : 1~45 사이의 중복되지 않은 난수를 배열에 저장 후 오름차순으로 출력하시오.
		 */

		// 난수 발생(중복처리) - 다중 for

		for (int i = 0; i <= lotto.length-1; i++)

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
			for (int j = i + 1; j < lotto.length; j++)

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

	}
}

//



