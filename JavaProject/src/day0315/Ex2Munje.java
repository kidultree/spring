package day0315;

import java.util.Scanner;

public class Ex2Munje {

	public static void main(String[] args) {

//3���� ���� a,b,c�� �Է¹޾� ���� ū ���� ����Ͻÿ� (���� ������ �̿�)
//
//ex) 
//3���� ���� �Է�
//3 5 7
//���� ū ���ڴ� 7�Դϴ�
		int a,b,c;
		int result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3���� ���� �Է�");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		result = (a > b)? a:b;
		
		int result2;
		result2 = (c>result)? c:result;
		
		System.out.println(result2);
		
		
	}

}
