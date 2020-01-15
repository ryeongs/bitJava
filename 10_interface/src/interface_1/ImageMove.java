package interface_1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//Frame = BorderLayout 
public class ImageMove extends Frame implements WindowListener,ActionListener{
	/*
	 * <font style = "color:red">
	 */
	public static final int FRAME_WIDTH=500,FRAME_HEIGHT=500;
	private Button resetB,leftB,upB,downB,rightB;
	private int x=100,y=100;
	
	public int imageX= 200, imageY=200;
	
	public void init()  {
		resetB=new Button("RESET");
		downB=new Button("DOWN");
		rightB=new Button("RIGHT");
		leftB=new Button("LEFT");
		upB=new Button("UP"); 

		//Component 도구 
		Panel p = new Panel(); //FlowLayout (순서배치-중앙)
		p.setLayout(new GridLayout(1,5,3,0)); //1줄 다섯칸 3간격
		p.setBackground(new Color(255,255,255));
		p.add(resetB);
		p.add(downB);
		p.add(rightB);
		p.add(leftB);
		p.add(upB);
		this.add("North",p);
		
		setTitle("이미지 이동");
		setBounds(700,100,FRAME_WIDTH,FRAME_HEIGHT);
		setVisible(true);
		//이벤트
		this.addWindowListener(this);
		
		resetB.addActionListener(this);
		downB.addActionListener(this);
		rightB.addActionListener(this);
		leftB.addActionListener(this);
		upB.addActionListener(this);
	}
	public static void main(String[] args) {
		new ImageMove().init(); 
		//    1     2생성자  3
	}
	public void paint(Graphics g) {
		//이미지 불러오는 두가지 방법
		//Image img = Toolkit.getDefaultToolkit().getImage("peach.png");
		Toolkit t= Toolkit.getDefaultToolkit();
		Image img = t.getImage("D:\\java_se\\workspace\\10_interface\\src\\kero.jpg");
		g.drawImage(img,x,y,this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==resetB) {x=y=100; 
		}else if(e.getSource()==leftB) {x-=10; if(x==-130)x=450;
		}else if(e.getSource()==upB) {y-=10; if(y==-150)y=350;
		}else if(e.getSource()==downB) {y+=10; if(y==350)y=-150;
		}else if(e.getSource()==rightB) {x+=10;} if(x==460)x=-140;
		
		System.out.println("X:"+x+"\t Y:"+y);
		repaint();
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
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
