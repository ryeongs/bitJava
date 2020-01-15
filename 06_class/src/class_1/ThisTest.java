package class_1;

class This{
	private String name;
	private int age;
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setName(String name) {
		this.name=name;
	}
}
//----------------------
public class ThisTest {
	

	public static void main(String[] args) {
		This aa=new This();
		aa.setName("홍길동");
		aa.setAge(25);
		System.out.println("객체 aa "+aa);
		System.out.println("이름="+aa.getName() +"\t나이="+aa.getAge());
		
		This bb; //객체 
		bb =new This();
		bb.setName("코난");
		bb.setAge(16);
		System.out.println("객체 bb "+bb);
		System.out.println("이름="+bb.getName()+"\t나이="+bb.getAge());
	}

}
