package nested;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CalculatorMain extends JFrame {
	private JLabel dispL, inputL;   
	private JButton[] button;   
   
   public CalculatorMain() {
      setLayout(null);
      
      dispL = new JLabel("", JLabel.RIGHT);
      dispL.setBackground(Color.WHITE);
      dispL.setOpaque(true);
      dispL.setBounds(9,10,375,50);
      
      inputL = new JLabel("0", JLabel.RIGHT);
      inputL.setBackground(Color.WHITE);
      inputL.setOpaque(true);
      inputL.setBounds(9,70,375,50);
      
      String[] title = {"��","C",
    		            "7","8","9","/",
    		            "4","5","6","*",
    		            "1","2","3","-",
    		            ".","0","=","+"};
      button = new JButton[18];
      for(int i=0; i<button.length; i++) {
    	  button[i] = new JButton(title[i]);
      }
      
      button[0].setBounds(9,130,185,50);
      button[1].setBounds(199,130,185,50);
      
      button[2].setBounds(9,190,90,50);
      button[3].setBounds(104,190,90,50);
      button[4].setBounds(199,190,90,50);
      button[5].setBounds(294,190,90,50);
      
      button[6].setBounds(9,250,90,50);
      button[7].setBounds(104,250,90,50);
      button[8].setBounds(199,250,90,50);
      button[9].setBounds(294,250,90,50);
      
      button[10].setBounds(9,310,90,50);
      button[11].setBounds(104,310,90,50);
      button[12].setBounds(199,310,90,50);
      button[13].setBounds(294,310,90,50);
      
      button[14].setBounds(9,370,90,50);
      button[15].setBounds(104,370,90,50);
      button[16].setBounds(199,370,90,50);
      button[17].setBounds(294,370,90,50);
      
      add(dispL);
      add(inputL);
      for(int i=0; i<button.length; i++) {
    	  add(button[i]);
      }
      
      setTitle("����");
      setBounds(800,300,400,460);
      setResizable(false);
      setVisible(true);
   }

   public static void main(String[] args) {
      new CalculatorMain();
   }
}











