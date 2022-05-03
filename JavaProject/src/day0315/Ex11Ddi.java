package day0315;

import java.util.Scanner;

public class Ex11Ddi {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int year; //태어난년도
		String ddi; //띠 저장
		//태어난 연도를 입력하면 해당하는 띠를 출력하는 프로그램 구현
		//if로 먼저 구하고 조건 연산자로도 구하기
		//힌트 : 서기 1년은 닭띠이다
		
		System.out.println("태어난 년도는?");
		year=sc.nextInt();
		
		// if문 사용
		if((year%12)==0)
			ddi="원숭이";
		else if(year%12==1)
			ddi="닭";
		else if(year%12==2)
			ddi="개";
		else if(year%12==3)
			ddi="돼지";
		else if(year%12==4)
			ddi="쥐";
		else if(year%12==5)
			ddi="소";
		else if(year%12==6)
			ddi="범";
		else if(year%12==7)
			ddi="토끼";
		else if(year%12==8)
			ddi="용";
		else if(year%12==9)
			ddi="뱀";
		else if(year%12==10)
			ddi="말";
		else
			ddi="양";
		
		System.out.println( year+"년생인 당신은" + ddi +"띠 입니다");
		
		
		//조건연산자를 이용해서 구하기
		int a = year%12;
		ddi=a==0?"원숭이":a==1?"닭":a==2?"개":a==3?"돼지":
			a==4?"쥐":a==5?"소":a==6?"범":
			a==7?"토끼":a==8?"용":a==9?"뱀":a==10?"말":"양";
		
		System.out.println(year+"년생인 당신은" + ddi +"띠 입니다"); //:개수에 따라서 인식하나봄

	}
}
