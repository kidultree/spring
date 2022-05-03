package day0406;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//��� Ȱ��Ǵ��� �׽�Ʈ ����
public class Ex3FrameInterface extends 
Frame implements WindowListener, ActionListener {

	Button btn;
	
	public Ex3FrameInterface() {
		// TODO Auto-generated constructor stub
		super("Hello");
		this.setBounds(300, 100, 300, 300);
		this.addWindowListener(this); //������ �̺�Ʈ
		this.setLayout(new FlowLayout()); //���̾ƿ� ����
		this.setBackground(Color.pink);
		btn = new Button("Click");
		this.add(btn);
		btn.addActionListener(this); //��ư �̺�Ʈ �߻�
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Ex3FrameInterface();
	}

	@Override
	public void actionPerformed(ActionEvent e) { //action = button ����
		System.out.println("��ư Ŭ���߾��!!!");
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0); //������ X Ŭ���ÿ� ȣ�� (�ý��� ����)
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
