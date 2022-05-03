package day0315;

import java.util.Scanner;

public class Ex5Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int score;
		String name;
		char blood;

		/*
		 * 방법1
		 * 
		 * System.out.println("점수입력"); 
		 * score = sc.nextInt();
		 * 버퍼의 엔터를 읽어서 소멸시킨다 (엔터도 읽는 한 요소에 해당함)
		 * sc.nextLine();
		 */

		//방법2 
		System.out.println("점수입력"); 
		 // 점수를 일단 문자열로 읽은 후 int타입으로 변환한다. 
		 score = Integer.parseInt(sc.nextLine());
		 //Integer.parseInt(a) : 문자열 a를 int 타입으로 변환
		 //단 숫자형태가 아닐 경우 예외가 발생한다.

		 
		System.out.println("이름입력");
		name = sc.nextLine();

		System.out.println("혈액형 한글자 입력");
		blood = sc.nextLine().charAt(0);

		System.out.println("이 름 : " + name);
		System.out.println("점 수 : " + score);
		System.out.println("혈액형 : " + blood);

	}
}
