package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultFor { //구구단 2-9단

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		//int count=0;
		for(int i =2; i <10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}System.out.println();
		}
	}
}
