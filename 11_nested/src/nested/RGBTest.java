package nested;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
public class RGBTest extends JFrame{
	private JButton redB,greenB,blueB;
	private DrCanvas can;
	
	public RGBTest() {
		redB=new JButton(new ImageIcon("ss.gif"));
		greenB=new JButton("GREEN");
		blueB=new JButton("BLUE");

		can = new DrCanvas();
		
		Panel p=new Panel();
		p.add(redB);
		p.add(greenB);
		p.add(blueB);
		
		Container c= this.getContentPane();
		
		c.add("North",p);
		c.add("Center",can);
		
		setBounds(900,100,300,300);
		setVisible(true);
		
		//여기서 구현함으로써 안쓰는 메소드를 줄일 수 있다
		this.addWindowListener(new WindowAdapter() { //원하는거 골라쓴다
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//implements 안하고 쓸려면 
		//ActionListener()는 인터페이스라 new가 안되므로 {}익명을 빌려 구현
		redB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(new Color(255,0,0));
			}
		});
		greenB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(new Color(0,255,0));
			}
		});
		blueB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(new Color(0,0,255));
			}
		});
	}
	class DrCanvas extends Canvas{
		public DrCanvas() {
			this.setBackground(new Color(255,200,255));	
		}
		
	}
	public static void main(String[] args) {
		new RGBTest();
	}

}
