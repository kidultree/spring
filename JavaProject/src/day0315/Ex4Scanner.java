package day0315;

import java.util.Scanner;

public class Ex4Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Scanner 할때 ctrl + 1 or s 눌러(위에 import 라인 자동생성)
		String msg = "";
		System.out.println("당신의 이름을 입력하세요.");
		msg=sc.nextLine();//입력한 한줄을 통째로 읽어온다(문자열타입)
		// msg=sc.next(); 한 단어만 읽어온다
		System.out.println("내 이름은 "+msg+"입니다.");
	
		int age;
		System.out.println("당신의 나이는?");
		age=sc.nextInt(); //int 타입으로 읽어온다
		System.out.println(msg+"님의 나이는 "+age+"세 입니다.");
	
	
	}
}