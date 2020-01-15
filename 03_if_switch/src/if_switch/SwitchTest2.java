package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.text.DecimalFormat;

public class SwitchTest2 {

	public static void main(String[] args) throws IOException {
	/* a���Է�: b���Է�:
	������(+_) �Է�:+
	25+36=����
	*/
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("a�Է�:");
		int a = Integer.parseInt(br.readLine());
		System.out.print("b �Է�:");
		int b = Integer.parseInt(br.readLine());
		System.out.print("������(+,-,*,/) �Է�:");
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
