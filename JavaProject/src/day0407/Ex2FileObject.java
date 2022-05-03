package day0407;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ex2FileObject {
	public static final String FILENAME = "D:/bitjava0314/shop.txt";

	public static void shopSave() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǰ��");
		String sang = sc.nextLine();
		System.out.println("����");
		String color = sc.nextLine();
		System.out.println("�ܰ�");
		int price = Integer.parseInt(sc.nextLine());

		// shop ��ü ����
		Shop shop = new Shop(sang, color, price);

		// Object ������ �����ϴ� ���
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(FILENAME);
			oos = new ObjectOutputStream(fos);
			// Object ������ �����ϱ�
			oos.writeObject(shop);
			System.out.println("���� �Ϸ�!!");
		} catch (FileNotFoundException e) {
			System.out.println("���� ����");
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				if (oos != null)
					oos.close();
				if (fos != null)
					fos.close();

			} catch (IOException e) {

			}
		}
	}

	public static void shopRead() {
		System.out.println("���Ͽ��� ���� shop ������ ���");
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(FILENAME);
			ois = new ObjectInputStream(fis);
			
			//���Ͽ��� shop ������ �б�
			Shop shop = (Shop)ois.readObject(); //�� ���� Ÿ���� �ȸ¾Ƽ� (Shop)���� ����ȯ 
			System.out.println("��ǰ�� : "+shop.getSang());
			System.out.println("���� : "+shop.getColor());
			System.out.println("�ܰ� : "+shop.getPrice());
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
	
			e.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				
			}
		}
	}

	public static void main(String[] args) {
		shopSave();
		shopRead();
	}

}
