package Pro_ClassAssign;

import java.util.Scanner;

public class FruitMain {

	public static void main(String[] args) {
		FruitAssign2 ar[]=new FruitAssign2[3];
		ar[0] = new FruitAssign2("���",100,80,75);
		ar[1] = new FruitAssign2("����",30,25,10);
		ar[2] = new FruitAssign2("����",30,25,10);
		System.out.println("--------------------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("--------------------------------------------");
		
		for(FruitAssign2 f :ar) {
			f.calcTot();
			f.disp();
		}
		System.out.println("------------------------------------");
		FruitAssign2.output();
	}

}
