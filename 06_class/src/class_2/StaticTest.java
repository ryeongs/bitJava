package class_2;

public class StaticTest {
	private int a; //필드, 인스턴스 변수, StaticTest 클래스안에 잡힌다
	private static int b;//필드,클래스 변수, static 영역에 따로 잡힌다 

	static {
		System.out.println("static 초기화 영역");
	}
	public StaticTest() {
		System.out.println("기본 생성자");
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
	//	System.out.println("a="+this.a+"\t b="+StaticTest.b);//static은 this 못쓴다.

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
