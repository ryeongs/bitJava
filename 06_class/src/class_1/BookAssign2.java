package class_1;

public class BookAssign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookAssign1 ba=new BookAssign1();
		ba.setBookName("�ڹٿϼ�");
		ba.setAuthor("��ϼ�");
		ba.setPrice(25000);
		System.out.println("å�̸�: "+ba.getBookName()
		+"\n�� ��: "+ba.getAuthor()
		+"\n�� ��: "+ba.getPrice());
		
		System.out.println();
		
		BookAssign1 ba2=new BookAssign1();
		ba2.setBookName("JSP���");
		ba2.setAuthor("��JP");
		ba2.setPrice(35000);
		System.out.println("å�̸�: "+ba2.getBookName()
		+"\n�� ��: "+ba2.getAuthor()
		+"\n�� ��: "+ba2.getPrice());
	}

}

