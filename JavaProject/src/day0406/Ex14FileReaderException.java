package day0406;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex14FileReaderException {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null; // 줄 단위로 읽는 메서드를 갖고 있음

		try {
			fr = new FileReader("D:/bitjava0314/memo1.txt");
			br = new BufferedReader(fr);
			
			while (true) {
				String s = br.readLine(); // 한줄 읽기
				if (s == null) // 마지막줄까지 읽으면 null값 반환
					break;
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없어요:" + e.getMessage());

		} catch (IOException e) { // 이미 try/catch 추가되어있는 경우는 catch만 추가
			// TODO Auto-generated catch block
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
