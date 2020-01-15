package array;

import java.io.IOException;
public class ArrayAssign3 {

	public static void main(String[] args) throws IOException {
		int lot[]=new int[6];
		System.out.println("선택:");
		ArrayAssign3 aa=new ArrayAssign3();
		aa.input(lot);
		
		aa.output(lot);
		System.out.println("입니다");
	}
	public void input(int []lot) { //난수 발생, 중복된 숫자가 나오면 다시 발생
		for(int i =0;i<lot.length;i++) {
			lot[i] =(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(lot[i]==lot[j]) {
					i--;
					break;
				}//중복값 제거
			}
		}
	}
	public void output(int []lot) {//출력
		for(int i=0;i<lot.length;i++) {
			System.out.print(lot[i] + " ");
		}
	}
}
