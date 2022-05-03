package day0406;

//Member 내부 클래스
class Outer{
	int a = 10;
	static int b = 20;
	
	//내부 클래스
	class Inner{
		int c = 30;
		//static int d = 40; //member 내부 클래스에서 static 변수는 선언 불가
		
		public void disp() {
			System.out.println("a="+a);
			System.out.println("b="+b);
			System.out.println("c="+c);
			
		}
	}
	//외부 클래스 영역
	public void outerDsip()
	{
		//내부클래스 선언
		Inner in = new Inner();
		in.disp();
	}
}
public class Ex4InnerClass {

	public static void main(String[] args) {
		//외부 클래스가 가진 메서드 호출 (메서드에서 내부클래스 선언시)
		Outer out = new Outer();
		out.outerDsip();
		System.out.println();
		//외부 클래스의 메서드를 거치지 않고 바로
		//내부 클래스의 메서드를 호출하고자 할 경우
		
		Outer.Inner inner = new Outer().new Inner();
		inner.disp();

	}

}
