package day0407;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex1FileReadWrite {
	public static final String FILENAME = "D:/bitjava0314/info.txt";

	public static void dataAdd(String name, String hp, String addr) {
		// ���� �� �ĸ��� �����ؼ� ���ٿ� ����
		String data = name + "," + hp + "," + addr + "\n";
		// �߰����� ��ü ����
		FileWriter fw = null;
		try {
			fw = new FileWriter(FILENAME, true);// ���� exception �߰��ϱ�
			// ���Ͽ� ������ ����
			fw.write(data);
			System.out.println("�Էµ����� ���� �Ϸ�!!\n");

		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (fw != null)
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

	public static void dataAllWrite() {
		FileReader fr = null;
		BufferedReader br = null;
		try {

			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			System.out.println("\t**��ü ��� ���� **");
			System.out.println();
			System.out.println("��ȣ\t�̸�\t�ڵ���\t�ּ�");
			System.out.println("--------------------------------------");
			int n = 0;
			while (true) {
				// ���Ͽ��� �� �� �б�
				String line = br.readLine();
				// null�� ��� while�� ����
				if (line == null)

					break;
				// ,�� �и�
				String[] info = line.split(",");
				System.out.println(++n + "\t" + info[0] + "\t" + info[1] + "\t" + info[2]);
			}
			System.out.println("--------------------------------------");
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�");
			e.printStackTrace();
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

	public static void fileDelete() {
		// File ��ü�� ������ �ؾ� ���� ����
		File file = new File(FILENAME);
		System.out.println("������ ������ ũ�� :" + file.length());
		// ������ ���� ������ ��쿡�� ����
		if (file.exists())
			file.delete(); // ������ ���(boolean) - �����϶�
		System.out.println("������ �����߽��ϴ�");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (true) {
			System.out.println("1.�������߰�  2.��ü���  3.���ϻ���  4.����");
			n = Integer.parseInt(sc.nextLine()); // ���� �Է¹��� 1, 2, 3
			switch (n) {
			case 1: {
				System.out.println("�߰��� �̸� �Է�");
				String name = sc.nextLine();
				System.out.println("�߰��� �ڵ�����ȣ �Է�");
				String hp = sc.nextLine();
				System.out.println("�߰��� �ּ� �Է�");
				String addr = sc.nextLine();
				dataAdd(name, hp, addr);
				break;
			}
			case 2:
				dataAllWrite();
				break;
			case 3:
				fileDelete();
				break;
			case 4:
				System.out.println("���α׷� ����!!");
				System.exit(0);
			}
		}

	}

}