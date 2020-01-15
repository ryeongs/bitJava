package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest_LCM {

	public static void main(String[] args) throws  IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int num,count=0,result=0;
		
		for(int i=1;i<=100;i++) {
			num=(int)((Math.random()*500)+1);
			if(num%2==0 && num%3==0) { 
				System.out.print(String.format("%5d", num));
				count++; 
				result+=num;
				if(count%7==0) System.out.println();
			}	
		}//for
		System.out.println();
		System.out.println("2와3의공배수개수:"+count);
		System.out.println("2와3의 공배수 합:"+result);
	}
}
		


	
/*1-500사이의 난수를100개 발생하여 2와3의 공배수만 출력하고 합과 개수를 출력하시오
 * 단 1주에 7개씩 출력
 * [실행결과]
 * 36 12 ...
 * 
 * 2와 3의 공배수 개수=
 * 2와 3의 공배수 합=
 */
