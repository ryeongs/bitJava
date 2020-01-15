package method;

public class MethodTest2 {
	public static void disp() {
		System.out.println("static method");
	}
	
	public void output() {
		System.out.println("non-static method");
	}
	
	public int add(int a,int b) {
		return a+b;
	}
	public int minus(int a,int b) {
		return a-b;
	}
	public int mult(int a,int b) {
		return a*b;
	}
	public double divide(int a,int b) {
		return (double)a/b;
	}
	
	public static void main(String[] args) {
		MethodTest2.disp();
		MethodTest2 out=new MethodTest2();

		System.out.println("out address="+out); //address 16진수
		System.out.println("address="+out.toString());
		System.out.println("hash="+out.hashCode());//주소를10진수로
		
		int tot=out.add(25, 36);
		int sub=out.minus(25, 36);
		int mul=out.mult(25, 36);
		double div=out.divide(25, 36);
		
		System.out.println("sum="+tot);
		System.out.println("sub="+sub);
		System.out.println("mul="+mul);
		System.out.println("div="+div);

	}

	
}
