package class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComputerMain {

	public static void main(String[] args) throws  IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Compute[] com = new Compute[3];
		int x;
		int y;

		
		for(int i=0; i<com.length;i++) {
			com[i]=new Compute();
			
			System.out.print("x입력: ");
			com[i].setX(Integer.parseInt(br.readLine()));
			System.out.print("y입력: ");
			com[i].setY(Integer.parseInt(br.readLine()));
			System.out.println();

			com[i].calc();
		}
		System.out.println();
		System.out.println("x\ty\tSUM\tSUB\tMUL\tDIV\t");
		for(Compute data:com) {
			//data.calc();
			System.out.println(data.getX()+"\t"
			+data.getY()+"\t"
			+data.getSum()+"\t"
			+data.getSub()+"\t"
			+data.getMul()+"\t"
			+data.getDiv());
		}
//		for(int i=0;i<com.length;i++) {
//			com[i].calc();
//			System.out.print(com[i].getX()+"\t"+com[i].getY()+"\t"+
//			com[i].getSum()+"\t"+com[i].getSub()+"\t"+com[i].getMul()
//			+com[i].getDiv());
//		}

	}

}
