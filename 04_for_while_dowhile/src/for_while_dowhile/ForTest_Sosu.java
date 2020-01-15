package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest_Sosu {

	public static void main(String[] args) throws  IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int sw;
		while(true) {
			sw=0;
			System.out.print("숫자입력:");
			int user = Integer.parseInt(br.readLine());
			if(user<0) 	continue;
			if(user == 0) {System.out.println("프로그램을 종료합니다"); break;}
			else {
				for(int i =2; i<user;i++) {
					if((user%i)==0) sw=1;
				} 
				System.out.println();
				if(sw==0) System.out.println(user+"는 소수이다");
				else System.out.println(user+"는 소수가아니다 ");
			}
				
		}//while
	}
}
//소수 - 1과 자기자신
/*소수를구하기
단, 0입력되면 프로그램 종료
		for(int i =1; i<=num;i++) {
			if((num%i)==0) {
				System.out.print(i+" ");
			}
		}
[실행결과 ]
슛자입력:12
12는 소수가 아니다

숫자입력:37
37은 소수이다

숫자 입력:0
프로그램 종료
*/