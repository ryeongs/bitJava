package for_while_dowhile;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MultFor2 {

	public static void main(String[] args) {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		for(int i =1; i <10; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}

