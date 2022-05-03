package day0405;

class Fruit {
	private int danga;

	public Fruit() {
		danga = 1000;
	}

	Fruit(int danga) {
		this.danga = danga;
	}

	public int getDanga() {
		return danga;
	}
}

	//////////////////////////
	class Orange extends Fruit {
		private String name;

		public Orange() {
			name = "������";
		}

		Orange(String name) {
			this.name = name;
		}

		Orange(String name, int danga) {
			super(danga);
			this.name = name;
		}

		public void write() {
			System.out.println("���ϸ�:" + name + ",�ܰ�:" + this.getDanga());
			// this.getDanga() : ���� �� Ŭ���� �ȿ��� ã�� ������ �θ� Ŭ�������� ������
		}
	}

	public class Ex5Inheritance {

		public static void main(String[] args) {
			Orange[] or = new Orange[3];
			or[0] = new Orange();
			or[1] = new Orange("Ű��");
			or[2] = new Orange("����", 3000);

			//���
			for(Orange o:or)
				o.write();
	}
	}
