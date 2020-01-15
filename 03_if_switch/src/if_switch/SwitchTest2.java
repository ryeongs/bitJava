package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.text.DecimalFormat;

public class SwitchTest2 {

	public static void main(String[] args) throws IOException {
	/* a값입력: b값입력:
	연산자(+_) 입력:+
	25+36=ㅇㅇ
	*/
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("a입력:");
		int a = Integer.parseInt(br.readLine());
		System.out.print("b 입력:");
		int b = Integer.parseInt(br.readLine());
		System.out.print("연산자(+,-,*,/) 입력:");
		String op = br.readLine();
		double result;
		
		switch(op) {
		case("+"): 
			result = a+b;
			System.out.println(a+"+"+b+"="+result);
			break;
		case("-"): 
			result = a-b;
			System.out.println(a+"-"+b+"="+result);
			break;
		case("*"): 
			result = a*b;
			System.out.println(a+"*"+b+"="+result);
			break;
		case("/"): 
			result = (double)a/b;
			//System.out.println(a+"/"+b+"="+String.format("%.3f",result));
			DecimalFormat df = new DecimalFormat("#.###");
			System.out.println(a+"/"+b+"="+df.format(result));
			break;
		}
	}

}
