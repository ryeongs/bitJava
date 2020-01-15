package Pro_Forassign4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class assign4 {
	/*
	 * [문제4] 덧셈 공부 10~99 사이의 난수를 2개(a,b) 발생하여 합을 맞추는 게임 문제수는 총 5문제를 제공한다 1문제당 점수
	 * 20점씩 계산 만약 틀리면 기회를 1번 더 제공한다
	 */
	public static void main(String[] args) throws  IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int a,b,answer,count;
		String yn;
		while (true) {
			count=0;
			for (int i = 1; i < 5; i++) {
				a=(int)(Math.random()*90+10);//10~99
				b=(int)(Math.random()*90+10);//10~99
				
				for(int j=1;j<=2;j++) { //어디부분이 반복되는지 잘 봐야한다.문제가 틀리면 기회를 j번 준다.
					System.out.println("["+i+"]"+a+"+"+b+"=");
					answer =Integer.parseInt(br.readLine());
					
					if(answer==a+b) {
						System.out.println("딩동댕");
						count++;
						break;//for j를 나간다
					}else {
						if(j==2) System.out.println("틀렸다.. 정답은"+(a+b));
						else System.out.println("틀림");
					}
				}//for j
			}//for i
			System.out.println("당신은 총"+count+"문제를 맞추어서"+count*20+"점입니다");
			System.out.println();
	
			do {
				System.out.print("continue(Y/N): ");
				yn=br.readLine();
			}while(!yn.equals("Y")&&!yn.equals("y")&&!yn.equals("n")&&!yn.equals("N"));
			if (yn.equals("n") || yn.equals("N")) {
				break;
			}
		}//while
		System.out.println("프로그램을 종료합니다");
	}

}
