package day0317;

public class Ex6ArrayMunje {

	public static void main(String[] args) {

		int[] data = { 100, -56, 67, 89, 230, -800, 32, 39, 69, 11, -9, 8, 25, 33, 77 };

		int max, min;
		// �ִ밪 , �ּҰ� ���ϱ�
		max = data[0]; // ������ ù��° ��� ���� �ʱⰪ!..�����ؼ�
		min = data[0];

		for (int i = 1; i < data.length; i++) //0���� �񱳶�..1���� �񱳽��� ����
		{
			if (max < data[i])
				max = data[i];

			if (min > data[i])
				min = data[i];
		}
		
		System.out.println("�ִ밪��" + max);
		System.out.println("�ּҰ���" + min);

	}

}
