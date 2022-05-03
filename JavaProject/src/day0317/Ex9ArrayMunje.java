package day0317;

public class Ex9ArrayMunje {

	public static void main(String[] args) {

		int []score= {67,89,78,89,100};
		int []rank= new int[5];
		
		//점수에 대한 등수 출력하기 //등수는 무조건 다중 for문
		/*
		 * 출력 양식
		 * 
		 * 번호		점수	등수 
		 * ---------------------
		 *  1		67		5
		 *  2  		89		2
		 *  3		78  	4
		 *  4		89		2
		 *  5	   100		1
		 */
		
	//등수구하기
		
		for(int i=0;i<score.length;i++)
		{
			//등수는 1부터 시작해서 나보다 잘한사람이 있을때마다 1을 더한다.
		rank[i] = 1;
		for (int j=0;j<score.length;j++)
		{
			//상대방(j)의 점수가 나의(i) 점수보다 높으면
			//나의 등수를 1 증가시킨다.
			if (score[i]<score[j])
			{
				rank[i]++;
				
			}
		}
	}
		
		System.out.println("\t\t성적 출력\n");
		System.out.println("번호"+"\t점수"+"\t등수");
		System.out.println("----------------------");
		
		for(int i=0;i<score.length;i++)
		{
			System.out.println(i+1+"\t"+score[i]+"\t"+rank[i]);
		}
		
	}

}
