package day0404;

class Hello {
	int year, month, day;

	Hello(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;

	}

	public void write() {
		System.out.println(year + "년" + month + "월" + day + "일생입니다");
	}
}

class Hello2 {
	int year, month, day;

	private Hello2(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;

	}
	
	public static Hello2 getInstance() {
	return new Hello2(2020,12,25);	
	}
	

	public void write() {
		System.out.println(year + "년" + month + "월" + day + "일생입니다");
	}
}

public class Ex11Constructor {

	public static void main(String[] args) {
		Hello h = new Hello(2001,4,10);
		h.write();
		
		Hello2 h2=Hello2.getInstance();
		h2.write();

	}

}
