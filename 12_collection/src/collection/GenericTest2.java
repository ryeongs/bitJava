package collection;

public class GenericTest2<T> {
	private T a;
	
	public GenericTest2(T a) {
		this.a=a;
	}
	public void setA(T a) {
		this.a=a;
	}
	public T getA() {
		return a;
	}
	public static void main(String[] args) {
		//<?> 는 생성자만 통해서 들어갈 수 있다
		GenericTest2<?> aa=new GenericTest2<String>("홍길동");
		//aa.setA("홍길동"); -error 
		String name=(String)aa.getA(); //-내부에서는 Object로 되어있다
		System.out.println("이름"+name);
		
		GenericTest2<?> bb=new GenericTest2<Integer>(25);
		int age=(int)bb.getA(); //unAutoBoxing
		System.out.println("나이"+age);
	}

}
