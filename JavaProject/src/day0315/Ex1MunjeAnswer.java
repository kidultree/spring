package day0315;

import java.util.Scanner;

public class Ex1MunjeAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	String sang;
	int su,dan,total;
	
	System.out.println("상품명");
	sang=sc.nextLine();
	System.out.println("수량과 단가를 입력하세요");
	
	su=sc.nextInt();
	dan=sc.nextInt();
	
	total=su*dan;
	if(su>=5) { //두줄 이상일 때 반드시 {} 처리 하기 
		total=(int)(total*0.9);
		System.out.println("총 금액은 10프로 디씨한 "+total+"원 입니다");
	}
	else {
		System.out.println("총 금액은"+total+"원 입니다");
	}	
	}
}

