package day0317;

public class Ex3Array {

	public static void main(String[] args) {

		char []ch;
		ch=new char[4];
		System.out.println("length="+ch.length);
		
		System.out.println("** 초기값 출력 **");
		for(int i=0;i<ch.length;i++) //i<=ch.length '같다'주면 절대 안됨! 4-->0 1 2 3
		{
			System.out.println((int)ch[i]);
		}
		
		ch[0]='A';
		ch[1]=67; //아스키코드 (char니까)
		ch[2]=90;
		ch[3]='*';
		
		System.out.println("** 배열 출력 방법 1");
		for(int i=0;i<ch.length;i++){
			System.out.printf("%3c",ch[i]); //"%3c"-->3자리 char
		}
		
		System.out.println();
		System.out.println("** 배열 출력 방법 2");
		for(char a:ch) //위 ch 배열에서 하나씩 꺼내서 들어감(횟수만큼 자동으로 반복)
			System.out.printf("%3c",a);
		
	}

}
