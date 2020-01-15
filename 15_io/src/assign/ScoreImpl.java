package assign;

import java.awt.FileDialog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class ScoreImpl implements Score {
	ScoreForm sf;	
	File file;
	private ArrayList<ScoreDTO> list = new ArrayList<ScoreDTO>();
	
	@Override
	public void input(ScoreDTO dto) {		
		list.add(dto);
		
	}

	@Override
	public void print(JTextArea output) {
		System.out.println("�й�  �̸�  ����  ����  ���� ");
		for(ScoreDTO dto:list) {
			output.append(dto.getHak()+" ");
			output.append(dto.getName()+" ");
			output.append(dto.getKor()+" ");
			output.append(dto.getEng()+" ");
			output.append(dto.getMath()+" ");
		}
		
	}

	@Override
	public void search(JTextArea output) {
		
		String stunum=JOptionPane.showInputDialog("�й� �Է�");
//		if(hak==null || hak.equals("")) return;
		
		output.setText("");
		int sw=0;
		for (ScoreDTO dto : list) {
			if (dto.getHak().equals(stunum)) {
				output.append(dto.toString()+"\n");
//				output.append(dto.getHak()+" ");
//				output.append(dto.getName()+" ");
//				output.append(dto.getKor()+" ");
//				output.append(dto.getEng()+" ");
//				output.append(dto.getMath()+" ");
			sw++;
			}
		}//for
		if(sw==0) JOptionPane.showMessageDialog(null, "ã�� ȸ�� ����");
		
	}

	@Override
	public void tot_desc() {
		Comparator<ScoreDTO> com = new Comparator<ScoreDTO>() {

			@Override
			public int compare(ScoreDTO dto1, ScoreDTO dto2) {
				return dto1.getTot() < dto2.getTot() ? 1:-1;
			}};
		Collections.sort(list,com);
		
	}

	@Override
	public void save() {
		//���� ���̾�α�
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(null);
		
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		}
		if(file == null) return; //���ϼ��� ���ϸ� ������
		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
//		for(ScoreDTO dto : list) {
//			oos.writeObject(dto);
//		}
//		
		FileDialog fdlg = new FileDialog(sf,"��������",FileDialog.SAVE);
		fdlg.setVisible(true);
		String dir = fdlg.getDirectory();
		String file = fdlg.getFile();
			
		try{
			ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(dir, file))));
			for(ScoreDTO dto : list) {
				oos.writeObject(dto);
			}
			oos.writeObject(file);
			oos.close();
		}catch(IOException ee){}
		
	}

	@Override
	public void load() {
		//���� ���̾�α� 
		if(file==null) return;
		
		FileDialog fdlg = new FileDialog(sf, "����", FileDialog.LOAD);
		fdlg.setVisible(true);
		String dir = fdlg.getDirectory();
		String file = fdlg.getFile();
		
		if(dir == null || file == null) return;
		list.clear(); //list �ʱ�ȭ 
		try{
			ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(dir, file))));
			while(true) {
				try {
					ScoreDTO dto =(ScoreDTO)ois.readObject();
					list.add(dto);
					
				}catch(EOFException e) {
					break;
				}
			}
			ois.close();		
			
		}catch(IOException ee){				
		}catch(ClassNotFoundException ee){}

				
	}
	

}
