package day0317;

public class Ex4Array {

	public static void main(String[] args) {

		int[] arr1 = new int[5]; // �Ҵ縸
		int[] arr2 = { 4, 6, 7, 8, 10 }; // ó������ ���� �ذ���

		System.out.println("arr1 length:" + arr1.length);
		System.out.println("arr2 length:" + arr2.length);

		System.out.println("** �ʱⰪ ��� **");
		for (int a : arr1)
			System.out.printf("%5d",a);
		System.out.println();
		
		for (int a : arr2)
			System.out.printf("%5d",a);
		System.out.println();
		
		
		System.out.println("arr1�� ���ֱ�");
		arr1[1]=6;
		arr1[3]=23;
		arr1[4]=31;
		
		for(int i=0;i<arr1.length;i++)
			System.out.printf("%5d",arr1[i]);
			System.out.println();				//ù��° ������� �迭 ���
			
			
			
			
		
	}
	}

