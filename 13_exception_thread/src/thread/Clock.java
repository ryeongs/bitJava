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
		this.setFont(new Font("궁서체",Font.BOLD,20));
		setForeground(Color.red);
		
		setBounds(900,100,300,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			private void windowClosing() {
				System.exit(0);
			}
		});
		
		//스레드 생성
		Thread t =new Thread(this); //나를스레드로 만든다
		//스레드 시작 -> run()
		t.start();
		
		setVisible(true);
	}
	@Override //절대 오버라이드 부분에 throws를 넣은면 안된다 부모자식이 같은 호출부가 필요하기 때문
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
		simple = new SimpleDateFormat("HH시 mm분 ss초");
			Date d=new Date();
			g.drawString(simple.format(d),60,70);
	}
	public static void main(String[] args) {
		new Clock();
	}

}
