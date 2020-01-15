package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfTest2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("a값 입력:");
		int a = Integer.parseInt(br.readLine());
		System.out.println("b값 입력:");
		int b = Integer.parseInt(br.readLine());
		System.out.println("c값 입력:");
		int c = Integer.parseInt(br.readLine());
		int temp;
		if(b<a && b<c) {
			temp = a;
			a = b;
			c = temp;
		}else if(c<a && c<b) {
			temp = a;
			a =c;
			c = temp;
		}if(c < b) {
			temp = b;
			b = c;
			c = temp;
		}
	
		if(a<b && a<c) {//a가 가장작은값
			if(b<c) System.out.println(a+","+b+","+c);
			else System.out.println(a+","+c+","+b);
		}else if(b<a && b<c) { //b가 제일 작은값
			if(a<c) System.out.println(b+","+a+","+c);
			else System.out.println(b+","+c+","+a);
		}else { //c 
			if(a<b) System.out.println(c+","+a+","+b);
			else System.out.println(c+","+b+","+a);
		}

		System.out.println(a+"\t"+b+"\t"+c);
	}

}
