package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayAssign4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] com = new int[3];
		int[] user = new int[3];
		int num=0;
		int count=0;
		int ball = 0,strike= 0;

		System.out.println("게임을 실행하시겠습니까(Y/N): ");
		String yn = br.readLine();

		while (yn != "n" || yn != "N") {
			System.out.println("게임을 시작합니다");
			
			//난수 넣고 중복체크
			for(int i=0; i<com.length;i++) {
				com[i]= (int) ((Math.random() * 9) + 1);
				for(int j=0;j<i;j++) {
					if(com[j]==com[i]) {
						i--;
						break;
					}
				}
			}
			//user 입력 
			System.out.print("숫자입력 : ");
			num = Integer.parseInt(br.readLine());
			

				for (int i = 0; i <= 3; i++) {
		//			System.out.print("숫자입력 : ");
			//		num = Integer.parseInt(br.readLine());

					user[i] = num;
					if(user[i]<0||user[i]>10) {
						System.out.println("1~9의 정수 입력해주세요");
					}
				}
				for(int i=0; i<com.length;i++) {
					for(int j=0;j<user.length;j++) {
						if(com[i]==user[j] && i == j) {
							strike++;
						}
						else if(com[i]==user[j] && i!=j) ball++;
					}
				}
				System.out.println(strike+" 스트라이크 "+ball+"볼");
				strike =0;
				ball=0;
				
				if(strike>=3) {
					break;
				}
				
				count=count+1;
			}
			System.out.println("횟수 : "+(count -1));
			System.out.println("끗ㅌ");
		}
	
}
//https://m.blog.naver.com/PostView.nhn?blogId=kdj9502&logNo=221169458329&proxyReferer=https%3A%2F%2Fwww.google.com%2F
//https://m.blog.naver.com/PostList.nhn?blogId=cec7777
/*
 * [문제4] 야구게임 크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다 발생한 수를 맞추는 게임 중복은 제거한다
 * 
 * [실행결과] 게임을 실행하시겠습니까(Y/N) : w 게임을 실행하시겠습니까(Y/N) : u 게임을 실행하시겠습니까(Y/N) : y
 * 
 * 게임을 시작합니다
 * 
 * 숫자입력 : 123 0스트라이크 0볼
 * 
 * 숫자입력 : 567 0스트라이크 2볼
 * 
 * 숫자입력 : 758 1스트라이크 2볼 ...
 * 
 * 숫자입력 : 785 3스트라이크 0볼
 * 
 */
