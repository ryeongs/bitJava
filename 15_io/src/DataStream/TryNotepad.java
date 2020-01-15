package DataStream;

import java.awt.Container;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

import javax.swing.*;

public class TryNotepad extends JFrame implements ActionListener {
	private JTextArea area;
	private MenuPane menu;
	File file;
	
	public TryNotepad() {
		super("�����ϱ� ���� �޸���");
		area = new JTextArea();
		
		JScrollPane scroll = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		area.setFont(new Font("�ü�ü",Font.BOLD,20));

		//MenuPane class
		menu = new MenuPane();
		this.setJMenuBar(menu);
		
		Container c =this.getContentPane();
		c.add(area);
	    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
		setBounds(800,100,600,500);
		setVisible(true);
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				int confirm = JOptionPane.showConfirmDialog(TryNotepad.this,"�����Ͻðڽ��ϱ�?","����",JOptionPane.YES_NO_CANCEL_OPTION);
				
				if(confirm == JOptionPane.YES_OPTION){
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
				else if(confirm==JOptionPane.NO_OPTION){
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
					
				}
			}
		});

		  event();  
	}


	public void event() {

		menu.getNewM().addActionListener(this);
		menu.getSaveM().addActionListener(this);
		menu.getOpenM().addActionListener(this);
		menu.getCutM().addActionListener(this);
		menu.getExitM().addActionListener(this);
		menu.getPasteM().addActionListener(this);
		menu.getCopyM().addActionListener(this);
		
		
	}
	/*
	 * 1.���� ���̾�αװ� ���
	 * 2.���̾�α׿��� ��Ҹ� ������ JFRameâ�� �׳� ���ִ�
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		//����Ű ���� - alt + c, v, x 
		
		if(e.getSource()==menu.exitM) {
//			System.exit(0);
			int result = JOptionPane.showConfirmDialog(this,
													"�����Ͻðڽ��ϱ�?",
													"�޸���",
													JOptionPane.YES_NO_CANCEL_OPTION);
			
			if(result ==JOptionPane.YES_OPTION) {
				if(area.getText().length()!=0) {
					openDialog();//���� ���̾�α� 
					fileRead();//�����б�
				}
				System.exit(0);
			}else if(result ==JOptionPane.NO_OPTION) {
				System.exit(0);
			}
			 
		}else if(e.getSource()==menu.getNewM()) {
			setLayout(null);
			area.setText("");
		}else if(e.getSource()==menu.getOpenM()) {
			openDialog();//���� ���̾�α� 

		}else if(e.getSource()==menu.getSaveM()) {
			//����
			saveDialog();
			fileWrite();
			
		}else if(e.getSource()==menu.getCutM()) {
			area.cut();
		}else if(e.getSource()==menu.getCopyM()) {
			area.copy();
		}else if(e.getSource()==menu.getPasteM()) {
			area.paste();
		}
		
	}
	public void saveDialog() {
		
//		JFileChooser chooser = new JFileChooser();
//		int result = chooser.showSaveDialog(this);
//		
//		if(result == JFileChooser.APPROVE_OPTION) { 
//			//it could be result ==0
//			file = chooser.getSelectedFile();//������ ��ο� ���ϸ� 
//			
//		}
//		JOptionPane.showMessageDialog(this, file);
//
		FileDialog fdlg = new FileDialog(this,"����",FileDialog.SAVE);
		fdlg.setVisible(true);
		String dir = fdlg.getDirectory();
		String file = fdlg.getFile();
		
		if (dir == null || file == null) return;
		
		try{
			ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(dir, file))));
			oos.writeObject(file);
			oos.close();
		}catch(IOException ee){}
		
	}	
	public void fileWrite() {
		if(file==null) return;

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			String data = area.getText();
			bw.write(data);
			bw.close();
		}catch(IOException e) {
			
		}
	
//		File file=new File("result.txt");
//		FileOutputStream fos = null;
//		DataOutputStream dos = new DataOutputStream(fos);
//		try {
//			fos = new FileOutputStream(file);
//			area.setText(fos+"");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	public void openDialog() {
		FileDialog fdlg = new FileDialog(this, "����", FileDialog.LOAD);
		fdlg.setVisible(true);
		String dir = fdlg.getDirectory();
		String file = fdlg.getFile();
		
		if(dir == null || file == null) return;
		
		try{
			ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(dir, file))));
			file =(String)ois.readObject();
			ois.close();				
		}catch(IOException ee){				
		}catch(ClassNotFoundException ee){}
		
		
//		JFileChooser chooser = new JFileChooser();
//		int result = chooser.showOpenDialog(this);
//		File file = null;
//		
//		if(result == JFileChooser.APPROVE_OPTION) { 
//			//it could be result ==0
//			file = chooser.getSelectedFile();//������ ��ο� ���ϸ� 
//			
//		}
//		JOptionPane.showMessageDialog(this, file);
	}
	public void fileRead() { //������������� �ȵȴ�
		if(file==null) return;
		
		area.setText("");

		try {
			BufferedReader br;
			//int������ �޾������� ������ ���ڰ� -1 
			//readline string���� ������ �������� null�̴� 
			//�ٹٲ� �� ���� �о�´� / ���� �ٷ� �ձ���
			br = new BufferedReader(new FileReader(file));
			String line;
			
			while((line=br.readLine())!=null) {
				//area.setText(line); 
				area.append(line);
			}
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new TryNotepad();


	}



}
