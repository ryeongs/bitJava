package inheritance;

public class SubTest extends SuperTest{
	private String name;
	private int age;
	
	public SubTest() {
		System.out.println("SUb �⺻ ������");
	}
	
	public SubTest(String name, int age, double weight, double height) {
		System.out.println("SUb �⺻ ������");

		this.name = name;
		this.age=age;
		super.weight=weight;//this.weight=weight;
		super.height=height;//this.height=height;
	}
	public void output() {
		System.out.println("�̸� = "+name);
		System.out.println("���� = "+age);
		System.out.println("������ = "+weight);
		System.out.println("Ű = "+height);
	}
	public static void main(String[] args) {
	
		SubTest aa=new SubTest("ȫ�浿",25,79,185.3);//������ 2�� ȣ�� �θ�Ŭ���������� ������ 2�� ȣ�������� 2���ʿ�
		aa.output();
		System.out.println("--------------");
		aa.disp();//������ ������ ã�� ������ �θ����� ã�´�.
		System.out.println();
		
		SuperTest bb= new SubTest("E��ġ",16,52.3,162.3);
	//	bb.output();
		bb.disp();
	}

}
