package array;

import java.util.Scanner;

public class ArrayAssign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A-Z(65-90) 무작위로 100개 출력
		/*
		 * [문제1] 크기가 50개인 문자배열을 잡아서 65~90사이의 난수를 발생하여 저장 후 출력하시오 A ~ Z까지 몇개인지 출력 단 1줄에
		 * 10개씩 출력
		 * 
		 */
		int cnt[] = new int[26]; //count 자바에서 배열을 선언하면 자동으로 모든 요소의 값이 초기화 된다
		int[] str = new int[50]; //50개 

		for (int i = 0; i < str.length; i++) {
			//str[i] = (int) Math.random(); //랜덤 숫자
			char ch = (char) ((Math.random() * 26) + 65); //65~90
			cnt[ch - 'A']++;
			if (i % 10 == 0) System.out.println();
			System.out.print((char) ch + " ");
		}
		System.out.println();
		System.out.println("=== 각 문자의 수 ===");

		for (int i = 0; i < 26; i++) {
			//if (cnt[i] != 0) {
				System.out.println((char) (65 + i) + " : " + cnt[i]);
			//}

		}
	}
}
