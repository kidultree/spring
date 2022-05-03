package day0405;

public class Shop {

	private String sangpum;
	private int su;
	private int dan;

	public Shop() {
		this("새우깡", 1, 1300); // this, super는 무조건 첫줄
	}

	public Shop(String sangpum) {

		// source - generate constructor ~
		super();
		// generate 하면 자동으로 생김..없애도 무관
		this.sangpum = sangpum;
		su = 1;
		dan = 500;
	}

	public Shop(String sangpum, int su, int dan) {
		this.sangpum = sangpum;
		this.su = su;
		this.dan = dan;
	}

	public String getSangpum() {
		return sangpum;
	}

	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}

	// 3개의 멤버값을 한꺼번에 변경하고자 할 경우
	public void setData(String sangpum, int su, int dan) {
		this.setSangpum(sangpum);
		this.setSu(su);
		this.setDan(dan);
	}

	// 수량과 단가를 곱한값을 반환하는 메소드
	public int getResult() {
		return su * dan;
	}
}
