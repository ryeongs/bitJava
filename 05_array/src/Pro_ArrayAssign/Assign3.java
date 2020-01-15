package Pro_ArrayAssign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;

public class Assign3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] lotto = new int[6];
		int money;
		System.out.println("현금 입력: ");
		money = Integer.parseInt(br.readLine());

		Assign3 a3 = new Assign3();

		if (money < 1000)
			System.out.println("1000원 이상 입력해주세요");
		for (int i = 1; i <= money / 1000; i++) {
			a3.input(lotto);
		//	Arrays.sort(lotto);// 오름차순
			a3.sort(lotto);
			a3.output(lotto);
			if(i%5==0) System.out.println();
		}
	}
	private void sort(int[] lotto) {
		//Selection Sort
		int temp=0;
		for(int i=0; i<lotto.length-1;i++) { //length는 012345 4까지밖에안간다,마지막은 자동정렬된다
			for(int j=i+1;j<lotto.length;j++) {
				if(lotto[i]>lotto[j]) {
					temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j] =temp;
				}
			}
		}
	}
	private void input(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);

			// 중복체크
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			} // for j
		} // for i
	}
	private void output(int[] lotto) {
		for (int n : lotto) {
			System.out.print(String.format("%5d", n));
		}
		System.out.println();
	}
	
}
