package day0317;

public class Ex9ArrayMunje {

	public static void main(String[] args) {

		int []score= {67,89,78,89,100};
		int []rank= new int[5];
		
		//������ ���� ��� ����ϱ� //����� ������ ���� for��
		/*
		 * ��� ���
		 * 
		 * ��ȣ		����	��� 
		 * ---------------------
		 *  1		67		5
		 *  2  		89		2
		 *  3		78  	4
		 *  4		89		2
		 *  5	   100		1
		 */
		
	//������ϱ�
		
		for(int i=0;i<score.length;i++)
		{
			//����� 1���� �����ؼ� ������ ���ѻ���� ���������� 1�� ���Ѵ�.
		rank[i] = 1;
		for (int j=0;j<score.length;j++)
		{
			//����(j)�� ������ ����(i) �������� ������
			//���� ����� 1 ������Ų��.
			if (score[i]<score[j])
			{
				rank[i]++;
				
			}
		}
	}
		
		System.out.println("\t\t���� ���\n");
		System.out.println("��ȣ"+"\t����"+"\t���");
		System.out.println("----------------------");
		
		for(int i=0;i<score.length;i++)
		{
			System.out.println(i+1+"\t"+score[i]+"\t"+rank[i]);
		}
		
	}

}
