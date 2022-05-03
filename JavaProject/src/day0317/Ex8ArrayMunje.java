package day0317;

import java.util.Scanner;

public class Ex8ArrayMunje {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		String []members = {"강소라","이진","강호동","이효리","손미나",
				"유재석","김성규","김정하","강민","이제훈"};
		
		String name;//입력받을 이름
		int cnt; //인원수 구할 변수
		
		/*
		 * 검색할 이름 : 이진
		 * 		이진님은 2번째에 있습니다. //배열에 +1해서 출력하기
		 * 검색할 이름 : 이준희
		 * 		이준희님은 명단에 없습니다.
		 * 검색할 이름 : exit
		 * 		** 검색을 종료합니다 **
		 */
		
		while(true) {
			cnt = 0;
			System.out.println("검색할 이름:");
			name=sc.nextLine();
			if(name.equalsIgnoreCase("exit")) //영어라서 대소문자 상관없도록
					{System.out.println("** 검색을 종료합니다 **");
					break;
					}
			
			for(int i=0;i<members.length;i++)
			{
				if(name.equals(members[i]))
				{
					System.out.println("\t"+name+"님은 "+(i+1)+"번 째에 있습니다");
					cnt=1; //찾았기 때문에 1! 못찾으면 초기값 그대로 0
					break;
			}
		}
			if(cnt==0) //못찾은 경우..=초기값
				System.out.println("\t"+name+"님은 명단에 없습니다");
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}
}
