package day0405;

class Apple{
	private void methodA() //private는 상속 안됨!
	{
		System.out.println("super 메서드 A");
	}
	public void methodB()
	{
		System.out.println("super 메서드 B");
	}
}
/////////////////////////////////////////////
class Banana extends Apple //Banana는 Apple로부터 상속을 받겠다.
{
	public void methodC()
	{
		System.out.println("sub 메서드 C");
	}
}



public class Ex3Inheritance {

	public static void main(String[] args) {
		
		Banana b=new Banana(); 
		b.methodB(); //상속된 메서드
		b.methodC();

	}

}
