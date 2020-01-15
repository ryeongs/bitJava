package for_while_dowhile;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ForAssign7 {

	public static void main(String[] args) {

		for(int j=1;j<10;j++) {
			for(int i=2;i<5;i++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int j=1;j<10;j++) {
			for(int i=5;i<8;i++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
		System.out.println();

		for(int j=1;j<10;j++) {
			for(int i=8;i<10;i++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
		
	}	
}
