package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiArray4 {

	public static void main(String[] args) throws IOException {
		int[][] jumsu = { { 90, 95, 100, 0}, { 100, 89, 80, 0 }, { 75, 80, 48, 0 } };
		double []avg =new double[4];
		String[] name=new String[]{"홍길동","코난","또치"};
		
		char[] grade=new char[3];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		// 입력
		for (int i = 0; i < jumsu.length ; i++) { // 마지막 0,0,0,0 에 합을 넣을려고 -1
			for (int j = 0; j < jumsu[i].length - 1; j++) {
				jumsu[i][3] += jumsu[i][j];// 가로합 총점
				avg[i]=(double)(jumsu[i][3])/3;//평균
			}
			if(avg[i]>=90 && avg[i]<=100) { System.out.println("A");grade[i]='A';}
			else if(avg[i]>=80&& avg[i]<90) {System.out.println("B");grade[i]='B';}
			else if(avg[i]>=70&&avg[i]<80) {System.out.println("C");grade[i]='C';}
			else if(avg[i]>=60&&avg[i]<70) {System.out.println("D");grade[i]='D';}
			else {System.out.println("B");grade[i]='F';}
		}

		System.out.println("=====================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("=====================================================");
		// 출력
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print(name[i]);
			for (int j = 0; j < jumsu[i].length; j++) {
				System.out.print("\t"+ jumsu[i][j]);
			}
			System.out.print(String.format("\t"+"%.2f", avg[i])); //avg=========			
			
			System.out.println();
		}
	
	}

}
