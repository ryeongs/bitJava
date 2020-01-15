package assign;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class ScoreForm extends JFrame implements ActionListener{
	private ScoreImpl score;
	private JTextArea area;
	private JLabel stuNumL, nameL, korL, engL, mathL;
	private JTextField stuNumT, nameT, korT, engT, mathT;
	private JButton inputB, outputB, searchB, descB, saveB, loadB;
	private JPanel p1, p2, p3;
	private ScoreDTO dto;
	
	public ScoreForm(){
		score = new ScoreImpl();
		setVisible(true);
		setBounds(800,100,700,600);
		area = new JTextArea();

//inputB, outputB, searchB, descB, saveB, loadB
		inputB=new JButton("input");
		outputB=new JButton("output");
		searchB=new JButton("search");
		descB=new JButton("desc");
		saveB=new JButton("save");
		loadB=new JButton("load");
		
		stuNumL=new JLabel("학번");
		nameL=new JLabel("이름");
		korL=new JLabel("국어");
		engL=new JLabel("영어");
		mathL=new JLabel("수학");

		//stuNumT, nameT, korT, engT, mathT
		stuNumT=new JTextField();
		nameT=new JTextField();
		korT=new JTextField();
		engT=new JTextField();
		mathT=new JTextField();
		
		
		Container con = getContentPane();
		
		//Button
		JPanel jp = new JPanel(new FlowLayout(FlowLayout.CENTER));
		jp.add(inputB);
		jp.add(outputB);
		jp.add(searchB);
		jp.add(descB);
		jp.add(saveB);
		jp.add(loadB);
		
		//stuNumL, nameL, korL, engL, mathL
		JPanel jpL = new JPanel(new GridLayout(5,2,50,80));
		jpL.add(stuNumL);
		jpL.add(stuNumT);

		jpL.add(nameL);
		jpL.add(nameT);

		jpL.add(korL);
		jpL.add(korT);

		jpL.add(engL);
		jpL.add(engT);

		jpL.add(mathL);
		jpL.add(mathT);
		
		con.add("South",jp);
		
		con.add(area);
		JPanel p3 = new JPanel(new GridLayout(1,2,3,10));
		p3.add(jpL);
		p3.add(area);
		
		con.add(p3);
		
		inputB.addActionListener(this);
		outputB.addActionListener(this);
		searchB.addActionListener(this);
		descB.addActionListener(this);
		saveB.addActionListener(this);
		loadB.addActionListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==inputB) {
			String stuNum = stuNumT.getText();
			String name = nameT.getText();
			int kor = Integer.parseInt(korT.getText());
			int eng = Integer.parseInt(engT.getText());
			int math = Integer.parseInt(mathT.getText());
			
			//inputB, outputB, searchB, descB, saveB, loadB
			dto = new ScoreDTO(stuNum,name,kor,eng,math);
			int tot = dto.getTot();
			double avg = dto.getAvg();
			dto = new ScoreDTO(stuNum,name,kor,eng,math,tot,avg);
			score.input(dto);
			
			stuNumT.setText("");
			nameT.setText("");
			korT.setText("");
			engT.setText("");
			mathT.setText("");
			
		}else if(e.getSource()==outputB) {
			score.print(area);
		}else if(e.getSource()==searchB) {
			score.search(area);
		}else if(e.getSource()==descB) {
			score.tot_desc();
		}else if(e.getSource()==saveB) {
			score.save();
		}else if(e.getSource()==loadB) {
			score.load();
		}
		
	}
	public static void main(String[] args) {
		new ScoreForm();
	}
}
