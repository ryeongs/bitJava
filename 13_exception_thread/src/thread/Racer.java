package thread;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JOptionPane;

public class Racer extends Canvas implements Runnable{//말 1마리 당
	private Image img;
	private int x,y;
	private int pos;
	public static int rank;
	int c;
	public Racer() {
		img=getToolkit().getImage("D:\\java_se\\workspace\\13_exception_thread\\src\\horse.gif");
	//	setBackground(new Color((int)(Math.random()*256), (int)(Math.random()*256),255));
		
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
		g.drawImage(img,
				pos,0,100,this.getHeight(),this); //화면 위치
//		if(pos==600) {
//			JOptionPane.showMessageDialog(this, count+"번째 말이 우승!\n");
//		}
	}
	@Override
	public void run() {
		for(int i=0; i<=600; i+=(int)(Math.random()*10+1)) {
			pos=i;
			repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
		rank++;
		if(rank==1)
			JOptionPane.showMessageDialog(this,rank+"등은"+getName()+" 축하해영");
		else if(rank==2)
			JOptionPane.showMessageDialog(this,rank+"등은"+getName()+" 이네여 아쉬워라~");
		else JOptionPane.showMessageDialog(this,rank+"등은"+getName()+" 이네요 더 노력하세여~");
	}
}
