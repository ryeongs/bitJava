package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest4 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		boolean[] ar = new boolean[5];
		// menu 함수 호출
		ArrayTest4 at=new ArrayTest4();
		at.menu(ar);
	}

	public void menu(boolean[] ar) throws IOException {
		boolean isExit=false;
		while(!isExit) {
			System.out.println("****************");
	        System.out.println(" 1. 입차");
	        System.out.println(" 2. 출차");
	        System.out.println(" 3. 리스트");
	        System.out.println(" 4. 종료");
	        System.out.println("****************");
	        System.out.print("메뉴 :");
			int menu= Integer.parseInt(br.readLine());

			if(menu==1) input(ar);
			
			else if(menu==2) output(ar);
			
			else if(menu==3) list(ar);
			else if(menu==4) {
	            System.out.println("프로그램을 종료합니다.");
	            isExit = true;
	            break;
			}
			else if(menu<1 || menu >5) {
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
	}
	public void input(boolean[] ar) throws IOException{
		System.out.println("위치 입력 : ");
		int index= Integer.parseInt(br.readLine());
		
		if(ar[index-1]) { //ar[index-1]==true 상수처럼 쓰면 절대안됨!!!
				System.out.println("위치에 이미 주차되어있습니다");
		}else { 
				System.out.println(index+"위치에 입차"); 
				ar[index-1]=true;
			}
	}
	public void output(boolean[] ar) throws IOException {
		System.out.println("위치 입력 : ");
		int index= Integer.parseInt(br.readLine());
		
			if(ar[index-1]) {
				System.out.println("위치에 출차");
				ar[index-1]=false;
			}else { 
				System.out.println("주차되어 있지않습니다");
				ar[index-1]=true;
			}
	}
	public void list(boolean[] ar) {
		for(int i=0;i<ar.length;i++) {
			System.out.println((i+1)+"위치: "+ar[i]);
		}
	}
}