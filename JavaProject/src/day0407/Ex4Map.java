package day0407;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex4Map {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		// map�� k(key),v(value) �� ������ ������ �߰�
		map.put("name", "������");
		map.put("age", "32");
		map.put("addr", "����");
		map.put("name", "�̼Ҷ�"); // ���� key�� ��� �����.
		System.out.println(map.size());

		System.out.println("** ���1 : key������ ����� �� ��� **");
		System.out.println("�̸� :" + map.get("name"));
		System.out.println("���� :" + map.get("age"));
		System.out.println("�ּ� :" + map.get("addr"));
		System.out.println("������ :" + map.get("blood")); // �ش� key�� ������쵵 Ȯ���ϱ�

		System.out.println("** ���2 : key�� ���� ��ü ���� �� �ش� v�� ��� **");
		// key�� Ÿ���� Set Ÿ�� (��������̰� �ߺ� X)
		Set<String> keys = map.keySet();
		for (String key : keys) {
			String v = map.get(key);
			System.out.println(key + ":" + v);
		}
	}

}
