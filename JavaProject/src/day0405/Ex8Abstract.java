package day0405;

import java.util.Scanner;

abstract class Command { // �߻� �޼��� ������ class�� �߻�
	abstract public void process();
}

///////////////////////////////
class Add extends Command {
	@Override
	public void process() {
		System.out.println("�����͸� �߰��մϴ�");
	}
}

///////////////////////////////
class List extends Command {
	@Override
	public void process() {
		System.out.println("�����͸� ����մϴ�");
	}
}

///////////////////////////////
class Delete extends Command {
	@Override
	public void process() {
		System.out.println("�����͸� �����մϴ�");
	}
}

//////////////////////////////
class Update extends Command {
	@Override
	public void process() {
		System.out.println("�����͸� �����մϴ�");
	}
}

public class Ex8Abstract {
	public static void process(Command comm) {
		comm.process();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.�߰�  2.���  3.����  4.����  5.���� ");
			int n = sc.nextInt();
			if (n == 5) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
			switch (n) {
			case 1:
				process(new Add());
				break;

			case 2:
				process(new List());
				break;

			case 3:
				process(new Delete());
				break;

			case 4:
				process(new Update());
				break;

			}
		}
	}
}
