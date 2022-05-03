package day0315;
import java.util.Scanner;

public class Ex10Operator {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int java,html,oracle;
		//3과목의 점수를 입력받아 합계와 평균을 출력하고 
		//과락이 없고 평균이 60이상이면 "합격"
		//그렇지 않으면 "불합격" 처리하시오
		
		int sum;
		double avg;
		String msg;
		
		System.out.println("3과목의 점수를 차례대로 입력하시오");
		java=sc.nextInt();
		html=sc.nextInt();
		oracle=sc.nextInt();
		
		//합계, 평균 구하기
		sum = java + html + oracle;
		avg = sum/3.0;
		
		System.out.println("총점 : "+sum);
		System.out.printf("평균 : %6.2f\n", avg); //글자길이6개(.도 포함),.이후 2개
		
		//조건 (결과는 true / false)
		boolean a = java>=40 && html >=40 && oracle >=40 && avg>=60;
		//if문
		if(a)
			msg = "합격!";
		else msg = "불합격!";
		
		System.out.println(msg);
		
		//조건연산자
		msg =a? "합격!":"불합격!";
		System.out.println(msg);
		
		
	}
}
