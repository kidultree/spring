package day0318;

public class Ex3ArrayStringSort {

	public static void main(String[] args) {

		String []names = {"�Ѱ���","��ȣ��","���缮","Adams","�Ѱ�"}; //�ƽ�Ű�ڵ� �ø�����
		
		for(int i=0; i<names.length-1; i++)
		{
			for(int j=i+1; j<names.length; j++)
			// i���� ���� ���� ��� - ���� �����Ƿ�
			//�� Ŭ ��쿡�� ���� (�����)
				
			{
				if(names[i].compareTo(names[j])>0) //�ε�ȣ �ٲٸ� ������������
				{
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		for(int i=0; i<names.length; i++)
		{
			System.out.println(i+"=>"+names[i]);
		}
		
	}

}
