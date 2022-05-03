package day0405;

class Color {
	private String colorName;

	Color() {
		// System.out.println("super 디폴트 생성자");
	}

	Color(String colorName) {
		this.colorName = colorName;
		// System.out.println("super 2번째 생성자");
	}

	// 출력하는 메서드
	public void write() {
		System.out.println("자동차색:" + colorName);
	}
}

///////
class Red extends Color {

	private String myCar;

	Red() {
//		super(); 
//		부모의 디폴트 생성자 호출 - 생략되어있음

//		super("노랑"); //인자가 있는 생성자는 생략안됨, 반드시 첫줄
//		System.out.println("sub 디폴트 생성자");
	}

	Red(String myCar, String colorName) {
		super(colorName);
		this.myCar = myCar;

	}

	@Override
	public void write() {
		super.write(); //순서 상관 없음, 먼저 일처리를 해야할 경우 먼저 작성.. 
		System.out.println("내 차 이름:" + myCar);
	}
}

public class Ex4Inheritance {

	public static void main(String[] args) {

		Red r1 = new Red();
		r1.write();
		System.out.println("-------------");
		Red r2 = new Red("소나타", "진주펄색");
		r2.write();
	}

}
