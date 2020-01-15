package instance;

public class Variable2 {
	int a; //전역변수(field), 인스턴스변수 반드시 new해줘야한다
	static int b; //클래스변수
	 String str;
	
	public static void main(String[] args) {
		int a = 10;//지역변수(local variable), 쓰레기값(반드시초기화)
		System.out.println("지역 a="+a);

		System.out.println("전역 a="+new Variable2().a);
		
		Variable2 field =new Variable2();
		System.out.println("전역(필드)방법1 b="+field.b);
		
		System.out.println("전역(필드)방법2 b="+Variable2.b);
		
		System.out.println("전역(필드)방법3 b="+b);

		System.out.println("전역(필드)방법3 str="+field.str);

		
	}

}
