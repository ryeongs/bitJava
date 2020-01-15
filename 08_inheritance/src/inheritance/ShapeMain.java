package inheritance;

import java.util.Scanner;

class ShapeTest{
	protected Scanner sc = new Scanner(System.in);
	
	protected double area;
	
	public ShapeTest() {
		System.out.println("ShapeTest �⺻������");
	}
	public void calcArea() {
		System.out.println("������ ����մϴ�");
	}
	public void dispArea() {
		System.out.println("������ ����մϴ�");
	}
	
}
class SamTest extends ShapeTest{
	private int base, height;
	
	public SamTest() {
		System.out.println("sam �⺻������");
		System.out.print("�غ�: ");
		base =sc.nextInt();
		System.out.print("����: ");
		height=sc.nextInt();
	}
	
	@Override //������̼� 
	public void calcArea() {
		area=base*height/2;
	}
	@Override
	public void dispArea() {
		System.out.println("sam ����: "+area);
		
	}
	
}
class SaTest extends ShapeTest{
	private int width, height;
	
	public SaTest() {
		System.out.println("Sagak �⺻������");
		System.out.print("����: ");
		width =sc.nextInt();
		System.out.print("����: ");
		height=sc.nextInt();
	}
	
	public void calArea() {
		area=width*height;
	}
	public void dispArea() {
		System.out.println("Sagak ����: "+ area);
	}
}

class SadariTest extends ShapeTest{
	private int top,bottom, height;
	
	public SadariTest() {
		System.out.println("SadariTest �⺻������");
		System.out.print("����: ");
		top =sc.nextInt();
		System.out.print("�غ�: ");
		bottom=sc.nextInt();
		System.out.print("����: ");
		height=sc.nextInt();
	}

	public void calArea() {
		area=(top+bottom)*height/2;
	}
	public void dispArea() {
		System.out.println("SadariTest ����: "+ area);
	}
}
//================================
public class ShapeMain {

	public static void main(String[] args) {
//		SamTest sam = new SamTest();//���յ� 100%
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
	
		ShapeTest shape;//������ -�θ� �ڽ�Ŭ������ ������ �� �ִ� �θ�=�ڽ� 
		shape = new SamTest();//���յ� ���߱� //�ڽ� = (�ڽ�)�θ� <--�ٿ�ĳ����
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
