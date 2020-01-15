package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MethodTest3 {

	public int calcTot(int k, int e, int m) {
		return k+e+m;
	}
	public double calcAvg(int t) {
		return (double)t/3;
	}
	
	public static void main(String[] args) throws IOException {
	//	Scanner grade = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter name:");
		String name=br.readLine();
		System.out.print("Enter kor:");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("Enter eng:");
		int eng = Integer.parseInt(br.readLine());		
		System.out.print("Enter math:");
		int math = Integer.parseInt(br.readLine());
		
		MethodTest3 test3=new MethodTest3();
		int tot = test3.calcTot(kor, eng, math);
		double avg =test3.calcAvg(tot);
		System.out.println("\t\t***"+name+" 성적표***");
		System.out.println("이름\t"+"국어\t"+"영어\t"+"수학\t"+"총점\t"+"평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+String.format("%.2f", avg));


	}
	

}
