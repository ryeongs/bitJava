package constructor;

import java.util.Scanner;

public class InputTest {
	private int a;
	private double b;
	
	public InputTest() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է�:");
		a=sc.nextInt();
		System.out.print("�Ǽ� �Է�: ");
		b=sc.nextDouble();
		

	}
	public void display() {
		System.out.println(a+" + " +b+ "=" +(a+b));
	}
	
	public static void main(String[] args) {
		InputTest it=new InputTest();
		it.display();

	}

}
