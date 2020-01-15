package inheritance;

public class ChildTest extends SuperTest {
	private String name;
	private int age;
	
	public ChildTest() {
		System.out.println("Child 기본 생성자");

	}
	public ChildTest(String name, int age, double weight, double height) {
		super(weight,height); //부모의 기본생성자 호출 or 인자에 맞춰서
		
		System.out.println("Child 기본 생성자");
		this.name = name;
		this.age=age;
		super.weight=weight;//this.weight=weight;
		super.height=height;//this.height=height;
	}
	public void disp() {
		System.out.println("이름 = "+name);
		System.out.println("나이 = "+age);
		System.out.println("몸무게 = "+weight);
		System.out.println("키 = "+height);
	}
	public static void main(String[] args) {
		ChildTest aa= new ChildTest("홍길동",25,79,185.3);
		aa.disp();
		System.out.println();
		
		SuperTest bb=new ChildTest("E또치",16,52.3,162.3);
		bb.disp();
	}
}
