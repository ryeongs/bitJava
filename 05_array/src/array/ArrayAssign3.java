package array;

import java.io.IOException;
public class ArrayAssign3 {

	public static void main(String[] args) throws IOException {
		int lot[]=new int[6];
		System.out.println("����:");
		ArrayAssign3 aa=new ArrayAssign3();
		aa.input(lot);
		
		aa.output(lot);
		System.out.println("�Դϴ�");
	}
	public void input(int []lot) { //���� �߻�, �ߺ��� ���ڰ� ������ �ٽ� �߻�
		for(int i =0;i<lot.length;i++) {
			lot[i] =(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(lot[i]==lot[j]) {
					i--;
					break;
				}//�ߺ��� ����
			}
		}
	}
	public void output(int []lot) {//���
		for(int i=0;i<lot.length;i++) {
			System.out.print(lot[i] + " ");
		}
	}
}
