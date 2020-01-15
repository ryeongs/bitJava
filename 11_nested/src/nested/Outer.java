package nested;

public class Outer {
	private String name;
	
	public void output() {
		//���� outer() �ȿ� �־ Inner ���ٰ���
		System.out.println("�̸�="+this.name+"\t ����="+new Inner().age);
	}
	
	class Inner{
		private int age;
	
		public void disp() {
			System.out.println("�̸�="+Outer.this.name+"\t ����="+this.age);
		}
	}
	
	public static void main(String[] args) {
		Outer outer=new Outer(); //Outer()�� ����� inner�� �ȸ����
		outer.name="ȫ�浿";
		System.out.println("�̸�="+outer.name);
		
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
