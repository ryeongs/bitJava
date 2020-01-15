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
		System.out.println("객체="+aa);
		aa.setBookName("자바완성");
		aa.setAuthor("김완성");
		aa.setPrice(25000);
		System.out.println("책이름 :"+aa.getBookName());
		System.out.println("저자 : "+aa.getAuthor());
		System.out.println("Price: "+aa.getPrice());
		
		BookShop bb=new BookShop();
		System.out.println("객체="+bb);
		bb.setBookName("자바완성");
		bb.setAuthor("김완성");
		bb.setPrice(25000);
		System.out.println("책이름 :"+bb.getBookName());
		System.out.println("저자 : "+bb.getAuthor());
		System.out.println("Price: "+bb.getPrice());
		
		
	}
}
