package day0316;

import java.util.Scanner;

public class Ex10For {

	public static void main(String[] args) {

		/*
		 * (예)
		 * 1. 지수승 구하기
		 * 2. 숫자 n까지의 합계 구하기
		 * 3. 숫자 n까지의 팩토리알 구하기
		 * 4. 종료
		 */
		
		Scanner sc=new Scanner(System.in);
		int menu;
		while(true)
		{
			System.out.println("1. 지수승 구하기");
			System.out.println("2. 숫자 n까지의 합계 구하기");
			System.out.println("3. 숫자 n까지의 팩토리알 구하기");
			System.out.println("4. 종료");
			
			menu=sc.nextInt();
			//4일경우 종료
			if(menu==4) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			switch(menu)
			{
			case 1: 
			{
				int x,y,r=1;         //곱해지는 수 ,횟수
				System.out.println("지수승을 구할 x,y 두 숫자 입력");
				x=sc.nextInt();
				y=sc.nextInt();
				for(int i=1;i<=y;i++)
				{
					r*=x;
				}
			System.out.println(x+"의"+y+"승은"+r+"입니다");
			}
				
			break;
			
			case 2:
			{ 
			int a;
			int sum=0;
			
			System.out.println("합계를 구할 n값 입력");
			a=sc.nextInt();
			for(int i=1;i<=a;i++) {
				sum+=i;
			}
			
			System.out.println("1부터"+a+"까지의 합은"+sum+"입니다.");
			
			}
			
			break;
			
			case 3:
			{
			 int n; 
			 int fac=1; //초기값 잘 설정하기 
			 
			 System.out.println("팩토리알을 구할 n값 입력");
			 n=sc.nextInt();
			 for(int i=1;i<=n;i++) 
			 { fac *= i;
			 }
				System.out.println(n+"의 팩토리알 값은"+fac+"입니다.");
			
			}
				
			break;
			
			default:
				System.out.println("**메뉴를 다시 선택하세요**");
			}
		 System.out.println();
		}
	}
}

