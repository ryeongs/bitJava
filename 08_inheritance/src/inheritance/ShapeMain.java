package inheritance;

import java.util.Scanner;

class ShapeTest{
	protected Scanner sc = new Scanner(System.in);
	
	protected double area;
	
	public ShapeTest() {
		System.out.println("ShapeTest 기본생성자");
	}
	public void calcArea() {
		System.out.println("도형을 계산합니다");
	}
	public void dispArea() {
		System.out.println("도형을 출력합니다");
	}
	
}
class SamTest extends ShapeTest{
	private int base, height;
	
	public SamTest() {
		System.out.println("sam 기본생성자");
		System.out.print("밑변: ");
		base =sc.nextInt();
		System.out.print("높이: ");
		height=sc.nextInt();
	}
	
	@Override //어노테이션 
	public void calcArea() {
		area=base*height/2;
	}
	@Override
	public void dispArea() {
		System.out.println("sam 넓이: "+area);
		
	}
	
}
class SaTest extends ShapeTest{
	private int width, height;
	
	public SaTest() {
		System.out.println("Sagak 기본생성자");
		System.out.print("가로: ");
		width =sc.nextInt();
		System.out.print("세로: ");
		height=sc.nextInt();
	}
	
	public void calArea() {
		area=width*height;
	}
	public void dispArea() {
		System.out.println("Sagak 넓이: "+ area);
	}
}

class SadariTest extends ShapeTest{
	private int top,bottom, height;
	
	public SadariTest() {
		System.out.println("SadariTest 기본생성자");
		System.out.print("윗변: ");
		top =sc.nextInt();
		System.out.print("밑변: ");
		bottom=sc.nextInt();
		System.out.print("높이: ");
		height=sc.nextInt();
	}

	public void calArea() {
		area=(top+bottom)*height/2;
	}
	public void dispArea() {
		System.out.println("SadariTest 넓이: "+ area);
	}
}
//================================
public class ShapeMain {

	public static void main(String[] args) {
//		SamTest sam = new SamTest();//결합도 100%
//		sam.calcArea();
//		sam.dispArea();
//		System.out.println();
//		
//		SaTest sa=new SaTest();
//		sa.calcArea();
//		sa.dispArea();
//		System.out.println();
//
//		SadariTest sadari= new SadariTest();
//		sadari.calcArea();
//		sadari.dispArea();
	
		ShapeTest shape;//다형성 -부모가 자식클래스를 참조할 수 있다 부모=자식 
		shape = new SamTest();//결합도 낮추기 //자식 = (자식)부모 <--다운캐스팅
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SaTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SadariTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
	}

}
