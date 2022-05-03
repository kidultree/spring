package day0315;

import java.util.Scanner;

public class Ex9Operator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int kor; //국어점수
		String msg; //결과메세지
		//국어점수를 입력 후 90이상이면 "Excellent!" 라고 msg 에 저장
		//80 이상이면 "Good!" 저장
		//80 미만이면 "Try!"라고 저장
	
		System.out.println("국어점수");
		kor=sc.nextInt();
		
		
		//if문으로 해보기
		if(kor>=90)
			msg="Excellent!";
		
		if(kor>=80)
			msg="Good!";
		
		else msg="Try!";
		
		System.out.println(kor+"=>"+msg);

		
		//조건 연산자로 해보기
		msg=kor>=90?"Excellent!":kor>=80?"Good!":"Try!"; 
		//{90일때:아닐때(80이상:아닐때)}
		System.out.println(kor+"=>"+msg);
		

	}

}
