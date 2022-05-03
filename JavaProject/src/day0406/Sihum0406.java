package day0406;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sihum0406 {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null; // �ٴ����� �д� �޼��带 ����������
		int tot = 0;
		double avg = 0.0;
		double cnt = 0;
		
		try {
			fr = new FileReader("D:/bitjava0314/score.txt");
			br = new BufferedReader(fr);
			System.out.println("�Էµ� ������");
			
			while (true) {
				String s = br.readLine();// �����б�
				if (s == null) {
					break;
				}
				System.out.print(s + " ");
				cnt++;
				tot += Integer.parseInt(s);
				avg = tot / cnt;

			}
			System.out.println();
			System.out.println("��" + cnt + "��");
			System.out.println("���� : " + tot);
			System.out.println("��� : " + avg);
		} catch (FileNotFoundException e) {
			System.out.println("������ �����ϴ�:" + e.getMessage());
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