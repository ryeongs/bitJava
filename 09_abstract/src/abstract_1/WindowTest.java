package abstract_1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowTest extends Frame{
	public WindowTest() {
		//super("���� �ű��ϳ�"); //�θ������ ȣ��
		Frame f=new Frame("Molla");
		
		setForeground(Color.white);
		Color b=new Color(72,85,147); 
		setBackground(b);
		this.setSize(300,400);
		
		setBounds(700,200,300,400);
		setVisible(true);
		
		Panel p= new Panel();
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
	}
	@Override
	public void paint(Graphics g) {//call back �޼ҵ�
		//�ݹ�޼ҵ� =���� ������ �Ǹ� JVM�� ���ؼ� ȣ��
//		//g.setColor(Color.white);
//		g.drawLine(50,150,200,300);
//		g.drawLine(200,150,50,300);
//		g.drawRect(100,150,150,150);
//		g.drawOval(120, 150, 150, 150);
		Toolkit t= Toolkit.getDefaultToolkit();
		Image img = t.getImage("D:\\java_se\\workspace\\09_abstract\\src\\gg.jpg");
		g.drawImage(img,20,100,this); //�̹����׸��� 
	}
	
	public static void main(String[] args) {
		new WindowTest();
		
	}


}
