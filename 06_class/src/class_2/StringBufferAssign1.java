package class_2;

import java.util.Scanner;

public class StringBufferAssign1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ� �Է�: ");
		String st = sc.next().toLowerCase();
		StringBuffer str = new StringBuffer(st);

		System.out.println("���� ���ڿ� �Է�:");
		String curstr = sc.next().toLowerCase();
		System.out.println("�ٲ� ���ڿ� �Է�:");
		String chgstr = sc.next().toLowerCase();

		int cnt = 0;
		
		for(int i=0; i<str.length(); i+=curstr.length()) {
			if(str.indexOf(curstr)!=-1) {
				int index=str.indexOf(curstr);
				str.replace(index, index+curstr.length(), chgstr);
				cnt++;
			}
		}
		System.out.println(str);
		System.out.println(cnt + "�� ġȯ ");
	}//main

}//class
