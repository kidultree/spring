package day0317;

public class Ex5ArrayMunje {

	public static void main(String[] args) {

		int[] data = { 56, 67, 78, 89, 100 };
		int sum = 0; // 합계구할 변수
		double avg; // 평균구할 변수

		// for문에서 sum 구하기

	for (int i = 0; i < data.length; i++)
		sum += data[i];
			
	
//		for 방법 2
//		for(int n:data)
//			sum+=n;
		
	
		// avg 구하기

		avg = sum / (double) data.length;

		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		// 출력
	}
}
