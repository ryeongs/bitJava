package for_while_dowhile;

public class DoWhileTest {

	public static void main(String[] args) {
//		int a=0;
//		do {
//			a++;
//			System.out.print(a+" ");
//			if(a>=10) {break;}
//		}while(a<10);
//	
//	for(int i='A' ; i<='Z'; i++) {
//		System.out.print((char)i+" ");
//	}
	//A-Z 출력하되 1줄에 7개
		
		char ch='A';
		int count=0;
		do {
			System.out.print(ch+" ");
			ch++;
			count ++;
			if(count%7==0) System.out.println();
		}while(ch<='Z');
}
}
