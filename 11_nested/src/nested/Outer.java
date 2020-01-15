package nested;

public class Outer {
	private String name;
	
	public void output() {
		//같은 outer() 안에 있어서 Inner 접근가능
		System.out.println("이름="+this.name+"\t 나이="+new Inner().age);
	}
	
	class Inner{
		private int age;
	
		public void disp() {
			System.out.println("이름="+Outer.this.name+"\t 나이="+this.age);
		}
	}
	
	public static void main(String[] args) {
		Outer outer=new Outer(); //Outer()만 만들고 inner는 안만든다
		outer.name="홍길동";
		System.out.println("이름="+outer.name);
		
		Outer.Inner inner =outer.new Inner();
		inner.age=25;
		inner.disp();
		
		Outer.Inner inner2=outer.new Inner();
		inner2.age=30;
		inner2.disp();
		
		Outer.Inner inner3=new Outer().new Inner();
		inner3.age=35;
		inner3.disp();
	}

}
