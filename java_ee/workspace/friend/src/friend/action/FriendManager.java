package friend.action;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import friend.bean.FriendDTO;
import friend.dao.FriendDAO;

public class FriendManager extends JFrame implements ActionListener{
	private JLabel nameL, phoneL, sexL, hobbyL,input, d1,d2;
	private JTextField nameT, phone1, phone2;
	private JComboBox phoneC;
	private JRadioButton man, woman;
	private JCheckBox book, movie, music, game, shop;
	private JButton enroll, mod, del, erase;
	private JLabel infoL, listL, areaL;
	private JTextArea area;
	private JList listJ;
	private DefaultListModel<FriendDTO> model;
	
	public FriendManager() {
		
		input = new JLabel("���������Է�");
		input.setHorizontalAlignment(JLabel.CENTER);
		input.setBackground(new Color(230,190,230));
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.setBackground(new Color(230,190,230));
		nameL = new JLabel("��        ��:");
		nameT = new JTextField(7);
		
		p1.add(nameL);
		p1.add(nameT);
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p2.setBackground(new Color(230,190,230));
		phoneL = new JLabel("��ȭ��ȣ:");
		String num[] = {"010", "011", "016", "017", "018", "019"};
		phoneC = new JComboBox<String>(num);
		d1 = new JLabel("-");
		phone1 = new JTextField(4);
		d2 = new JLabel("-");
		phone2 = new JTextField(4);
		p2.add(phoneL);
		p2.add(phoneC);
		p2.add(d1);
		p2.add(phone1);
		p2.add(d2);
		p2.add(phone2);
		
		JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p3.setBackground(new Color(230,190,230));
		sexL = new JLabel("��         ��:");
		man = new JRadioButton("����");
		man.setBackground(new Color(230,190,230));
		woman = new JRadioButton("����",true);
		woman.setBackground(new Color(230,190,230));
		ButtonGroup group = new ButtonGroup();
		group.add(man);
		group.add(woman);
		p3.add(sexL);
		p3.add(man);
		p3.add(woman);
		
		JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p4.setBackground(new Color(230,190,230));
		hobbyL = new JLabel("��         ��:");
		hobbyL.setBackground(new Color(230,190,230));
		book = new JCheckBox("����");
		book.setBackground(new Color(230,190,230));
		movie = new JCheckBox("��ȭ");
		movie.setBackground(new Color(230,190,230));
		music = new JCheckBox("����");
		music.setBackground(new Color(230,190,230));
		game = new JCheckBox("����");
		game.setBackground(new Color(230,190,230));
		shop = new JCheckBox("����");
		shop.setBackground(new Color(230,190,230));
		p4.add(hobbyL);
		p4.add(book);
		p4.add(movie);
		p4.add(music);
		p4.add(game);
		p4.add(shop);
		
		JPanel p5 = new JPanel();
		p5.setBackground(new Color(230,190,230));
		enroll = new JButton("���");
		mod = new JButton("����");
		mod.setEnabled(false);
		del = new JButton("����");
		del.setEnabled(false);
		erase = new JButton("�����");
		erase.setEnabled(false);
		p5.add(enroll);
		p5.add(mod);
		p5.add(del);
		p5.add(erase);
		
		JPanel p = new JPanel(new GridLayout(6,1,4,4));
		p.setBackground(new Color(230,190,230));
		p.add(input);
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		
		JPanel center = new JPanel(new BorderLayout());
		center.setBackground(new Color(230,190,230));
		center.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		listL = new JLabel("��ü���");
		listL.setHorizontalAlignment(JLabel.CENTER);
		
		listJ = new JList(new DefaultListModel<FriendDTO>());
		model = (DefaultListModel<FriendDTO>) listJ.getModel();
		
		JScrollPane scroll = new JScrollPane(listJ);
		center.add("North",listL);
		center.add("Center",scroll);
		
		JPanel down = new JPanel(new BorderLayout());
		down.setBackground(new Color(230,190,230));
		down.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		infoL = new JLabel("���������м�");
		infoL.setHorizontalAlignment(JLabel.CENTER);
		area = new JTextArea(7,80);
		
		down.add("North",infoL);
		down.add("Center",area);
		
		Container con = this.getContentPane();
		con.setBackground(new Color(230, 230, 190));
		con.setLayout(new BorderLayout());
		
		con.add("West",p);
		con.add("Center",center);
		con.add("South",down);
		
		setBounds(300, 300, 550, 500);
		setVisible(true);
		setBackground(new Color(230,190,230));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//DB�� �ִ� ��緹�ڵ带 ������ JList(��ü���)�� �Ѹ���
		FriendDAO dao = FriendDAO.getInstance();
		List<FriendDTO>list2 = dao.getFriendList();
		
		for(FriendDTO dto :list2) {
			model.addElement(dto);
		}
		
		
		
		//1.JList�� �̸��� Ŭ���ϸ� �����Ͱ� ���ʿ� �� �����ش�
		//��� ��Ȱ��
		//����,����,����� Ȱ��ȭ
		//2.JList�� �̸��� �ٽ� Ŭ���ϸ� ������ �������� �����ش�
		//3.���� 
		//JList���� ������ �̸��� �������
		//4.�����
		//�ʱ�ȭ , ��� Ȱ��ȭ, ����,����,����� ��Ȱ��ȭ
	}
	
	public void event() {
		enroll.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == enroll) {

			//������ ������
			String name= nameT.getText();
			String tel = (String) phoneC.getSelectedItem();
			String tel2 = phone1.getText();
			String tel3 = phone2.getText();
			//Gender
			int gender =0;
			if(man.isSelected()) gender =0;
			else if(woman.isSelected()) gender =1;
			
			int read = (this.book.isSelected() ? 1:0);
			int music1 = (this.music.isSelected() ? 1:0);
			int movie1 = (this.movie.isSelected() ? 1:0);
			int game1 = (this.game.isSelected() ? 1:0);
			int shopping = (this.shop.isSelected() ? 1:0);
			
			//FriendDTO - 1�κ�
			FriendDTO dto = new FriendDTO();
			dto.setName(name);
			dto.setTel1(tel);
			dto.setTel2(tel2);
			dto.setTel3(tel3);
			dto.setGender(gender);
			dto.setRead(read);
			dto.setMusic(music1);
			dto.setMovie(movie1);
			dto.setGame(game1);
			dto.setShopping(shopping);
			
			//DB - FriendDAO
			FriendDAO dao = FriendDAO.getInstance(); //DB �� singleton���� �������Ѵ�
			int seq = dao.getSeq();
			dto.setSeq(seq);
			
			dao.insertArticle(dto);
			
			//���
			clear();
			area.setText("\n\t�����͸� ����Ͽ����ϴ�");
			model.addElement(dto);
			
			
		}
	}

	private void clear() {
		nameT.setText("");
		phoneC.setSelectedItem("010");
		phone1.setText("");
		phone2.setText("");
		man.setSelected(true);
		book.setSelected(false);
		movie.setSelected(false);
		music.setSelected(false);
		game.setSelected(false);
		shop.setSelected(false);
		area.setText("");
	}

	public static void main(String[] args) {
		new FriendManager().event();
	}
}
