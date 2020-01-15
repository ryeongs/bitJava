package thread;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class RunRace extends JFrame implements ActionListener{
	private int count;
	private String[] name;
	private Button btn;
	Racer[] r;

	public RunRace(int count, String[] name) {
		this.count=count;
		this.name=name;
		btn=new Button(" 출발 ");
		
		Panel p = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p.add(btn);
		add("South",p);

		Panel p2=new Panel(new GridLayout(count,1)); //행 열
	
		add(p2);
		add("Center",p2);
		r=new Racer[count];
		for (int i = 0; i < count; i++) {
			r[i]=new Racer(); //Canvas(Racer) 생성 
			p2.add(r[i]);
			r[i].setName(name[i]);
		}
		
		setBounds(700,200,600,500);
		setResizable(false);
		setVisible(true);
		setBackground(Color.WHITE);
		//setLayout(null); 이렇게도 가능
//		btn.setBounds(400, 410, 80, 60);
//		add(btn);
		btn.addActionListener(this);
		//Event
		this.addWindowListener(new WindowAdapter() {
	    	  @Override
	    	  public void windowClosing(WindowEvent e) {
	    		  System.exit(0);
	    	  }
	      });
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		btn.setEnabled(false); //연속으로 버튼 못누르게
		
		//스레드 생성
		Thread[] t=new Thread[count]; //배열 생성 // 말의 수만큼
		for (int i = 0; i < count; i++) {
			t[i]=new Thread(r[i]); //racer가 i만큼 스레드를 생성
			t[i].setPriority((int)(Math.random()*10+1));//1-10난수 
			t[i].start();
			
		}
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("경주마 수를 입력:");
		int count =scan.nextInt();
		
		String[] name = new String[count];
		
		for(int i =0; i<count;i++) {
			System.out.print("경주마 이름 입력:");
			name[i]=scan.next();
		}
		
		new RunRace(count,name);
	}

}
