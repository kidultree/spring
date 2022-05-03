package day0405;

import java.util.Scanner;

abstract class Command { // 추상 메서드 있으면 class도 추상
	abstract public void process();
}

///////////////////////////////
class Add extends Command {
	@Override
	public void process() {
		System.out.println("데이터를 추가합니다");
	}
}

///////////////////////////////
class List extends Command {
	@Override
	public void process() {
		System.out.println("데이터를 출력합니다");
	}
}

///////////////////////////////
class Delete extends Command {
	@Override
	public void process() {
		System.out.println("데이터를 삭제합니다");
	}
}

//////////////////////////////
class Update extends Command {
	@Override
	public void process() {
		System.out.println("데이터를 수정합니다");
	}
}

public class Ex8Abstract {
	public static void process(Command comm) {
		comm.process();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.추가  2.출력  3.삭제  4.수정  5.종료 ");
			int n = sc.nextInt();
			if (n == 5) {
				System.out.println("프로그램을 종료합니다");
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
