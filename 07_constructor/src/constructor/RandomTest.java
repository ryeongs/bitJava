package constructor;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	
	public RandomTest() {
		double a=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("����: "+Math.random());
		System.out.println("����: "+new Random().nextDouble());
		System.out.println("����: "+new Random().nextInt());
		System.out.println("����: "+new Random().nextInt(100)); //0~99
		System.out.println("����: "+(new Random().nextInt(100)+1)); //1~100
	}
	
	public static void main(String[] args) {
		RandomTest rt=new RandomTest();
		//new RandomTest(); 1ȸ�� 
	}

}
