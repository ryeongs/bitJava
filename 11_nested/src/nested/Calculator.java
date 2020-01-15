package nested;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
 * 1.처음에 0을 누르면 0만 보인다
 * .을 누르고 0을 누르면 0이 추가된다
 * 앞에 유료숫자가 있으면 0은 추가된다
 *2.이 있으면 더이상 . 이 추가되면 안된다
  3. <- 에서 더이상 지울것이 없으면 0으로 떠 있는다
  4.연산자 누르면 위에 history에 표시된다
  
 */
public class Calculator extends JFrame implements ActionListener {
	private JLabel tf,history;
	JPanel p,p2,p3,p4;
	JButton[] button;
	
	String str_num;
	String temp1, temp2; //temp1 - 입력받은 숫자 temp2 - 연산자 
	double result;
	String back; //backspace 값 저장
	String back_history;
	int back_check;
	int dat; // . 이 1개 이상있을 때 
	//JLabel label= new JLabel();

	public Calculator() {
		super("계산기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		history =new JLabel("",JLabel.RIGHT);
		tf = new JLabel("0",JLabel.RIGHT);
		
		history.setBounds(300,600,500,30);

		setLayout(null);
		
		p = new JPanel(new GridLayout(1, 1, 3, 3));
		p2 = new JPanel(new GridLayout(1, 1, 3, 3));
		p3 = new JPanel(new GridLayout(1, 2, 3, 3));
		p4 = new JPanel(new GridLayout(4, 4, 3, 3));

		add(p);
		add(p2);
		add(p3);
		add(p4);
		//p.setPreferredSize(new Dimension(x,y));
		String str_button[] = {"←","C", 
				"7", "8", "9", "/",
				"4", "5", "6", "*", 
				"1", "2", "3", "-",
				".","0", "=" ,"+"};

		button = new JButton[str_button.length];
		
		for (int i = 0; i < str_button.length; i++) {
			button[i] = new JButton(str_button[i]);
			button[i].addActionListener(this);
			add(button[i]);
			p3.add(button[i]);
			p4.add(button[i]);
		}
		p.add(history);
		p2.add(tf);
		
		p.setBackground(Color.WHITE);
		p2.setBackground(Color.WHITE);
		
		p.setBounds(10, 20, 300, 30);
		p2.setBounds(10, 60, 300, 30);
		p3.setBounds(10, 100, 300, 40);
		p4.setBounds(10, 140, 300, 200);

		setBounds(700,300,330,380);
		setResizable(false);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String source = e.getActionCommand();
		str_num = tf.getText();
		
		tf.setText(str_num);
		//Clear----------------------------
		if (source == "C") {
			tf.setText("0");
			history.setText("0");
			temp1 = temp2 = "";
		}
		//Backspace-----------------------
		if (source == "←") {
			back = str_num.substring(0, str_num.length() - 1);
			back_history= back;
			history.setText(back);
			tf.setText(back);
			//Backspace check--------------------
			if(back.length()==0) { tf.setText("0"); history.setText("0"); }
		}
		
		if (source == "+" || source == "-" || source == "*" || source == "/") {
			tf.setText("" + result);
			temp1 = str_num;
			temp2 = source;
			
			tf.setText("0");
			
			//history.setText("0");
		}
		if (source == "=") {
			history.setText(temp1+temp2+str_num+"=");
			if (temp2 == "+") {
				
				result = Double.parseDouble(temp1) + Double.parseDouble(str_num);
				
				history.setText("=");}
			if (temp2 == "-") {
				result = Double.parseDouble(temp1) - Double.parseDouble(str_num);
				history.setText(temp2);
				history.setText(str_num+"=");}
			if (temp2 == "*") {
				result = Double.parseDouble(temp1) * Double.parseDouble(str_num);
				history.setText(temp2);
				history.setText(str_num+"=");}
			if (temp2 == "/") {
				result = Double.parseDouble(temp1) / Double.parseDouble(str_num);
				history.setText(temp2);
				history.setText(str_num+"=");}
			history.setText(temp1+temp2+str_num+"=");
			tf.setText("" + result);
		}

		if (source == "0" || source == "1" || source == "2" || source == "3" || source == "4" || source == "5"
				|| source == "6" || source == "7" || source == "8" || source == "9") {
			if (str_num.equals("0")) {
				tf.setText(source);
				history.setText(source);
			}else {
				tf.setText(str_num + source);
				history.setText(str_num+source);
			}
		}
		
		if (source == ".") {
			tf.setText(str_num + source);
			history.setText(str_num+source);
			dat++;
			if(dat<=1) {
				tf.setText("0");
				history.setText("0");
			}
		}
		//0 눌렀을때
		if(source == "0") {
			//tf.setText("0");
			if(source.indexOf(".")==-1) 
				if(str_num.equals("0"))
					tf.setText(str_num+".");
			tf.setText("0");
		}
	}

	public static void main(String[] args) {
		new Calculator();
	}
}
