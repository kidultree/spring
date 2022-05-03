package day0404;
//Getter & Setter - private 인스턴스 필드에 접근 위함

public class Ex4Method {

	private String name;
	private int age;

	// setter method : 값 변경시 필요한 메서드
	public void setName(String name) {
//		name //구분을 안할 경우 String name으로 인식
//		this.name = name; //this.로 인식시켜줘야 위에 private로 인식

		this.name = name; // 인자가 같은 이름일 경우 멤버 변수명 앞에 반드시 this를 붙인다
	}

	public void setAge(int age) {
		this.age = age;
	}

	// getter method : 멤버 변수 값을 반환하기 위한 메서드
	public String getName() {
		return this.name; // this는 생략가능 (구역 안에 같은 이름 없어서)
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Ex4Method ex1 = new Ex4Method();
		ex1.setName("이기자");
		ex1.setAge(25);

		Ex4Method ex2 = new Ex4Method();
		ex2.setName("김정하");
		ex2.setAge(26);

		System.out.println("이름 :" + ex1.getName());
		System.out.println("나이 :" + ex1.getAge());
		System.out.println();

		System.out.println("이름 :" + ex2.getName());
		System.out.println("나이 :" + ex2.getAge());
	}

}
