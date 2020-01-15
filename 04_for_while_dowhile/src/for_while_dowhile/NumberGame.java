package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGame {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		do {
			int count=0;
			int com=(int)(Math.random()*100)+1;
			System.out.println(com);
			String again;
			while(true) {
				System.out.print("숫자 입력: ");
				int user = Integer.parseInt(br.readLine());
				System.out.println();
				count++;
				if(com==user) break;
				else if(com>user)System.out.println(user + "보다 큽니다");
				else System.out.println(user + "보다 작습니다");
			}
			    System.out.println(count+"번만에 맞추셨습니다!");
			    System.out.print("또 할래(Y/N) :"); 
			    again=br.readLine(); 
			    if(again.equals("n")){break;}
			 	   else continue;
		}while(true);
		System.out.println("프로그램을 종료합니다"); 
	}
  }

//숫자맞추기 게임 
/*
 *1-100까지 난수 발생하여 맞추는게임
 *[실행결과]
 *숫자입력:50
 *50보다 큽니다
 *
 * 숫자입력:90
 * 90보다 작습니다.
 * ...
 * 
 * 숫자입력:87
 * 딩동댕 00번만에 맞추셧습니다
 */
