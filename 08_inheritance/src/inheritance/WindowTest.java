package inheritance;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class WindowTest extends Frame{
	public WindowTest() {
		super("���� �ű��ϳ�"); //�θ������ ȣ��
		
		setForeground(Color.white);
		//setBackground(Color.DARK_GRAY);
		Color b=new Color(72,85,147); 
		setBackground(b);
		//this.setSize(300,400);
		
		setBounds(700,200,400,500);
		setVisible(true);
		
	}
	@Override
	public void paint(Graphics g) {//call back �޼ҵ�
		//�ݹ�޼ҵ� =���� ������ �Ǹ� JVM�� ���ؼ� ȣ��
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
