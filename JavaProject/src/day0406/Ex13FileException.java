package day0406;

import java.io.FileWriter;
import java.io.IOException;

public class Ex13FileException {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			//2��° ������ true�� �߰����
			fw = new FileWriter("D:/bitjava0314/memo1.txt",true);
			fw.write("�̸� : ������\n");
			fw.write("�ּ�: ���ֵ�\n");
			fw.write("------------------\n");
			System.out.println("������ Ȯ���ϼ���");
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
