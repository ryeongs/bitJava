package class_2;

public class StaticTest {
	private int a; //�ʵ�, �ν��Ͻ� ����, StaticTest Ŭ�����ȿ� ������
	private static int b;//�ʵ�,Ŭ���� ����, static ������ ���� ������ 

	static {
		System.out.println("static �ʱ�ȭ ����");
	}
	public StaticTest() {
		System.out.println("�⺻ ������");
		a=3;
	}
	public void calc() {
		a++;
		b++;
	}
	public void disp() {
		System.out.println("a="+a+"\t b="+b);
	}
	public static void output() {
		System.out.println("static method...");
	//	System.out.println("a="+this.a+"\t b="+StaticTest.b);//static�� this ������.

	}
	
	
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.calc();
		st.disp();
		System.out.println();
			
		StaticTest st2=new StaticTest();
		st2.calc();
		st2.disp();
		System.out.println();
		
		StaticTest st3=new StaticTest();
		st3.calc();
		st3.disp();
		System.out.println();
		
		StaticTest.output();
		st.output();
	}

}
