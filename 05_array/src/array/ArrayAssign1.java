package array;

import java.util.Scanner;

public class ArrayAssign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A-Z(65-90) �������� 100�� ���
		/*
		 * [����1] ũ�Ⱑ 50���� ���ڹ迭�� ��Ƽ� 65~90������ ������ �߻��Ͽ� ���� �� ����Ͻÿ� A ~ Z���� ����� ��� �� 1�ٿ�
		 * 10���� ���
		 * 
		 */
		int cnt[] = new int[26]; //count �ڹٿ��� �迭�� �����ϸ� �ڵ����� ��� ����� ���� �ʱ�ȭ �ȴ�
		int[] str = new int[50]; //50�� 

		for (int i = 0; i < str.length; i++) {
			//str[i] = (int) Math.random(); //���� ����
			char ch = (char) ((Math.random() * 26) + 65); //65~90
			cnt[ch - 'A']++;
			if (i % 10 == 0) System.out.println();
			System.out.print((char) ch + " ");
		}
		System.out.println();
		System.out.println("=== �� ������ �� ===");

		for (int i = 0; i < 26; i++) {
			//if (cnt[i] != 0) {
				System.out.println((char) (65 + i) + " : " + cnt[i]);
			//}

		}
	}
}
