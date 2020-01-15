package class_2;

import java.util.Scanner;

public class StringBufferTest {
	private int dan;
	
	public  StringBufferTest() {
		//원하는 단 입력:
		Scanner sc=new Scanner(System.in);
		System.out.print("원하는 단 입력: ");
		dan=sc.nextInt();
		
	}
	public void output() {
		StringBuffer sb =new StringBuffer(); 
		for(int i=1; i<=9;i++) {
			//System.out.println(dan+"*"+i+"="+dan*i);
			sb.append(dan);
			sb.append("*");
			sb.append(i);
			sb.append("=");
			sb.append(dan*i);
			
			System.out.println(sb.toString());//string 클래스로 변환후 찍어줌
			
			sb.delete(0,sb.length());
		}
	}
	public static void main(String[] args) {
		StringBufferTest str=new StringBufferTest();
		str.output();
	}

}
