package thread;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class Packman extends Frame implements KeyListener,Runnable{ //콘솔게임 필수
	private Image img;
	private int sel;
	private int x=225, y=225;
	private int mx,my;

	private Image icon;
	private int[]iconX;
	private int[] iconY;
	private int count;
	
	public Packman() {
		img=getToolkit().getImage("D:\\java_se\\workspace\\13_exception_thread\\src\\packman.jpg");
		icon=getToolkit().getImage("D:\\java_se\\workspace\\13_exception_thread\\src\\icon.jpg");
	
		setBounds(700,200,500,500);
		setResizable(false);
		setVisible(true);
		
		iconX=new int[5];
		iconY=new int[5];
		
		for(int i=0; i<iconX.length;i++) {
			iconX[i]=(int)(Math.random()*460+20);
			iconY[i]=(int)(Math.random()*430+50);
		}
		
		//Event
		this.addWindowListener(new WindowAdapter() {
	    	  @Override
	    	  public void windowClosing(WindowEvent e) {
	    		  System.exit(0);
	    	  }
	      });
		
		this.addKeyListener(this);
		Thread t=new Thread(this);
		t.start();
		//join();
	}
	
	@Override
	public void paint(Graphics g) {
		for(int i=0;i<5;i++) {
			g.drawImage(icon, iconX[i], iconY[i], 30, 30, this);
		}
			
		g.drawImage(img,
				x,y,x+50,y+50, //화면 위치
				sel*50,0,sel*50+50,50 , //이미지 자르기
				this);
		
	}

	@Override
	public void run() {
		while(true) {
			 if(count==5) {
				 JOptionPane.showMessageDialog(this, "고생했다");
				 break;
			 }
			 //입닫기
			if(sel%2==0) sel++;
			else sel--;
			
			x+=mx;
			y+=my;
			
			if(x>500) x=0;
			else if(x<0) x=500;
			if(y>500) y=0;
			else if(y<0) y=500;
			
			for(int i=0; i<5;i++) {
				if((x+10)<=iconX[i] && ((x+30)>iconX[i]) && 
					(y+10)<=iconY[i] && ((y+30)>iconY[i])) {
					iconX[i]=iconY[i]=0; count++;
				}
			}
			
			System.out.println("x="+x+"y="+y);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();
		}
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==e.VK_ESCAPE) System.exit(0); //VK_ESCAPE=27++ 
		else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			sel=0;
			my=0;mx=-10;
			}
		else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			sel=2; 
			mx=10;my=0;}
		else if(e.getKeyCode()==KeyEvent.VK_UP) {
			sel=4;
			mx=0;my=-10;}
		else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			sel=6;
			mx=0; my=10;}

		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	public static void main(String[] args) {
		new Packman();

	}


}
