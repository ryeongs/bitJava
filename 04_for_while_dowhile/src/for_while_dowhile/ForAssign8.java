package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForAssign8 {
      static int totMoney;
	  static int outM=0;
	  static int totIn = 0;
	  static int temp;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean isExit = false;
		boolean noM = false;
		while(!isExit) {
            System.out.println("****************");
            System.out.println(" 1. 예금");
            System.out.println(" 2. 출금");
            System.out.println(" 3. 잔고");
            System.out.println(" 4. 종료");
            System.out.println("****************");
            System.out.print("번호 선택 :");
          
			int menu = Integer.parseInt(br.readLine());
			switch(menu){
	        case 1:
	            System.out.println("1.예금");	            
	            ForAssign8 in = new ForAssign8();
	        	System.out.println("예금액:");
	        	int inNum = Integer.parseInt(br.readLine());
	        	totIn = in.input(inNum);
	        	if(inNum<10000) {
	        		System.out.println("만원 단위로 입력하세요");
	        		System.out.println("다시 입력해 주세요");
	        		noM=true;
	        		break;
	        	}else {
		        	//in.input(inNum);
		        	totIn=+inNum;
		        	break;
	        	}
	        case 2:
	            System.out.println("2.출금");
	            ForAssign8 out = new ForAssign8();
	            System.out.print("출금액:");
	            int outNum = Integer.parseInt(br.readLine());

	            if(outM>totIn) {
	            	System.out.println("잔액부족");
	            	System.out.println("다시 입력해 주세요");
	            	noM=true;
	            	break; 
	            }else {
		           outM= out.output(outNum,totIn);
		           // outM = outNum;
		            break;
	            }
	        case 3:
	            System.out.println("3.잔고");
	            totMoney=totIn-outM;
	            
	            if(totMoney < 0) {
	            	System.out.println("다시 입력해 주세요");
	            	break; 
	            }
	            else {
		            totMoney+=totMoney;
	            	System.out.println("당신의 잔액은 "+totMoney+"원 입니다");
	            }
	        	break;
	        case 4:
	            System.out.println("프로그램을 종료합니다.");
	            isExit = true;
	            break;
	        default:
	            System.out.println("잘못입력하셨습니다.");
	    }
		}
	}
	public int input(int inNum) {
		int temp =inNum;
		//temp+=inNum;
    	System.out.println("당신은 "+temp+"원을 입력하셨습니다");
    	return temp;
	}
	public int output(int outNum,int inN) {
		int out=outNum-inN;
        System.out.println("당신의 잔액은 "+out+"원 입니다");
        return out;
	}

}
