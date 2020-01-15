package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiple {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int again;
		while(true) {
			System.out.print("숫자입력:");
			int user = Integer.parseInt(br.readLine());
			if(user<0) 	continue;
			if(user == 0) {System.out.println("프로그램을 종료합니다"); break;}
			else {
				for(int j=1; j<8; j++) {
					System.out.print(user*j+" ");
				}System.out.println();
			}	
		}

	}

}
//숫자를 입력하여 배수를 7개만 구하시오
/*
단 음수이면 다시 입력하고 0이면 종료하시오
[실행결과]
숫자입력: -7
숫자입력: 8
8 16 24 32 40 48 56

숫자입력 : 0 
프로그램 종료
*/
