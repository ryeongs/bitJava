package interface_1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;

public class WindowTest extends Frame implements WindowListener,ActionListener,MouseListener, MouseMotionListener{
	private Button newB, exitB;
	int x,y;
	public WindowTest() {
		
		exitB=new Button("End");
		newB=new Button("new");
		
		Panel p = new Panel(); //FlowLayout(순서배치-center)
		p.setBackground(new Color(100,100,150));
		p.add(newB);
		p.add(exitB);
		
		this.add("North",p);
	
		Frame f=new Frame("Molla");
		setTitle("molla");
		setForeground(Color.black);
		Color b=new Color(72,85,147); 
		setBackground(b);
		this.setSize(300,400);
		
		setBounds(700,200,300,400);
		setVisible(true);
		
		//Event 
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addWindowListener(new WindowExit());
		this.addWindowListener(this);
		exitB.addActionListener(this);
		newB.addActionListener(this);
		
	}
	@Override
	public void update(Graphics g) {
		paint(g);
	}
	public void paint(Graphics g) {//call back 메소드
		//콜백메소드 =일정 시점이 되면 JVM에 의해서 호출
		Toolkit t= Toolkit.getDefaultToolkit();
		Image img = t.getImage("D:\\java_se\\workspace\\09_abstract\\src\\gg.jpg");
		g.drawImage(img,20,100,this); //이미지그리기 
		//---------------------------------------
		g.fillOval(x, y, 5, 5);
		g.drawString("X:"+x+"Y:"+y, x, y);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exitB) System.exit(0);
		
	}
	public static void main(String[] args) {
		new WindowTest();
		
	}
	//Mouse Listener Override - Event Handler 
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("you clicked");
		x=e.getX();
		y=e.getY();
		System.out.println("X:"+x+"\t Y:"+y);
		repaint();
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
	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	//MouseMotionListener - Event Handler 
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Mouse Dreagged");
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
	
	
	//WindowListener
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
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
