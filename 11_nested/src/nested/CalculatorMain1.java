package nested;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*
 * result - 처음에 들어온값,or  중간 결과 
 * 1.op에 연산자가 0이면 result에 값을 넣는다
 * 2.연산자를 op에 넣는다
 * 3.op가 0이 아니면 연산을 하여 결과를 result에 넣는다
 * 4.연산자를 op에 넣는다  
 * 
 * 3번4번 반복
 */
public class CalculatorMain1 extends JFrame implements ActionListener{
	private JLabel dispL, inputL;   
	private JButton[] button;   
	
	private StringBuffer dispBuf = new StringBuffer();
	private StringBuffer inputBuf = new StringBuffer();
	
	private double result;
	private String op; //연산자
	int num;
	boolean opCheck;
	private DecimalFormat df=new DecimalFormat("#.#######");
	public CalculatorMain1() {
      setLayout(null);
      
      dispL = new JLabel("", JLabel.RIGHT);
      dispL.setBackground(Color.WHITE);
      dispL.setOpaque(true);
      dispL.setBounds(9,10,375,50);
      
      inputL = new JLabel("0", JLabel.RIGHT);
      inputL.setBackground(Color.WHITE);
      inputL.setOpaque(true);
      inputL.setBounds(9,70,375,50);
      inputL.setFont(new Font("궁서체",Font.BOLD,15));
      
      String[] title = {"←","C",
    		            "7","8","9","/",
    		            "4","5","6","x",
    		            "1","2","3","-",
    		            ".","0","=","+"};
      button = new JButton[18];
      for(int i=0; i<button.length; i++) {
    	  button[i] = new JButton(title[i]);
      }
      
      button[0].setBounds(9,130,185,50);// ←
      button[1].setBounds(199,130,185,50);// C
      
      button[2].setBounds(9,190,90,50);//7
      button[3].setBounds(104,190,90,50);//8
      button[4].setBounds(199,190,90,50);//9
      button[5].setBounds(294,190,90,50);// 나누기
      
      button[6].setBounds(9,250,90,50);//4
      button[7].setBounds(104,250,90,50);//5
      button[8].setBounds(199,250,90,50);//6
      button[9].setBounds(294,250,90,50);//*
      
      button[10].setBounds(9,310,90,50);//1
      button[11].setBounds(104,310,90,50);//2
      button[12].setBounds(199,310,90,50);//3
      button[13].setBounds(294,310,90,50);//-
      
      button[14].setBounds(9,370,90,50);//.
      button[15].setBounds(104,370,90,50);//0
      button[16].setBounds(199,370,90,50);//=
      button[17].setBounds(294,370,90,50);//+
      
      this.addWindowListener(new WindowAdapter() {
    	  @Override
    	  public void windowClosing(WindowEvent e) {
    		  System.exit(0);
    	  }
      });
      
      add(dispL);
      add(inputL);

      for(int i=0; i<button.length; i++) {
    	  add(button[i]);
    	  button[i].addActionListener(this);  
      }
      
      setTitle("계산기");
      setBounds(800,300,400,460);
      setResizable(false);
      setVisible(true);
      
   }

//dispBuf -->"" 
//inputBuf -->""
	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼 숫자
		String pushB = e.getActionCommand();
		
		if (pushB == "1" || pushB == "2" || pushB == "3" || pushB == "4" || pushB == "5" || pushB == "6" || pushB == "7"
				|| pushB == "8" || pushB == "9" || pushB == "0") {
			if (inputBuf.toString().equals("0")) {
				inputBuf.delete(0, 1); // 0부터 시작해서 1까지 지워라
				inputL.setText(inputBuf + "");
			}
			inputBuf.append(pushB);
//			dispBuf.append(pushB);
//		//	dispL.setText(inputBuf+"");
			inputL.setText(inputBuf + "");
			
		}  if (pushB == "←") {
			inputBuf.delete(inputBuf.length() - 1, inputBuf.length());

			if(inputBuf.length()==0) {
				inputBuf.append("0");
			}
			inputL.setText(inputBuf+"");
		}  if(pushB =="C") {
			dispBuf.delete(0,  dispBuf.length());
			inputBuf.delete(0,inputBuf.length());
			inputBuf.append("0");
			
			dispL.setText("");
			inputL.setText("0");
			opCheck=true;
			
		}  if(pushB==".") {
			if(inputBuf.indexOf(".")==-1) {
				inputBuf.append(".");
			}
			inputL.setText(inputBuf+"");
		} 

		//연산자=============================================

		if(pushB =="+") {
			if(!opCheck) {
				calc();
				
				dispBuf.append(inputBuf+" + ");
				op="+";
				
				dispL.setText(dispBuf+"");
				inputL.setText(df.format(result));
				 inputBuf.delete(0, inputBuf.length());

				opCheck=true;
			}
		}else if(pushB == "-") {
			calc();
			
			dispBuf.append(inputBuf+" - ");
			op="-";
			
			dispL.setText(dispBuf+"");
			inputL.setText(df.format(result));
			 inputBuf.delete(0, inputBuf.length());

			opCheck=true;
		}else if(pushB == "*") {
			calc();
			
			dispBuf.append(inputBuf+" * ");
			op="*";
			
			dispL.setText(dispBuf+"");
			inputL.setText(df.format(result));
			 inputBuf.delete(0, inputBuf.length());

			opCheck=true;
		}else if(pushB == "/") {
			calc();
			
			dispBuf.append(inputBuf+" / ");
			op="/";
			
			dispL.setText(dispBuf+"");
			inputL.setText(df.format(result));
			 inputBuf.delete(0, inputBuf.length());

			opCheck=true;
		}
	

//		//연산자=============================================
//		 if (pushB == "+" || pushB == "-" || pushB == "x" || pushB == "/") {
//			 dispBuf.append(pushB+"");
//			 dispL.setText(dispBuf+"");
//			 num = Integer.parseInt(inputBuf+"");
//			 inputBuf.delete(0, inputBuf.length());
//			 
//
//			 op = pushB;
//		}
//		 
		if (pushB == "=") {
			calc();
			dispBuf.append(inputBuf+" = ");
			
			dispL.setText(dispBuf+"");
			inputL.setText(df.format(result));
			
			inputBuf.delete(0, inputBuf.length());
			dispBuf.delete(0, dispBuf.length());
			
			op="0";
			opCheck=false;
			
		}
	}
	
	public void calc() {
		if(op=="0") result=Double.parseDouble(inputBuf+"");
		else if(op=="+") result+=Double.parseDouble(inputBuf+"");
		else if(op=="-") result-=Double.parseDouble(inputBuf+"");
		else if(op=="*") result*=Double.parseDouble(inputBuf+"");
		else if(op=="/") result/=Double.parseDouble(inputBuf+"");
	}
	public static void main(String[] args) {
		new CalculatorMain1();
	}
}











