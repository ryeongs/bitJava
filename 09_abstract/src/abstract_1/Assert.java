package abstract_1;

import java.util.Scanner;

public class Assert {
	private int x,y;
	int result;
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Assert as=new Assert();
		as.input();
		as.output();

	}
	public void input() {
		System.out.print("x�� �Է�:");
		 x=sc.nextInt();
		System.out.print("y�� �Է�:");
		 y=sc.nextInt();
		
	}
	public void output() {
		assert y>=0 : "y�� 0���� ũ�ų� ���ƾ��Ѵ� ";
		
		result=1;
		for(int i = 1; i<=y;i++) {
			result*=x;
		}
		System.out.println(x+"��"+y+"���� "+result);
	}
	
}
/*input()
 * x�� �Է�:
 * y�� �Է�:
 * -----------------------------
 * output()
 * 2�� 5���� xx
 */
