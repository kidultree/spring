package day0317;

public class Ex10ArrayMunje {

	public static void main(String[] args) {

	int []lotto=new int[6];
	/*
	 * lotto �迭�� 1~45 ������ ���� 6���� ���� �� ����ϱ�
	 * 
	 * ��, �ߺ����ڰ� ������ �ȵ� 
	 */
	
	for(int i=0;i<lotto.length;i++)
	{ //1~45 ������ ���� ���ϱ�
		lotto[i]=(int)(Math.random()*45)+1;
		
		//�ߺ�ó��
		for(int j=0;j<i;j++)
		{
			if(lotto[i]==lotto[j])
			{
				i--; //1�� �� �� �ٽ� �̵� �� 1�� ����
				//������ ������ �ϳ��� �����ɰŶ�.. ����� ����(���� �������� ���)
				break; //i++�� �̵� 
			}
		}
	}
	//��� 
	for(int n:lotto)
		System.out.printf("%4d",n);
	}
}

