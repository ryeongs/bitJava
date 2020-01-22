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
		
		input = new JLabel("개인정보입력");
		input.setHorizontalAlignment(JLabel.CENTER);
		input.setBackground(new Color(230,190,230));
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.setBackground(new Color(230,190,230));
		nameL = new JLabel("이        름:");
		nameT = new JTextField(7);
		
		p1.add(nameL);
		p1.add(nameT);
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p2.setBackground(new Color(230,190,230));
		phoneL = new JLabel("전화번호:");
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
		sexL = new JLabel("성         별:");
		man = new JRadioButton("남성");
		man.setBackground(new Color(230,190,230));
		woman = new JRadioButton("여성",true);
		woman.setBackground(new Color(230,190,230));
		ButtonGroup group = new ButtonGroup();
		group.add(man);
		group.add(woman);
		p3.add(sexL);
		p3.add(man);
		p3.add(woman);
		
		JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p4.setBackground(new Color(230,190,230));
		hobbyL = new JLabel("취         미:");
		hobbyL.setBackground(new Color(230,190,230));
		book = new JCheckBox("독서");
		book.setBackground(new Color(230,190,230));
		movie = new JCheckBox("영화");
		movie.setBackground(new Color(230,190,230));
		music = new JCheckBox("음악");
		music.setBackground(new Color(230,190,230));
		game = new JCheckBox("게임");
		game.setBackground(new Color(230,190,230));
		shop = new JCheckBox("쇼핑");
		shop.setBackground(new Color(230,190,230));
		p4.add(hobbyL);
		p4.add(book);
		p4.add(movie);
		p4.add(music);
		p4.add(game);
		p4.add(shop);
		
		JPanel p5 = new JPanel();
		p5.setBackground(new Color(230,190,230));
		enroll = new JButton("등록");
		mod = new JButton("수정");
		mod.setEnabled(false);
		del = new JButton("삭제");
		del.setEnabled(false);
		erase = new JButton("지우기");
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
		listL = new JLabel("전체목록");
		listL.setHorizontalAlignment(JLabel.CENTER);
		
		listJ = new JList(new DefaultListModel<FriendDTO>());
		model = (DefaultListModel<FriendDTO>) listJ.getModel();
		
		JScrollPane scroll = new JScrollPane(listJ);
		center.add("North",listL);
		center.add("Center",scroll);
		
		JPanel down = new JPanel(new BorderLayout());
		down.setBackground(new Color(230,190,230));
		down.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		infoL = new JLabel("개인정보분석");
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
		
		//DB에 있는 모든레코드를 꺼내서 JList(전체목록)에 뿌리기
		FriendDAO dao = FriendDAO.getInstance();
		List<FriendDTO>list2 = dao.getFriendList();
		
		for(FriendDTO dto :list2) {
			model.addElement(dto);
		}
		
		
		
		//1.JList에 이름울 클릭하면 데이터가 왼쪽에 다 보여준다
		//등록 비활성
		//수정,삭제,지우기 활성화
		//2.JList에 이름을 다시 클릭하면 수정된 내용으로 보여준다
		//3.삭제 
		//JList에서 삭제된 이름도 사라진다
		//4.지우기
		//초기화 , 등록 활성화, 수정,삭제,지우기 비활성화
	}
	
	public void event() {
		enroll.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == enroll) {

			//데이터 얻어오기
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
			
			//FriendDTO - 1인분
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
			FriendDAO dao = FriendDAO.getInstance(); //DB 는 singleton으로 잡아줘야한다
			int seq = dao.getSeq();
			dto.setSeq(seq);
			
			dao.insertArticle(dto);
			
			//결과
			clear();
			area.setText("\n\t데이터를 등록하였습니다");
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
