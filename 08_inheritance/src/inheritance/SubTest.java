package inheritance;

public class SubTest extends SuperTest{
	private String name;
	private int age;
	
	public SubTest() {
		System.out.println("SUb 기본 생성자");
	}
	
	public SubTest(String name, int age, double weight, double height) {
		System.out.println("SUb 기본 생성자");

		this.name = name;
		this.age=age;
		super.weight=weight;//this.weight=weight;
		super.height=height;//this.height=height;
	}
	public void output() {
		System.out.println("이름 = "+name);
		System.out.println("나이 = "+age);
		System.out.println("몸무게 = "+weight);
		System.out.println("키 = "+height);
	}
	public static void main(String[] args) {
	
		SubTest aa=new SubTest("홍길동",25,79,185.3);//생성자 2번 호출 부모클래스에서는 생성자 2번 호출함으로 2개필요
		aa.output();
		System.out.println("--------------");
		aa.disp();//순서는 나부터 찾고 없으면 부모한테 찾는다.
		System.out.println();
		
		SuperTest bb= new SubTest("E또치",16,52.3,162.3);
	//	bb.output();
		bb.disp();
	}

}
