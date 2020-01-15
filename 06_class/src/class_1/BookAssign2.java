package class_1;

public class BookAssign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookAssign1 ba=new BookAssign1();
		ba.setBookName("자바완성");
		ba.setAuthor("김완성");
		ba.setPrice(25000);
		System.out.println("책이름: "+ba.getBookName()
		+"\n저 자: "+ba.getAuthor()
		+"\n가 격: "+ba.getPrice());
		
		System.out.println();
		
		BookAssign1 ba2=new BookAssign1();
		ba2.setBookName("JSP잡기");
		ba2.setAuthor("송JP");
		ba2.setPrice(35000);
		System.out.println("책이름: "+ba2.getBookName()
		+"\n저 자: "+ba2.getAuthor()
		+"\n가 격: "+ba2.getPrice());
	}

}

