package day0317;

public class Ex5ArrayMunje {

	public static void main(String[] args) {

		int[] data = { 56, 67, 78, 89, 100 };
		int sum = 0; // �հ豸�� ����
		double avg; // ��ձ��� ����

		// for������ sum ���ϱ�

	for (int i = 0; i < data.length; i++)
		sum += data[i];
			
	
//		for ��� 2
//		for(int n:data)
//			sum+=n;
		
	
		// avg ���ϱ�

		avg = sum / (double) data.length;

		System.out.println("�հ�: " + sum);
		System.out.println("���: " + avg);
		// ���
	}
}
