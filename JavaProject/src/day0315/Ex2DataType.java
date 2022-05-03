package day0315;

public class Ex2DataType {

	public static void main(String[] args) {
		
		byte b1 = 127;
		byte b2 = (byte)129;
		System.out.println(b1);
		System.out.println(b2); //마이너스값 출력(2의 보수)
		float f1 = 123.564564f;//f를 붙이면 4바이트의 float로 선언된다
		double d1 = 123.564564;
		System.out.println(f1); //소수점 포함 8자리
		System.out.println(d1); // 포함 15자리
		
		boolean b = true;
		System.out.println(b);
		System.out.println(!b);
		//printf는 변환기호를 이용해서 출력할 때 사용
		//정수 :%d, 실수"%f, 문자:%c, 문자열:%s
		
		System.out.printf("f1=%7.1f,d1=%7.2f",f1,d1);
		char ch='A';
		System.out.printf("ch=%c", ch);
		System.out.printf("\nch=%c\n",ch); //\n:엔터, \t:1탭
		
		
		System.out.println("Red" + "Blue");
		//" 자체를 출력하려면 \" 이렇게 쓴다.
		
		
		
		System.out.println(("\"Red\",\"Blue\""));
	
	
	
		//파일의 경로를 나타낼 때 /도 되고 \도 된다.
		System.out.println("c:\\image\\sun.jpg");
		System.out.println("c:/image/sun.jpg");
		
	}
}







