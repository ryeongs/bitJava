package collection;

public class GenericTest<T> {
	private T a;
	
	public void setA(T a) {
		this.a=a;
	}
	public T getA() {
		return a;
	}
	public static void main(String[] args) {
		GenericTest<String> aa=new GenericTest<String>();
		aa.setA("홍길동");
		//aa.setA(25);-error 현재 타입이 String으로 정했기 때문에 안됨
		System.out.println("이름="+aa.getA());
		GenericTest<Integer> bb=new GenericTest<Integer>();
		bb.setA(25);
		System.out.println("나이="+bb.getA());
		
	}

}
