package interface_1;
//Assign1 - 
/*1.취소 버튼 누르면 JTextField(idT,pwdT)의 내용이 초기화
  
  2.로그인 버튼을 누르면 loginResult 로그인 성공 or 로그인 실패 뜨기
   -LoginResult.java 생성
   -LoginResult 에서 비교 (id가 "angle", pwd가 "1004" 이면 성공 아니면 실패) 
   -loginresult를 닫으면X(종료)를 누르면 login 창으로 돌아온다
   
*/

import java.awt.Button;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//부모가 awt 자식은 swing
public class Login extends JFrame implements WindowListener,ActionListener {
	private JLabel idL,pwdL; //외관 
	private JTextField idT,pwdT;
	private Button loginB, cancelB;
	
	public String inputID;
	public String inputPwd;
	private String pwd;
	
	public Login() {
		this.setLayout(null); //보더 레이아웃을 초기화/좌표 지정해야함

		idL = new JLabel("ID");
		pwdL = new JLabel("Password");
		
		idT = new JTextField();
		pwdT = new JPasswordField();
		
		loginB=new Button("Login");
		cancelB =new Button("Cancel");
//		idL.setLocation(50, 80);
//		idL.setSize(50,30);
		//위치와 사이즈 두개를 같이 잡는게 setBounds 
		idL.setBounds(50, 80, 50, 25);
		idT.setBounds(120, 80, 100,25);
		
		pwdL.setBounds(50,105, 60, 25);
		pwdT.setBounds(120,105,100,25);

		loginB.setBounds(100,160 ,60 ,25 );
		cancelB.setBounds(160,160 ,60 ,25 );

		Container c= this.getContentPane(); //컨테이너를 잡고
		c.add(idL); //컨터이너 안에 넣어준다
		c.add(idT);
		c.add(pwdL);
		c.add(pwdT);
		
		c.add(loginB);
		c.add(cancelB);
		
		setBounds(900,100,300,300);
		setVisible(true);
		
		//이벤트
		this.addWindowListener(this);
		loginB.addActionListener(this);
		cancelB.addActionListener(this);
		
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
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cancelB) { //e.getActionCommand()=="Login" 가능!! 
			idT.setText(" "); idT.setText(null);
			pwdT.setText(" "); pwdT.setText(null);
			System.out.println("초기화");
		}
		else if(e.getSource()==loginB) {
			
			String id = idT.getText();
			String pwd = pwdT.getText();
			new LoginResult(id,pwd);
			
		}
	}
	
	public static void main(String[] args) {
		new Login();
	}

}
