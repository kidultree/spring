package day0404;

public class Ex7CallBy {
	
	public static void dataIn(Person p) {
		p.name="��ȣ��";
		p.addr="�λ�";
	}

	public static void dataOut (Person p)
	{
		System.out.println("** �� Ȯ�� **");
		System.out.println("�̸�:"+p.name+",�ּ�:"+p.addr);
		
	}
	public static void main(String[] args) {
		Person person=new Person();
		//�ּҰ� ���޵ǹǷ� dataIn���� �Էµ� �����ʹ� person�� ����ȴ�
		dataIn(person); 
		//dataIn���� ������ �����Ͱ� ��µȴ�
		dataOut(person);

	}

}
