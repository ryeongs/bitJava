package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForAssign5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * [����5] ���� ���� ���α׷�
			�߰����, �⸻���, ����Ʈ, �⼮������ �Է¹޾Ƽ� ����Ͻÿ�
		 */
		char grade;
		double midFin, tot,assign2,check2;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�߰���縦 �Է��Ͻÿ� : ");
		int mid = Integer.parseInt(br.readLine());
		System.out.print("�⸻��縦 �Է��Ͻÿ� : ");
		int fin = Integer.parseInt(br.readLine());
		System.out.print("����������  �Է��Ͻÿ� : ");
		int assign = Integer.parseInt(br.readLine());
		System.out.print("�⼮������  �Է��Ͻÿ� : ");
		int check = Integer.parseInt(br.readLine());
		
		
		midFin=((mid+fin)/2) *((3.00/5));
		check2=check*((1.00/5));
		assign2 = assign*((1.00/5));
		tot= midFin + assign2 + check2;
		
		if(tot>=90 && tot<=100) {System.out.println("A����"); grade='A';}
		else if(tot>=80&& tot<90) {System.out.println("B����");grade='B';}
		else if(tot>=70&&tot<80) {System.out.println("C����");grade='C';}
		else if(tot>=60&&tot<70) {System.out.println("D����");grade='D';}
		else {System.out.println("F����");grade='F';}
		
		String eval=null;
		if(grade=='A'|| grade=='B') {
			eval="excellent";
		}
		if(grade=='C'|| grade=='D') {
			eval="good";
		}
		if(grade=='F') {
			eval="poor";
		}
		System.out.println("����="+String.format("%.2f", tot));
		System.out.println("����="+grade);
		System.out.println("��="+eval);
	}

}
