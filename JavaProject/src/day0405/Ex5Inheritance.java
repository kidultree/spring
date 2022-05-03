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
			name = "오렌지";
		}

		Orange(String name) {
			this.name = name;
		}

		Orange(String name, int danga) {
			super(danga);
			this.name = name;
		}

		public void write() {
			System.out.println("과일명:" + name + ",단가:" + this.getDanga());
			// this.getDanga() : 먼저 내 클래스 안에서 찾고 없으면 부모 클래스에서 가져옴
		}
	}

	public class Ex5Inheritance {

		public static void main(String[] args) {
			Orange[] or = new Orange[3];
			or[0] = new Orange();
			or[1] = new Orange("키위");
			or[2] = new Orange("딸기", 3000);

			//출력
			for(Orange o:or)
				o.write();
	}
	}

