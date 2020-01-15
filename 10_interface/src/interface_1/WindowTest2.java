package interface_1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
//�Ȱ����� �������� swing�� �ܻ��� ���´� �����͸� �ȹ����� �׷��� swing�� ��ȣ
//frame�� �����͸� ���Ǵ� �ٽ� �����Ǳ⸦ �ݺ��ϱ⿡ ȿ�������� �ʴ�.
//Frame �� BorderLayout(��������)
public class WindowTest2 extends Frame implements WindowListener,ActionListener,MouseListener, MouseMotionListener {
	private Button newB, exitB,right,left,top,bottom;
	private TextArea area;
	int x=100;
	int y=100;
	Panel p = new Panel(); 

	public void init() {
		newB=new Button("new");
		bottom=new Button("bottom");
		right=new Button("Right");
		left=new Button("Left");
		top=new Button("Top");
		//FlowLayout(������ġ-center)
		p.setBackground(new Color(255,255,255));
		p.add(newB);
		p.add(bottom);
		p.add(right);
		p.add(left);
		p.add(top);
		this.add("North",p);//center north south west east

		Frame f=new Frame("Molla");
		setTitle("molla");
		setForeground(Color.black);
		Color b=new Color(255,255,255); 
		setBackground(b);
		this.setSize(300,400);
		
		setBounds(700,500,500,400);
		setVisible(true);
		
		//Event 
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addWindowListener(new WindowExit());
		this.addWindowListener(this);
		//exitB.addActionListener(this);
		newB.addActionListener(this);
		bottom.addActionListener(this);
		right.addActionListener(this);
		left.addActionListener(this);
		top.addActionListener(this);
	}
	public static void main(String[] args) {
		new WindowTest2().init();//������ ȣ��
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==newB) {
			x=y=100;
			System.out.println("�ʱ�ȭ");
		}
		if(e.getSource()==bottom) {y+=10;if(y==350)y=-150;} 
		if(e.getSource()==right) {x+=10;if(x==460)x=-140;} 
		if(e.getSource()==left) {x-=10;if(x==-130)x=450;} 
		if(e.getSource()==top) {y-=10;if(y==-150)y=350; }
		repaint();
		System.out.println("X:"+x+"\t Y:"+y);
	}
//	@Override
//	public void update(Graphics g) {
//		paint(g);
//	}
	public void paint(Graphics g) {//call back �޼ҵ�
		//�ݹ�޼ҵ� =���� ������ �Ǹ� JVM�� ���ؼ� ȣ��
		//setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\java_se\\workspace\\10_interface\\src\\star.jpg"));
		Toolkit t= Toolkit.getDefaultToolkit();
		Image img = t.getImage("D:\\java_se\\workspace\\10_interface\\src\\kero.jpg");
		g.drawImage(img,x,y,this); //�̹����׸��� 
		//g.drawStirng("X:"+x+"\t Y:"+y);
	}

	//Mouse Listener Override - Event Handler 
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("you clicked");
		x=e.getX();
		y=e.getY();
		System.out.println("X:"+x+"\t Y:"+y);

		repaint(); //update() - paint()������ ȣ��
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse in");		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse out");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	//MouseMotionListener - Event Handler 
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Mouse Dreagged");
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
	
	//WindowListener -eventHandler
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	
}
