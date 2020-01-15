package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForAssign5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * [문제5] 성적 관리 프로그램
			중간고사, 기말고사, 레포트, 출석점수를 입력받아서 계산하시오
		 */
		char grade;
		double midFin, tot,assign2,check2;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("중간고사를 입력하시오 : ");
		int mid = Integer.parseInt(br.readLine());
		System.out.print("기말고사를 입력하시오 : ");
		int fin = Integer.parseInt(br.readLine());
		System.out.print("과제점수를  입력하시오 : ");
		int assign = Integer.parseInt(br.readLine());
		System.out.print("출석점수를  입력하시오 : ");
		int check = Integer.parseInt(br.readLine());
		
		
		midFin=((mid+fin)/2) *((3.00/5));
		check2=check*((1.00/5));
		assign2 = assign*((1.00/5));
		tot= midFin + assign2 + check2;
		
		if(tot>=90 && tot<=100) {System.out.println("A학점"); grade='A';}
		else if(tot>=80&& tot<90) {System.out.println("B학점");grade='B';}
		else if(tot>=70&&tot<80) {System.out.println("C학점");grade='C';}
		else if(tot>=60&&tot<70) {System.out.println("D학점");grade='D';}
		else {System.out.println("F학점");grade='F';}
		
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
		System.out.println("성적="+String.format("%.2f", tot));
		System.out.println("학점="+grade);
		System.out.println("평가="+eval);
	}

}
