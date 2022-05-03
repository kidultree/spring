package day0406;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SihumAnswer0406 {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		int sum = 0, cnt = 0, score;
		double avg = 0;

		try {
			fr = new FileReader("D:\\bitjava0314\\score.txt");
			br = new BufferedReader(fr);
			System.out.println("입력한 점수들");
			while (true) {
				String line = br.readLine();
				// null 일 경우 종료
				if (line == null)
					break;
				// 입력한 점수를 계산이 가능한 int로 변환
				// 만약 문서에 문자가 섞여있을 경우 0점 처리 해보자
				try {
					score = Integer.parseInt(line);
				} catch (NumberFormatException e) {
					score = 0;
				}
				cnt++;// 갯수 증가
				sum += score; // 합계 구하기
				System.out.printf("%5d", score);
			}
			// 평균
			avg = (double) sum / cnt;
			System.out.println("");
			System.out.println("갯수 : " + cnt);
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + avg);

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없어요:" + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {

			}
		}
	}
}