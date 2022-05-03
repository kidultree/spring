package day0315;

import java.util.Scanner;

public class Ex2Munje {

	public static void main(String[] args) {

//3개의 숫자 a,b,c를 입력받아 가장 큰 수를 출력하시오 (조건 연산자 이용)
//
//ex) 
//3개의 숫자 입력
//3 5 7
//가장 큰 숫자는 7입니다
		int a,b,c;
		int result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3개의 숫자 입력");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		result = (a > b)? a:b;
		
		int result2;
		result2 = (c>result)? c:result;
		
		System.out.println(result2);
		
		
	}

}
