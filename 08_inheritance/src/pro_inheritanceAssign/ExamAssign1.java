package pro_inheritanceAssign;

import java.util.Scanner;

public class ExamAssign1 {


	private String name;
	private String dap;

	private int score;
	private final String JUNG="11111";
	private char[] ox; //=new char[JUNG.length()];
	
	public ExamAssign1() {
//		this.name=name;
//		this.dap=dap;
		Scanner sc = new Scanner(System.in);
		ox = new char[5]; //초기화

		System.out.print("이름 입력: ");
		name = sc.next();
		System.out.print("답 입력:");
		dap=sc.next();
		System.out.println();
		
		}

	public void compare() {
		for(int i=0; i<JUNG.length();i++) {

			if(dap.charAt(i)==JUNG.charAt(i)) {
				ox[i]='O';
				//System.out.print(ox[i]+" ");
				score+=20;
			}else {
				ox[i]='X';
				//System.out.print(ox[i]+" ");

			}

		}//for 
			
	}
	public String getDap() {
		return dap;
	}
	
	public String getName() {
		return name;
	}
	
	public char[] getOx() {
		return ox;
	}

	public int getScore() {
		return score;
	}
	

}
