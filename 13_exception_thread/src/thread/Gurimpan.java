package thread;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.*;

import javax.swing.JFrame;

public class Gurimpan extends Canvas implements Runnable, ActionListener,MouseListener ,MouseMotionListener{
	private Button drawB, drawPen;
	private int x,y;
	private int pen1,pen2;
	public Gurimpan() {
		//setResizable(false);
		setBounds(700,200,500,500);
		drawB=new Button("Draw");
		drawPen=new Button("Pen");
		
		Panel p = new Panel(new FlowLayout(FlowLayout.CENTER));

		p.add(drawB);
		p.add(drawPen);
		this.add("North",p);
		
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		drawB.addActionListener(this);
		drawPen.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
	    	  @Override
	    	  public void windowClosing(WindowEvent e) {
	    		  System.exit(0);
	    	  }
	      });
		
		setVisible(true);
		Thread t=new Thread(this);
		t.start();
	}
	
	
	@Override
	public void run() {
		while(true) {
			repaint();
		}
		
	}
	@Override
	public void update(Graphics g) {
		paint(g);
	}
	@Override
	public void paint(Graphics g) {
		g.fillOval(x,y,pen1,pen2);
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if(e.getSource()==drawPen) {
			pen1=10;
		}else {
			pen2=3;
		}
		repaint();
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		repaint();
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new Gurimpan();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		
	}

}
