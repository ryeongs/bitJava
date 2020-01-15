package for_while_dowhile;

import java.util.Random;

public class ForTest_Random {
	public static void main(String[] args) {
		//A-Z(65-90) 무작위로 100개 출력
		int count=0;
		int num=0;
		for(int i=1;i<=100;i++) {
			 num=(int)(Math.random()*26+65); //65~90
			System.out.print((char)num+" ");

			if(num=='A') count++; 
			
			if(i%10==0) System.out.println();
			
		}
		System.out.println();
		System.out.print("a의개수"+count);
	}
}

