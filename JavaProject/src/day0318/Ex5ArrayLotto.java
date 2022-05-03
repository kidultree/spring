package day0318;

import java.util.Scanner;

public class Ex5ArrayLotto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int money;

		int []lotto = new int[6];
		/*
		 * ���� : �ݾ��� �Է��ϸ� �ݾ׿� �ش��ϴ� Ƚ����ŭ �ζ� ���� ���
		 * 1000�� �̸����� �Է��ϸ� ����������
		 * 1~45 ������ �ߺ����� ���� ������ 
		 * �迭�� ���� �� ������������ ����Ͻÿ�.
		 */

		System.out.println("�ζ� ���� �ݾ� �Է�");
		money = sc.nextInt();
		if(money < 1000)
		{
			System.out.println("** �ݾ��� �����ϹǷ� ���α׷��� �����մϴ� **");
			//break�� while�������� ��� ������!
			return; //���� ���� �Լ� ����(����� void�� ������ �׳� return)
		}

		for(int m = 0; m<money/1000; m++) //���� �Է��� ��ŭ �� ȸ ���� ����
		{
			System.out.println((m+1)+"ȸ : ");
			
			// ���� �߻�(�ߺ�ó��) - ���� for	
			for (int i = 0; i <= lotto.length -1; i++)
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
				for (int j = i + 1; j < lotto.length -1; j++)

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
			
			System.out.println();
		}
	}
}