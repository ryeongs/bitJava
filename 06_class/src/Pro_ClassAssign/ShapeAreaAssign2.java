package Pro_ClassAssign;

class ShapeTest{
	static final double PI=3.14;
	
	public double area(int r) {
		return PI*r*r;
	}
	public double area(int w, int h) {
		return w*h/2.0;
	}
	public double area(int w, int l, int h) {
		return (w+h)*l/2.0;
	}
}

public class ShapeAreaAssign2 {

	public static void main(String[] args) {
		ShapeTest st=new ShapeTest();
		//ShapeTest.PI=100; 상수화(final) 때문에 못바꿈 
		System.out.println("Pi="+ShapeTest.PI);
		System.out.println("원의 넓이: "+st.area(3));
		System.out.println("삼각형의 넓이: "+st.area(5,7));
		System.out.println("사다리꼴의 넓이: "+st.area(2,3,5));
	}

}
