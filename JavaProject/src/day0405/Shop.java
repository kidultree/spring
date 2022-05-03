package day0405;

public class Shop {

	private String sangpum;
	private int su;
	private int dan;

	public Shop() {
		this("�����", 1, 1300); // this, super�� ������ ù��
	}

	public Shop(String sangpum) {

		// source - generate constructor ~
		super();
		// generate �ϸ� �ڵ����� ����..���ֵ� ����
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

	// 3���� ������� �Ѳ����� �����ϰ��� �� ���
	public void setData(String sangpum, int su, int dan) {
		this.setSangpum(sangpum);
		this.setSu(su);
		this.setDan(dan);
	}

	// ������ �ܰ��� ���Ѱ��� ��ȯ�ϴ� �޼ҵ�
	public int getResult() {
		return su * dan;
	}
}
