package day0316;

public class Ex5For {

	public static void main(String[] args) {

		int a;
		for(a=1;a<=5;a++) // for문 바로 뒤에 ; 넣지 말기! 결과가 달라짐
		{ 
		System.out.printf("%3d",a);	
	}
		System.out.println();
		for(a=5;a>=1;a--)
		{
			System.out.printf("%3d",a);
		}
		System.out.println();
		for(a=1;a<=20;a+=3) //증감연산자 뿐만 아니라 대입연산자도 가능하다.
		{
			System.out.printf("%3d",a);
		}
		System.out.println();
		System.out.println("1부터 100까지 중 짝수의 합 구하기");
		int sum=0; //초기값 설정
		for(a=1;a<=100;a++)
		{
			if(a%2==1) //홀수인 경우
				continue; //증감식(a++)으로 돌려보냄 
			else
				sum+=a;
			}
		System.out.println(sum);
		}
	}
