package day0316;

public class Ex1While {

	public static void main(String[] args) {

		int a=0;
		while(++a<=5) { //증가 후에 비교
			System.out.println(a);
		}
		System.out.println("빠져나온 후의 a값:"+a);
		
		a=0;
		while(a++<=5) { //비교 후에 증가
			System.out.println(a);
		}
		
	System.out.println("빠져나온 후의 a값"+a);
	
	a=0;
	while(true) { //조건은 무조건 true로
		System.out.println(++a);
		if(a==5)
			break; //a가 5가 되면 while문을 빠져나간다
		}
		System.out.println("빠져나온 후의 a값:"+a);
	}
}
