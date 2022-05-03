package day0406;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sihum0406 {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null; // 줄단위로 읽는 메서드를 가지고있음
		int tot = 0;
		double avg = 0.0;
		double cnt = 0;
		
		try {
			fr = new FileReader("D:/bitjava0314/score.txt");
			br = new BufferedReader(fr);
			System.out.println("입력된 점수들");
			
			while (true) {
				String s = br.readLine();// 한줄읽기
				if (s == null) {
					break;
				}
				System.out.print(s + " ");
				cnt++;
				tot += Integer.parseInt(s);
				avg = tot / cnt;

			}
			System.out.println();
			System.out.println("총" + cnt + "개");
			System.out.println("총점 : " + tot);
			System.out.println("평균 : " + avg);
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다:" + e.getMessage());
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