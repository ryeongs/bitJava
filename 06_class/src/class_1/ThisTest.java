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
		aa.setName("ȫ�浿");
		aa.setAge(25);
		System.out.println("��ü aa "+aa);
		System.out.println("�̸�="+aa.getName() +"\t����="+aa.getAge());
		
		This bb; //��ü 
		bb =new This();
		bb.setName("�ڳ�");
		bb.setAge(16);
		System.out.println("��ü bb "+bb);
		System.out.println("�̸�="+bb.getName()+"\t����="+bb.getAge());
	}

}
