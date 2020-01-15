package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int size=(int)(Math.random()*4+2);//2~10
		
		String[] ar;
		ar =new String[size];

		System.out.println("배열명 ar="+ar);
		System.out.println("배열크기 ar="+ar.length); //length 일반 명령어,배열만 ()가 없음
		
		for(int i=0;i<ar.length;i++) {
			System.out.print("과일명 입력:");
			ar[i]=br.readLine();
		}
		for (String data: ar) {
			System.out.println(data);
			System.out.println("첫번째 문자="+data.charAt(0));
			System.out.println("문자열 크기="+data.length()); //length() 함수
			System.out.println("문자열 위치="+data.indexOf("파"));// 문자열의 위치를 찾는것
			System.out.println("글자가없는경우"+data.indexOf("없"));//없는경우 -1 출력
			System.out.println();
		}
	}

}
