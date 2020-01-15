package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest {

	public static void main(String[] args) throws IOException {
		/*Exception 예외처리
			1.컴파일
			2.실행
		*/
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter String: ");
		String str=br.readLine();
		System.out.println("String: "+str);
		
		System.out.print("Enter int: ");
		int num=Integer.parseInt(br.readLine());
		System.out.println("int: "+num);

		System.out.print("Enter double: ");
		double num2=Double.parseDouble(br.readLine());
		System.out.println("double: "+num2);


	}

}
