package Pro_ClassAssign;
class BookShop{
	private String bookName;
	private String author;
	private int price;
	
	public void setBookName(String bookName) {
		System.out.println("this = "+this);
		this.bookName=bookName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setAuthor(String a) {
		this.author=a;
	}
	public String getAuthor() {
		return author;
	}
	public void setPrice(int p) {
		this.price=p;
	}
	public int getPrice() {
		return price;
	}
}

//----------------------------
public class BookShopAssign1 {
	public static void main(String[] args) {
		BookShop aa=new BookShop();
		System.out.println("��ü="+aa);
		aa.setBookName("�ڹٿϼ�");
		aa.setAuthor("��ϼ�");
		aa.setPrice(25000);
		System.out.println("å�̸� :"+aa.getBookName());
		System.out.println("���� : "+aa.getAuthor());
		System.out.println("Price: "+aa.getPrice());
		
		BookShop bb=new BookShop();
		System.out.println("��ü="+bb);
		bb.setBookName("�ڹٿϼ�");
		bb.setAuthor("��ϼ�");
		bb.setPrice(25000);
		System.out.println("å�̸� :"+bb.getBookName());
		System.out.println("���� : "+bb.getAuthor());
		System.out.println("Price: "+bb.getPrice());
		
		
	}
}
