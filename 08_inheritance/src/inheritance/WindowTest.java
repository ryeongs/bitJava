package inheritance;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class WindowTest extends Frame{
	public WindowTest() {
		super("거참 신기하네"); //부모생성자 호출
		
		setForeground(Color.white);
		//setBackground(Color.DARK_GRAY);
		Color b=new Color(72,85,147); 
		setBackground(b);
		//this.setSize(300,400);
		
		setBounds(700,200,400,500);
		setVisible(true);
		
	}
	@Override
	public void paint(Graphics g) {//call back 메소드
		//콜백메소드 =일정 시점이 되면 JVM에 의해서 호출
		//g.setColor(Color.white);
		g.drawLine(50,150,200,300);
		g.drawLine(200,150,50,300);
		g.drawRect(100,150,150,150);
		g.drawOval(120, 150, 150, 150);
	}
	
	public static void main(String[] args) {
		new WindowTest();
		
	}



}
