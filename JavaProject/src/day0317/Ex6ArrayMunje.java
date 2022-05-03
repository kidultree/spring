package day0317;

public class Ex6ArrayMunje {

	public static void main(String[] args) {

		int[] data = { 100, -56, 67, 89, 230, -800, 32, 39, 69, 11, -9, 8, 25, 33, 77 };

		int max, min;
		// 최대값 , 최소값 구하기
		max = data[0]; // 무조건 첫번째 담긴 값이 초기값!..비교위해서
		min = data[0];

		for (int i = 1; i < data.length; i++) //0번과 비교라..1번과 비교시작 ㄱㅊ
		{
			if (max < data[i])
				max = data[i];

			if (min > data[i])
				min = data[i];
		}
		
		System.out.println("최대값은" + max);
		System.out.println("최소값은" + min);

	}

}
