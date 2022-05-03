package day0315;

import java.util.Scanner;

public class Ex2MunjeAnswer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a,b,c,max;
		
		System.out.println("3개의 숫자를 입력하십시오");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		max=a>b&&a>c?a:b>a&&b>c?b:c;
		System.out.println("가장 큰 수는 "+max+"입니다");
		
	}

}