package day0316;

public class Ex7MultiFor {

	public static void main(String[] args) {
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= 5; b++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");

		for (int a = 1; a <= 5; a++) 
		{
			for (int b = 1; b <= a; b++) 
			{
				System.out.print("★");
			}
			System.out.println();
		}
		
System.out.println("-----------------------");

for (int a = 1; a <= 5; a++) 
{
	for (int b = a; b <=5; b++) 
	{
		System.out.print("★");
	}

	System.out.println();
	}
System.out.println("-----------------------");


/*      ★
 *     ★★
 *    ★★★
 *   ★★★★
 *  ★★★★★
 */

for (int a = 1; a <= 5; a++) //행
{
	//공백 (4,3,2,1,0)
	for(int sp=a; sp<5;sp++)
		System.out.print(" ");
		
	for (int b=1; b<=a; b++) //열
	{
		System.out.print("*");
	}
	System.out.println();
	}
System.out.println("-----------------------");




}
}