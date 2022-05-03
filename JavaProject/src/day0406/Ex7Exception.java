package day0406;

public class Ex7Exception {

	public static void main(String[] args) {
		int []arr = {4,6,7,8};
		for(int i=0; i<=arr.length; i++)
		{
			try {
				System.out.println(arr[i]);
			}catch (ArrayIndexOutOfBoundsException e) {
				//e.printStackTrace(); //에러메세지 추적해서 확인
				System.out.println("배열오류:"+e.getMessage());
			}
		}
		System.out.println("**정상 종료**");
	}

}
