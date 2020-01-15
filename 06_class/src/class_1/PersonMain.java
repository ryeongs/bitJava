package class_1;

class Person{ //메뉴판
	private String name; //필드, 초기값
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
	public void setData() {// 오버로드 오버로딩
		
	}
	
}
//-------------------
public class PersonMain {
	public static void main(String[] args) {
		Person aa; //객체 
		aa =new Person();
		aa.setName("홍길동"); //호출
		aa.setAge(25);
		System.out.println("객체 bb "+aa);
		System.out.println("이름="+aa.getName()+"\t나이="+aa.getAge());
		System.out.println();
		
		Person bb; //객체 
		bb =new Person();
		bb.setName("코난");
		bb.setAge(16);
		System.out.println("객체 bb "+bb);
		System.out.println("이름="+bb.getName()+"\t나이="+bb.getAge());
		
		Person cc; //객체 
		cc =new Person();
		cc.setData("또치",30);
		System.out.println("객체 cc "+cc);
		System.out.println("이름="+cc.getName()+"\t나이="+cc.getAge() );

		Person dd; //객체 
		dd =new Person();
		dd.setData();
		System.out.println("객체 dd "+dd);
		System.out.println("이름="+dd.getName()+"\t나이="+dd.getAge() );

	}
}
