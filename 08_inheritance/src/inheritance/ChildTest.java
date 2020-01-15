package inheritance;

public class ChildTest extends SuperTest {
	private String name;
	private int age;
	
	public ChildTest() {
		System.out.println("Child �⺻ ������");

	}
	public ChildTest(String name, int age, double weight, double height) {
		super(weight,height); //�θ��� �⺻������ ȣ�� or ���ڿ� ���缭
		
		System.out.println("Child �⺻ ������");
		this.name = name;
		this.age=age;
		super.weight=weight;//this.weight=weight;
		super.height=height;//this.height=height;
	}
	public void disp() {
		System.out.println("�̸� = "+name);
		System.out.println("���� = "+age);
		System.out.println("������ = "+weight);
		System.out.println("Ű = "+height);
	}
	public static void main(String[] args) {
		ChildTest aa= new ChildTest("ȫ�浿",25,79,185.3);
		aa.disp();
		System.out.println();
		
		SuperTest bb=new ChildTest("E��ġ",16,52.3,162.3);
		bb.disp();
	}
}
