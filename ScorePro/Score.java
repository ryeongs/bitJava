package io;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public interface Score {
	public void input(ScoreDTO dto);
//	public void print(JTextArea output);
//	public void search(JTextArea output);
	public void print(DefaultTableModel model);
	public void search(DefaultTableModel model);
	public void tot_desc(); //¼øÀ§
	public void save();
	public void load();

}
