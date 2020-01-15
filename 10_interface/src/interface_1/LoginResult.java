package interface_1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginResult extends JFrame implements WindowListener{
	
	private static String id="angel";
	private static String pwd="1004";
	String getid,getpw;
	
	public LoginResult(String inputId,String inputPwd) {
		JLabel label= new JLabel();
		
		this.getid=inputId;
		this.getpw=inputPwd;
		
//		if(getid.equals(id) && pwd.equals(pwd)) {
//			label.setText("로그인 성공");
//			//System.exit(0);
//		}else if(!getid.equals(id)||!getpw.equals("1004")){
//			label.setText("로그인 실패");
//			new Login();
//		}
		
		add(label);
		setBounds(1200,200,150,150);
		setVisible(true);
		this.addWindowListener(this);
		//Event
		//frame.addWindowListener((WindowListener) new Login());
//		frame.addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//		});

	}
	@Override
	public void paint(Graphics g) {
		if(getid.equals("angle") && getpw.equals("1004"))
		{	//g.drawString("로그인 성공",40,80);
			JOptionPane.showMessageDialog(this, "로그인성공");
		}else { //g.drawString("로그인 실패",40,80);
			JOptionPane.showMessageDialog(this, "로그인실패");
		}
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		System.exit(0);
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		//System.exit(0);
		setVisible(false);
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
	}
}