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
		System.out.print("10진수 입력 :");
		n = Integer.parseInt(br.readLine());
		int[] b = new int[32];
			
			int i = 0;
			while (n != 1) { //10진수를 1이 남을때까지 계속 2로 나누고 나머지를배열에 저장후
								//거꾸로 출력
				b[i++] = n % 2;
				n = n / 2;
			}//while
			b[i] = n;
			for (int j = i; j >= 0; --j) {
				System.out.print(b[j]);
			}//for
			if (n == 0) {
				System.out.println("프로그램을 종료");
				
			}//if
		
	}

}
