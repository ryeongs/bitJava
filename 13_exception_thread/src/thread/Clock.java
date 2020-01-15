package thread;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Clock extends JFrame implements Runnable{

	SimpleDateFormat simple;
	public Clock() {
		this.setFont(new Font("�ü�ü",Font.BOLD,20));
		setForeground(Color.red);
		
		setBounds(900,100,300,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			private void windowClosing() {
				System.exit(0);
			}
		});
		
		//������ ����
		Thread t =new Thread(this); //����������� �����
		//������ ���� -> run()
		t.start();
		
		setVisible(true);
	}
	@Override //���� �������̵� �κп� throws�� ������ �ȵȴ� �θ��ڽ��� ���� ȣ��ΰ� �ʿ��ϱ� ����
	public void run() {
	
		while(true) {
			repaint();
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	public void paint(Graphics g) {
		simple = new SimpleDateFormat("HH�� mm�� ss��");
			Date d=new Date();
			g.drawString(simple.format(d),60,70);
	}
	public static void main(String[] args) {
		new Clock();
	}

}
