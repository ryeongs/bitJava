package class_2;

import java.util.Scanner;

public class StringBufferAssign1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력: ");
		String st = sc.next().toLowerCase();
		StringBuffer str = new StringBuffer(st);

		System.out.println("현재 문자열 입력:");
		String curstr = sc.next().toLowerCase();
		System.out.println("바꿀 문자열 입력:");
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
		System.out.println(cnt + "번 치환 ");
	}//main

}//class
