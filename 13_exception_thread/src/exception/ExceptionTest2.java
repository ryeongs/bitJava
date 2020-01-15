package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest2 {
	private int dan;

	public void input() throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("원하는 단 입력: ");
		dan=Integer.parseInt(br.readLine());
		
	}

	public void output() {
		if (dan >= 2 && dan <= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + "*" + i + "=" + i * dan);
			}
		} else
			try {
				//throw new Exception("범위 초과 (2~9까지 가능)");
				throw new MakeException("범위 초과 (2~9까지 가능)");
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		ExceptionTest2 et=new ExceptionTest2();
		et.input();
		et.output();
	}

}
