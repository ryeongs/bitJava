package nested;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Card {
	private Frame frame;
	private CardLayout card;
	public Card() {
		frame = new Frame();
		card = new CardLayout();
		frame.setLayout(card);
		
		String[] title= {"»¡°­","ÃÊ·Ï","ÆÄ¶û","³ë¶û","º¸¶ó","ÇÏ´Ã"};
		Panel[] p =new Panel[6];
		Color[] color= {Color.DARK_GRAY,Color.black,Color.gray,Color.LIGHT_GRAY,
				Color.BLUE,Color.CYAN,Color.PINK};
		
		for(int i=0;i<p.length;i++) {
			p[i]=new Panel();
			p[i].setBackground(color[i]);
			
			frame.add(p[i],title[i]);
			
			//Event
			p[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					card.next(frame);
//					card.show(frame,"º¸¶ó"); 
				}

			});
		}
		
		frame.setBounds(900,100,300,300);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	public static void main(String[] args) {
		new Card();
	}

}
