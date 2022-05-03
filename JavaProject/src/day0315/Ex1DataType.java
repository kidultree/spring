package day0315;

public class Ex1DataType {

	public static void main(String[] args) {
		//기본형 연습
		char ch='A';
		char ch2='가';
		char ch3=67; //'C'
		char ch4=(char)(ch3+2);
		
		System.out.println(ch);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch3+2); //char+int=int
		System.out.println((char)(ch3+2)); //char로 출력
		
		int a = 7;
		int b = 4;
		System.out.println(a+b);
		System.out.println(a/b); //결과도 int 
		System.out.println((double)a/b); //a를 계산할때만 double로 변환해서 계산
		System.out.println((double)(a/b)); //이미 (a/b)에서 int로 계산 끝남

	}

}
