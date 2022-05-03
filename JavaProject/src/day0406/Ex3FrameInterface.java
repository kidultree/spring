package day0406;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//어떻게 활용되는지 테스트 예제
public class Ex3FrameInterface extends 
Frame implements WindowListener, ActionListener {

	Button btn;
	
	public Ex3FrameInterface() {
		// TODO Auto-generated constructor stub
		super("Hello");
		this.setBounds(300, 100, 300, 300);
		this.addWindowListener(this); //윈도우 이벤트
		this.setLayout(new FlowLayout()); //레이아웃 변경
		this.setBackground(Color.pink);
		btn = new Button("Click");
		this.add(btn);
		btn.addActionListener(this); //버튼 이벤트 발생
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Ex3FrameInterface();
	}

	@Override
	public void actionPerformed(ActionEvent e) { //action = button 관련
		System.out.println("버튼 클릭했어요!!!");
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0); //윈도우 X 클릭시에 호출 (시스템 종료)
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

}
