package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayAssign2 {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		int n;
		int count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("10���� �Է� :");
		n = Integer.parseInt(br.readLine());
		int[] b = new int[32];
			
			int i = 0;
			while (n != 1) { //10������ 1�� ���������� ��� 2�� ������ ���������迭�� ������
								//�Ųٷ� ���
				b[i++] = n % 2;
				n = n / 2;
			}//while
			b[i] = n;
			for (int j = i; j >= 0; --j) {
				System.out.print(b[j]);
			}//for
			if (n == 0) {
				System.out.println("���α׷��� ����");
				
			}//if
		
	}

}
