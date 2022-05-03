package day0407;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set�� Ư¡ 1. �������(���� �߿�X)  2. �ߺ������͸� ������� �ʴ´�
public class Ex3Set {

	public static void main(String[] args) {
		// ����� Ÿ�Ը� ���� �� ����
		// ���׸� <String> : ���ڿ��� ���� �� �ִ�.
		Set<String> set = new HashSet<String>();
		set.add("apple");
		set.add("orange");
		set.add("banana");
		set.add("kiwi");
		set.add("apple"); // �ߺ��� ���� ������ �ȵ�
		set.add("orange"); // �ߺ�
		// set.add(100); //String�� �ƴ� ��� ���� �߻�

		System.out.println(set.size());

		System.out.println("��� ��� 1");
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println();
		
		System.out.println("��� ��� 2");
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}

	}

}
