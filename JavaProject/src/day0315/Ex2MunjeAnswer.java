package day0315;

import java.util.Scanner;

public class Ex2MunjeAnswer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a,b,c,max;
		
		System.out.println("3���� ���ڸ� �Է��Ͻʽÿ�");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		max=a>b&&a>c?a:b>a&&b>c?b:c;
		System.out.println("���� ū ���� "+max+"�Դϴ�");
		
	}

}