package class_1;

class Person{ //�޴���
	private String name; //�ʵ�, �ʱⰪ
	private int age;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setData(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public void setData() {// �����ε� �����ε�
		
	}
	
}
//-------------------
public class PersonMain {
	public static void main(String[] args) {
		Person aa; //��ü 
		aa =new Person();
		aa.setName("ȫ�浿"); //ȣ��
		aa.setAge(25);
		System.out.println("��ü bb "+aa);
		System.out.println("�̸�="+aa.getName()+"\t����="+aa.getAge());
		System.out.println();
		
		Person bb; //��ü 
		bb =new Person();
		bb.setName("�ڳ�");
		bb.setAge(16);
		System.out.println("��ü bb "+bb);
		System.out.println("�̸�="+bb.getName()+"\t����="+bb.getAge());
		
		Person cc; //��ü 
		cc =new Person();
		cc.setData("��ġ",30);
		System.out.println("��ü cc "+cc);
		System.out.println("�̸�="+cc.getName()+"\t����="+cc.getAge() );

		Person dd; //��ü 
		dd =new Person();
		dd.setData();
		System.out.println("��ü dd "+dd);
		System.out.println("�̸�="+dd.getName()+"\t����="+dd.getAge() );

	}
}
