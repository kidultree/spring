package day0316;

public class Ex9ForGugu {

	public static void main(String[] args) {

		/*
		 * 2�� ���� 9�ܱ��� ��� ���
		 * 
		 * 
		 * [2��]    [3��]    ......... [9��] - ���� for
		 * 
		 * 2x1=2    3x1=3   ........  9x1=9 - ���� for     \t
		 * .
		 * .
		 * 2x9=18  3x9=27  ..........   9x9=81
		 */
		
		for(int dan=2;dan<=9;dan++)
			{
			System.out.print("["+dan+"��]\t");
			}
	System.out.println("\n");
	for(int i=1;i<=9;i++) 
	{
			for (int dan=2;dan<=9;dan++)
	
		{
				System.out.print(dan+"x"+i+"="+dan*i+"\t");
		}
			System.out.println();
	}
	}
}