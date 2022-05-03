package day0317;

import java.util.Scanner;

public class Ex7ArrayMunje {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


		/*문제: 성을 입력하면 해당 성을 가진 사람을 출력하고
		 * 총 몇명인지 출력하기
		 * 
		 * 예) 검색할 성: 이
		 * 			1: 이진
		 * 			3: 이효리
		 /			9: 이제훈
		  *총 3명
		  *검색할 성 : 박
		  *박씨성은 없음
		  *검색할 성 : 끝        //equals 사용
		  * *** 종료합니다 ***
		
		  * String의 startsWith 사용
		  *
		  */
		
		String []members = {"강소라","이진","강호동","이효리","손미나",
				"유재석","김성규","김정하","강민","이제훈"};
		
		String name;//입력받을 이름
		int cnt; //인원수 구할 변수
		
		while(true)
		{
			
			cnt = 0;
			System.out.print("검색할 성:");
			name=sc.nextLine();
			if(name.equals("끝"))
			{System.out.println("** 프로그램을 종료합니다 **");
			break;
			}
			
			for(int i=0;i<members.length;i++)
			{
				if(members[i].startsWith(name)) //해당 성으로 시작할 경우 true
				{
					System.out.println(i+":"+members[i]);
					cnt++;
				}
			}
		if (cnt ==0) //해당 안되는 경우 실행이 안되어서 0임
			System.out.println(name+"씨 성은 없음!");
		else
			System.out.println("총 "+cnt+"명");
		System.out.println();	
	
		}
		
		
	
		
	}

}
