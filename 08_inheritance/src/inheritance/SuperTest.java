package inheritance;

public class SuperTest {
	protected double weight, height;
	
	public SuperTest() {
		System.out.println("SuperTest �⺻ ������");
	}
	
	public SuperTest(double w, double h) {
		this.weight=w;
		this.height=h;
	}
	public void disp() {
		System.out.println("weight ="+weight);
		System.out.println("height ="+height);
	}
}
