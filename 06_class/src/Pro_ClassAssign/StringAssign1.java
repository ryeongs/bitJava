package Pro_ClassAssign;

import java.util.Scanner;

public class StringAssign1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index=0;//위치
		int count=0;//개수
		
		System.out.println("문자열 입력: ");
		String str = sc.next();
		 
		System.out.println("현재 문자열 입력: ");
		String target = sc.next();
		 
		System.out.println("바뀰 문자열 입력: ");
		String replacing = sc.next();
		
		if(str.length() <target.length()) {
			System.out.println("입력한 문자열의 크기가 작습니다");
			return;
		}
		
		str=str.toLowerCase();
		target=target.toLowerCase();
		//index 위치부터 target을 찾아라
		while(str.indexOf(target, index)!=-1) {
			index +=target.length();
			count++;
		}//while
		
		System.out.println(str.replace(target, replacing));
		System.out.println(count+"개 치환");	

	}

}
