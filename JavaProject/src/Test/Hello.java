package Test;

import day0404.Ex1Object;

public class Hello {

	public static void main(String[] args) {
		Ex1Object ex1 = new Ex1Object();
		System.out.println(ex1.score);
		System.out.println(Ex1Object.jungdap);

//		Apple a = new Apple; //error? class가 public이 아니므로 생성 안됨 
	}

}
