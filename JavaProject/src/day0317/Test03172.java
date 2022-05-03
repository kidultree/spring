package day0317;

import java.util.Scanner;

public class Test03172 {

	public static void main(String[] args) {
		
		String[] color = new String[5];
		int size = color.length;
		
			Scanner sc = new Scanner(System.in);
		
			for(int i=0;i<size;i++)
			{
				System.out.println("»ö±òÀ» ´Ù¼¸°¡Áö ÀÔ·ÂÇÏ¼¼¿ä");
				
				color[i] = sc.nextLine();
			}
			for(int i=0;i<size;i++) {
			
	           System.out.println("»ö±ò: "+(i+1)+")" +color[i]);
	       }
	       }
}