package day0406;

import java.util.Date;

public class Ex9Exception {

	public static void main(String[] args) {
		Date date = null; // try 실행된 다음에 finally로 감
//		Date date = new Date(); //exception이 발생 안하고 바로 finally로 감

		int year = 0;
		try {

			year = date.getYear() + 1900;
		} catch (NullPointerException e) {
			System.out.println("객체가 생성안됨:" + e.getMessage());
			date = new Date();
			year = date.getYear() + 1900;
		} finally {
			System.out.println("** 무조건 실행되는 영역 **");
			System.out.println("지금은 " + year + "년도 입니다");
		}

		System.out.println("** 정상 종료 **");

	}

}
