package day0405;

//다형성 처리 : method는 동일해야함
//A = 부모 B = 자식 // A = new B --> 다형성 처리

class SuperObj {
	public void process() {
		System.out.println("super 부모가 공통적인 일을 처리함");
	}
}

////////////////////////////////////////////////
class Draw extends SuperObj // overriding
{
	@Override
	public void process() {
		super.process(); //부모가 먼저 일을 처리해야 할경우 넣어줌
		System.out.println("나는 그림을 그려요!!!");
	}
}

//////////////////////////////////////////////
class Game extends SuperObj {
	@Override
	public void process() {
		super.process();
		System.out.println("나는 게임을 해요!!!");
	}
}

//////////////////////////////////////////////
public class Ex6Inheritance {

	public static void process(SuperObj obj){
		obj.process();
	}
	
	public static void main(String[] args) {
//		SuperObj obj = null; //초기화 먼저 해줌
//		obj = new Draw();
//		obj.process(); //자식 class(Draw)가 가진 process가 호출
//		
//		obj = new Game();
//		obj.process();//Game이 가진 process가 호출
		
		process(new Draw()); // 그림 그리는 일을 처리 
		process(new Game()); // 게임에 관한 일을 처리
		

	}
}
