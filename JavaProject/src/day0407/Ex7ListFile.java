package day0407;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Ex7ListFile {
	public static final String FILENAME = "D:/bitjava0314/person.txt";
	List<Person> list;
	Scanner sc;

	public Ex7ListFile() {
		list = new Vector<Person>();
		sc = new Scanner(System.in);

		fileRead();
	}

	// ó�� ���۽� ����(person.txt) �о list �� ������ �ֱ� ����
	public void fileRead() {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				String[] s = line.split(","); // 0(�̿���),1(����),2(�ּ�)�� ����
				Person p = new Person();
				p.setName(s[0]);
				p.setGender(s[1]);
				p.setAddr(s[2]);
				// list�� �߰�
				list.add(p);
			}
			System.out.println("�� " + list.size() + "���� ������ �о��!");

		} catch (FileNotFoundException e) {
			System.out.println("����� ������ ����");
		} catch (IOException e) {
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

	public void fileWrite() {
		// fileWriter ���� �� list�� ������ �����ϱ� (*�ĸ��� �����ؼ� ����)
		FileWriter fw = null;
		try {
			fw = new FileWriter(FILENAME);
			// list�� ������ ���Ͽ� �����ϱ�
			for (Person p : list) {
				String s = p.getName() + "," + p.getGender() + "," + p.getAddr() + "\n";
				fw.write(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
			} catch (IOException e) {
			}

		}

	}

	// �޴� ���� �Է� �� ����
	public int getMenu() {
		System.out.println(" ** �޴� ���� ** ");
		System.out.println("1. �߰�  2.��ü���  3.����  5. ���� �� ���� ");
		int n = Integer.parseInt(sc.nextLine());
		return n;
	}

	// ������ �Է� �� list�� �߰��ϴ� �޼���
	public void dataAdd() {
		System.out.println("�̸�");
		String name = sc.nextLine();
		System.out.println("����");
		String gender = sc.nextLine();
		System.out.println("�ּ�");
		String addr = sc.nextLine();

		// Person ��ü ����
		Person p = new Person();
		p.setName(name);
		p.setGender(gender);
		p.setAddr(addr);

		// list�� �߰�
		list.add(p);

		System.out.println(list.size() + "��° �����Ͱ� �߰��Ǿ����ϴ�");
	}

	// �̸����� ã�Ƽ� �����ϱ�
	public void dataDelete() {
		boolean find = false;
		String searchName;
		System.out.println("������ �̸��� �Է��ϼ���");
		searchName = sc.nextLine();

		for (int i = 0; i < list.size(); i++) {
			Person p = list.get(i); // i��° Person�� ��´�
			// �̸� ��
			if (searchName.equals(p.getName())) {
				find = true; // ã������ true�� ����
				list.remove(i); // i�� ������ ����
				break;
			}
		}
		if (find)
			System.out.println(searchName + "�� ������ ���� �Ϸ�!");
		else
			System.out.println(searchName + "���� ��ܿ� �����ϴ�");
	}

	// ��ü ���
	public void dataAllWrite() {
		System.out.println("��ȣ\t�̸�\t����\t�ּ�");
		System.out.println("--------------------------------");
		int n = 0;
		for (Person p : list) {
			System.out.println(++n + "\t" + p.getName() + "\t" + p.getGender() + "\t" + p.getAddr());
		}
	}

	public static void main(String[] args) {
		Ex7ListFile ex = new Ex7ListFile();
		while (true) {
			int n = ex.getMenu();
			switch (n) {
			case 1:
				ex.dataAdd();
				break;
			case 2:
				ex.dataAllWrite();
				break;
			case 3:
				ex.dataDelete();
				break;
			case 5:
				System.out.println(" ** ���� �� ���α׷��� �����մϴ� **");
				ex.fileWrite(); // ���� ����
				System.exit(0);
			}
			System.out.println();
		}

	}
}
