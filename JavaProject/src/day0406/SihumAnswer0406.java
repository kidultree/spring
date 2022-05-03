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
			System.out.println("�Է��� ������");
			while (true) {
				String line = br.readLine();
				// null �� ��� ����
				if (line == null)
					break;
				// �Է��� ������ ����� ������ int�� ��ȯ
				// ���� ������ ���ڰ� �������� ��� 0�� ó�� �غ���
				try {
					score = Integer.parseInt(line);
				} catch (NumberFormatException e) {
					score = 0;
				}
				cnt++;// ���� ����
				sum += score; // �հ� ���ϱ�
				System.out.printf("%5d", score);
			}
			// ���
			avg = (double) sum / cnt;
			System.out.println("");
			System.out.println("���� : " + cnt);
			System.out.println("���� : " + sum);
			System.out.println("��� : " + avg);

		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����:" + e.getMessage());
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