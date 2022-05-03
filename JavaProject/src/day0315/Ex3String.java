package day0315;

public class Ex3String {

	public static void main(String[] args) {
		
		String s1 = "Happy"; //방법1
		String s2 = new String("Apple"); //방법2
		System.out.println(s1);
		System.out.println(s2);
	
		int a = 5, b = 5;
		System.out.println(a==b);
		System.out.println(s1==s2); //==클래스타입에서는 주소 비교
		//문자열에서 값이 같은지 비교하려면 equals 메서드 이용
		
		System.out.println(s1.equals("Happy"));
		System.out.println(s1.equals("happy"));
		System.out.println(s1.equals(s2));
		
		//대소문자 상관없이 철자만 비교할 경우
		System.out.println(s1.equalsIgnoreCase("happy"));
		System.out.println(s2.equalsIgnoreCase("aPPle"));
	
		//문자열의 길이 구하기
		System.out.println(s1.length());
		
		//문자열의 첫글자 구하기
		char startChar=s1.charAt(0);
		System.out.println(startChar); 
		//ex) HAPPY --> 01234
		
		//전체를 무조건 대문자 혹은 소문자로 출력
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		String s3="Have a Nice Day!!";
		System.out.println(s3.startsWith("Have"));
		System.out.println(s3.endsWith("Have"));
		System.out.println(s3.startsWith("Happy"));
		System.out.println(s3.endsWith("!"));

		
		
		
		
		
	
	}
}
