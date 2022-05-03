package day0318;

public class Ex4ArrayLotto {

	public static void main(String[] args) {

		int []lotto = new int[6];
		/*
		 * ���� : 1~45 ������ �ߺ����� ���� ������ �迭�� ���� �� ������������ ����Ͻÿ�.
		 */

		// ���� �߻�(�ߺ�ó��) - ���� for

		for (int i = 0; i <= lotto.length-1; i++)

		{
			lotto[i] = (int) (Math.random() * 45) + 1; //���� �߻�

			for (int j = 0; j < i; j++) // �ߺ�ó��
			{
				if (lotto[i] == lotto[j]) 
				{
					i--;
					break;
				}
			}
		}

		// �������� ���� - ���� for
		for (int i = 0; i < lotto.length - 1; i++) 
		{
			for (int j = i + 1; j < lotto.length; j++)

			{
				if (lotto[i] < lotto[j]) // �ε�ȣ �ٲٸ� ������������
				{
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}

		// ��� - ���� for
		for (int n : lotto)
			System.out.printf("%4d", n);

	}
}

//



