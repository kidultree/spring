package day0405;
//�ڹٷθ� DB �־ ����ϰ� ���� ��쿡 ����� (���� ���󵵴� ����)

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex10Frame extends Frame implements WindowListener{
	
	public Ex10Frame() {
		super("�ȳ��ϼ���");
		this.setBounds(300, 100, 300, 300); //��ġ�� ũ�� ����
		this.setBackground(Color.pink); //���� ����
		this.addWindowListener(this); //�̺�Ʈ �߻�
		this.setVisible(true);
	}
	//Source ���� ������ - ���
	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("������ ����");
		System.exit(0); //���α׷� ����
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

	public static void main(String[] args) {
		new Ex10Frame(); //����Ʈ ������ ȣ��

	}

}
