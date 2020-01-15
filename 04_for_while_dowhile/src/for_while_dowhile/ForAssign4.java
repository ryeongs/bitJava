package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForAssign4 {

	public static void main(String[] args) throws IOException {
		/*
		 * [문제4] 덧셈 공부 10~99 사이의 난수를 2개(a,b) 발생하여 합을 맞추는 게임 문제수는 총 5문제를 제공한다 1문제당 점수
		 * 20점씩 계산 만약 틀리면 기회를 1번 더 제공한다
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sw, count = 0, score = 0;
		boolean oneMore=true;
		while (true) {
			for (int i = 1; i < 6; i++) {
				int a = (int) (Math.random() * 89) + 10;
				int b = (int) (Math.random() * 89) + 10;
				
				System.out.print("["+i+"]"+a + "+" + b + "=");
				System.out.println("\t" + (a + b));
				System.out.print("결과:");
				int user = Integer.parseInt(br.readLine());
				if (user == a + b) {
					count++;
					System.out.println(count + "번째 문제");
					System.out.println("딩동댕");
					score += 20;
				} else {
					count++;
					System.out.println(count + "번째 문제");
					System.out.println("틀렸음");
					oneMore=false;
					if(oneMore=false) {
						while(true) {
							System.out.print("["+i+"]"+a + "+" + b + "=");
							user = Integer.parseInt(br.readLine());
							if(user == a + b) break;
						}
					}
				}
				System.out.println("score:" + score);
			}
			System.out.println("당신은 총" + count + "맞춰서" + score + "점 입니다");
			System.out.print("continue(y/n) :");
			String again = br.readLine();
			if (again.equals("n")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}

		}
	}

}
