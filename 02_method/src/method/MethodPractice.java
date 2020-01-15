package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodPractice {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*[문제1]
* 정수(dec)를 입력받아서 2진수(binary), 8진수(octor), 16진수(hexa) 변환하시오
Integer클래스 메소드를 이용하시오
 */
		System.out.print("10진수를 입력하세요:");
		int dec = Integer.parseInt(br.readLine());
		
		String binary = Integer.toBinaryString(dec);  // 10진수 -> 2진수
		String octor= Integer.toOctalString(dec);    // 10진수 -> 8진수
		String hexa = Integer.toHexString(dec);    // 10진수 -> 16진수

		System.out.println("[문제1.실행결과]");
		System.out.println("2진수="+binary);
		System.out.println("8진수="+octor);
		System.out.println("16진수="+hexa);
		System.out.println("===============================");

/*
* [문제2]
주사위를 2번 던져서 나온 값의 합을 구하시오
주사위는 input()에서 1~6사이의 난수를 발생하여 리턴한다
합은 add()에서 구하여 리턴 받는다
*/	
		MethodPractice random=new MethodPractice();
		int r1=(int)(Math.random()*6)+1;
		int r2=(int)(Math.random()*6)+1;
		int b=random.add(r1, r2);
		System.out.println("[문제2.실행결과]");
		System.out.println("첫번째 주사위 값:"+r1);
		System.out.println("첫번째 주사위 값:"+r2);
		System.out.println("합은 "+b+"이다.");
		System.out.println("===============================");


/*
 * [문제3]
초를 입력받아서 time()에서 시,분,초를 구하여 출력한다		
 */		
		MethodPractice time=new MethodPractice();
		System.out.println("[문제3.실행결과]");
		System.out.print("초를 입력하시오 : ");
		int sec = Integer.parseInt(br.readLine());
		String result = time.time(sec);
		System.out.println(result+"입니다");
	}

	public int add(int r1, int r2) {
		return r1+r2;
	}
	
	public String time(int sec) {
		int min=sec/60;
		int hour = min/60;
		 sec = sec%60;
		 min =min%60;
		return (hour+"시"+min+"분"+sec+"초");
	}
	
}
