package day0407;

import java.util.StringTokenizer;

public class SplitTest {

	public static void main(String[] args) {
		String str = "red,green,blue,yellow,pink";
		
		// ,�� ���ڿ��� �и��Ͽ� ����ϴ� ��� 2���� 
		System.out.println("split�� �̿��Ͽ� �и��ϴ� ���");
		String []color=str.split(","); //split(x) : x�� �и��ϰڴ�
		for(String c:color)
			System.out.println(c);
	
		
		System.out.println();
		System.out.println("StringTokenizer ��� Ŭ������ �̿��ϴ� ��� ");
		StringTokenizer st = new StringTokenizer(str,",");
		System.out.println("�и��� ��ū��:"+st.countTokens());
		while(st.hasMoreTokens())//���� ��ū�� �ִ� ���� �ݺ�
		{
			String s = st.nextToken();
			System.out.println(s);
		}
	}

}
