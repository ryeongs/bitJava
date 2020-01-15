package interface_1;
//Assign1 - 
/*1.��� ��ư ������ JTextField(idT,pwdT)�� ������ �ʱ�ȭ
  
  2.�α��� ��ư�� ������ loginResult �α��� ���� or �α��� ���� �߱�
   -LoginResult.java ����
   -LoginResult ���� �� (id�� "angle", pwd�� "1004" �̸� ���� �ƴϸ� ����) 
   -loginresult�� ������X(����)�� ������ login â���� ���ƿ´�
   
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
//�θ� awt �ڽ��� swing
public class Login extends JFrame implements WindowListener,ActionListener {
	private JLabel idL,pwdL; //�ܰ� 
	private JTextField idT,pwdT;
	private Button loginB, cancelB;
	
	public String inputID;
	public String inputPwd;
	private String pwd;
	
	public Login() {
		this.setLayout(null); //���� ���̾ƿ��� �ʱ�ȭ/��ǥ �����ؾ���

		idL = new JLabel("ID");
		pwdL = new JLabel("Password");
		
		idT = new JTextField();
		pwdT = new JPasswordField();
		
		loginB=new Button("Login");
		cancelB =new Button("Cancel");
//		idL.setLocation(50, 80);
//		idL.setSize(50,30);
		//��ġ�� ������ �ΰ��� ���� ��°� setBounds 
		idL.setBounds(50, 80, 50, 25);
		idT.setBounds(120, 80, 100,25);
		
		pwdL.setBounds(50,105, 60, 25);
		pwdT.setBounds(120,105,100,25);

		loginB.setBounds(100,160 ,60 ,25 );
		cancelB.setBounds(160,160 ,60 ,25 );

		Container c= this.getContentPane(); //�����̳ʸ� ���
		c.add(idL); //�����̳� �ȿ� �־��ش�
		c.add(idT);
		c.add(pwdL);
		c.add(pwdT);
		
		c.add(loginB);
		c.add(cancelB);
		
		setBounds(900,100,300,300);
		setVisible(true);
		
		//�̺�Ʈ
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
		if(e.getSource()==cancelB) { //e.getActionCommand()=="Login" ����!! 
			idT.setText(" "); idT.setText(null);
			pwdT.setText(" "); pwdT.setText(null);
			System.out.println("�ʱ�ȭ");
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
