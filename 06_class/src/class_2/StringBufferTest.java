package class_2;

import java.util.Scanner;

public class StringBufferTest {
	private int dan;
	
	public  StringBufferTest() {
		//���ϴ� �� �Է�:
		Scanner sc=new Scanner(System.in);
		System.out.print("���ϴ� �� �Է�: ");
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
			
			System.out.println(sb.toString());//string Ŭ������ ��ȯ�� �����
			
			sb.delete(0,sb.length());
		}
	}
	public static void main(String[] args) {
		StringBufferTest str=new StringBufferTest();
		str.output();
	}

}
