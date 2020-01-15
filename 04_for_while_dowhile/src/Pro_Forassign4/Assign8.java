package Pro_Forassign4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assign8 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Assign8 a8=new Assign8();
		int num = 0;
		int balance = 0; //잔고
		//int deposit; //입금액
		
		while (true) {
			System.out.println();
            System.out.println("****************");
            System.out.println(" 1. 예금");
            System.out.println(" 2. 출금");
            System.out.println(" 3. 잔고");
            System.out.println(" 4. 종료");
            System.out.println("****************");
            System.out.print("번호 선택 :");
            num=Integer.parseInt(br.readLine());
            
            if(num==1) {balance=a8.input(balance);}
            else if(num==2) {balance=a8.output(balance);}
            else if(num==3) {System.out.println("당신의 작액은"+balance+"원입니다");}
            if(num==4) break;
		}//while
		System.out.println("프로그램을 종료합니다.");
	}
	public int input(int balance) throws  IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int deposit;
		
		System.out.println("예금액:");
		deposit=Integer.parseInt(br.readLine());
		
		if(deposit%10000==0) {
			balance +=balance;
			System.out.println("당신의 작액은"+balance+"원입니다");
		}
		else System.out.println("만원단위로 입력하세요");
		
		return balance;
	}
	public int output(int balance) throws  IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int deposit;
		
		System.out.println("출금액:");
		deposit=Integer.parseInt(br.readLine());
		
		if(balance>=deposit) {
			balance -=deposit;
			System.out.println("당신의 작액은"+balance+"원입니다");
		}
		else System.out.println("잔액이 부족합니다");
		
		return balance;
	}

}
