package day0405;

class Apple{
	private void methodA() //private�� ��� �ȵ�!
	{
		System.out.println("super �޼��� A");
	}
	public void methodB()
	{
		System.out.println("super �޼��� B");
	}
}
/////////////////////////////////////////////
class Banana extends Apple //Banana�� Apple�κ��� ����� �ްڴ�.
{
	public void methodC()
	{
		System.out.println("sub �޼��� C");
	}
}



public class Ex3Inheritance {

	public static void main(String[] args) {
		
		Banana b=new Banana(); 
		b.methodB(); //��ӵ� �޼���
		b.methodC();

	}

}
