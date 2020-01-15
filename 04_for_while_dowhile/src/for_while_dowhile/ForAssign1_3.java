package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForAssign1_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//[문제1] 가위바위보 게임 - if문
		System.out.println("[문제1] \n<가위바위보 게임> ============================");
		while(true) {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int comNum=(int)(Math.random()*3)+1;
		System.out.print("가위(1),바위(2),보(3) 중 번호 입력:");
		System.out.print("");
		int myNum = Integer.parseInt(br.readLine());
		System.out.print("컴퓨터:");
		if(comNum==1)	System.out.print("가위");
		else if(comNum ==2) System.out.print("바위");
		else System.out.print("보");
		System.out.print("\t유저:");
		if(myNum==1)	System.out.print("가위");
		else if(myNum ==2) System.out.print("바위");
		else System.out.print("보");
		System.out.println("");
		String again=null;
		
		if(comNum ==myNum) {
			System.out.println("You Draw!!");
			  System.out.print("또 할래(Y/N) :"); 
			  again=br.readLine(); 
			  if(again.equals("n")){break;}
			  else continue;
			}
		else if((comNum == 1 && myNum == 2) || 
				(comNum == 2 && myNum == 3) || 
				(comNum == 3 && myNum == 1)) {
			System.out.println("You Win!!");
			  System.out.print("또 할래(Y/N) :"); 
			  again=br.readLine(); 
			  if(again.equals("n")){break;}
			  else continue;
		}
		else {
		System.out.println("You Lose!!");
		  System.out.print("또 할래(Y/N) :"); 
		  again=br.readLine(); 
		  if(again.equals("n")){break;}
		  else continue;
		}
	}
		System.out.println("[문제2] \n<제곱구하기> ============================");
		BufferedReader br2 =new BufferedReader(new InputStreamReader(System.in));
		//[문제2] 제곱을 구하시오 (x의 y의 승)
		System.out.print("x값 입력 : ");
		int x=Integer.parseInt(br2.readLine());
		System.out.print("y값 입력 : ");
		int y=Integer.parseInt(br2.readLine());
		int result=1;
		for(int loop=y;loop>0;loop--) {
			result=result*x;//x의 값만 곱한다
		}
		System.out.println(x+"의"+y+"승 = "+result);
		System.out.println("[문제3] \n<약수구하기> ============================");
		BufferedReader br3 =new BufferedReader(new InputStreamReader(System.in));
		//[문제3]숫자를 입력하여 약수를 구하시오 
		System.out.print("숫자 입력 : ");
		int num=Integer.parseInt(br3.readLine());
		for(int i =1; i<=num;i++) {
			if((num%i)==0) {
				System.out.print(i+" ");
			}
		}
	}
}
