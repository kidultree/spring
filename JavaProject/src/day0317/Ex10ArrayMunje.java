package day0317;

public class Ex10ArrayMunje {

	public static void main(String[] args) {

	int []lotto=new int[6];
	/*
	 * lotto 배열에 1~45 사이의 난수 6개를 넣은 후 출력하기
	 * 
	 * 단, 중복숫자가 있으면 안됨 
	 */
	
	for(int i=0;i<lotto.length;i++)
	{ //1~45 사이의 난수 구하기
		lotto[i]=(int)(Math.random()*45)+1;
		
		//중복처리
		for(int j=0;j<i;j++)
		{
			if(lotto[i]==lotto[j])
			{
				i--; //1을 뺀 후 다시 이동 후 1을 더함
				//어차피 위에서 하나가 증가될거라서.. 빼줘야 맞음(같은 번지수로 계산)
				break; //i++로 이동 
			}
		}
	}
	//출력 
	for(int n:lotto)
		System.out.printf("%4d",n);
	}
}

