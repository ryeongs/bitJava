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
            System.out.println(" 1. ����");
            System.out.println(" 2. ���");
            System.out.println(" 3. �ܰ�");
            System.out.println(" 4. ����");
            System.out.println("****************");
            System.out.print("��ȣ ���� :");
          
			int menu = Integer.parseInt(br.readLine());
			switch(menu){
	        case 1:
	            System.out.println("1.����");	            
	            ForAssign8 in = new ForAssign8();
	        	System.out.println("���ݾ�:");
	        	int inNum = Integer.parseInt(br.readLine());
	        	totIn = in.input(inNum);
	        	if(inNum<10000) {
	        		System.out.println("���� ������ �Է��ϼ���");
	        		System.out.println("�ٽ� �Է��� �ּ���");
	        		noM=true;
	        		break;
	        	}else {
		        	//in.input(inNum);
		        	totIn=+inNum;
		        	break;
	        	}
	        case 2:
	            System.out.println("2.���");
	            ForAssign8 out = new ForAssign8();
	            System.out.print("��ݾ�:");
	            int outNum = Integer.parseInt(br.readLine());

	            if(outM>totIn) {
	            	System.out.println("�ܾ׺���");
	            	System.out.println("�ٽ� �Է��� �ּ���");
	            	noM=true;
	            	break; 
	            }else {
		           outM= out.output(outNum,totIn);
		           // outM = outNum;
		            break;
	            }
	        case 3:
	            System.out.println("3.�ܰ�");
	            totMoney=totIn-outM;
	            
	            if(totMoney < 0) {
	            	System.out.println("�ٽ� �Է��� �ּ���");
	            	break; 
	            }
	            else {
		            totMoney+=totMoney;
	            	System.out.println("����� �ܾ��� "+totMoney+"�� �Դϴ�");
	            }
	        	break;
	        case 4:
	            System.out.println("���α׷��� �����մϴ�.");
	            isExit = true;
	            break;
	        default:
	            System.out.println("�߸��Է��ϼ̽��ϴ�.");
	    }
		}
	}
	public int input(int inNum) {
		int temp =inNum;
		//temp+=inNum;
    	System.out.println("����� "+temp+"���� �Է��ϼ̽��ϴ�");
    	return temp;
	}
	public int output(int outNum,int inN) {
		int out=outNum-inN;
        System.out.println("����� �ܾ��� "+out+"�� �Դϴ�");
        return out;
	}

}
