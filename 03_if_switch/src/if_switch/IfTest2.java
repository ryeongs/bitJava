package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfTest2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("a�� �Է�:");
		int a = Integer.parseInt(br.readLine());
		System.out.println("b�� �Է�:");
		int b = Integer.parseInt(br.readLine());
		System.out.println("c�� �Է�:");
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
	
		if(a<b && a<c) {//a�� ����������
			if(b<c) System.out.println(a+","+b+","+c);
			else System.out.println(a+","+c+","+b);
		}else if(b<a && b<c) { //b�� ���� ������
			if(a<c) System.out.println(b+","+a+","+c);
			else System.out.println(b+","+c+","+a);
		}else { //c 
			if(a<b) System.out.println(c+","+a+","+b);
			else System.out.println(c+","+b+","+a);
		}

		System.out.println(a+"\t"+b+"\t"+c);
	}

}
