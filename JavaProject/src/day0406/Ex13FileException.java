package day0406;

import java.io.FileWriter;
import java.io.IOException;

public class Ex13FileException {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			//2번째 인자인 true는 추가모드
			fw = new FileWriter("D:/bitjava0314/memo1.txt",true);
			fw.write("이름 : 이지혜\n");
			fw.write("주소: 제주도\n");
			fw.write("------------------\n");
			System.out.println("파일을 확인하세요");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
