package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForAssign1_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//[����1] ���������� ���� - if��
		System.out.println("[����1] \n<���������� ����> ============================");
		while(true) {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int comNum=(int)(Math.random()*3)+1;
		System.out.print("����(1),����(2),��(3) �� ��ȣ �Է�:");
		System.out.print("");
		int myNum = Integer.parseInt(br.readLine());
		System.out.print("��ǻ��:");
		if(comNum==1)	System.out.print("����");
		else if(comNum ==2) System.out.print("����");
		else System.out.print("��");
		System.out.print("\t����:");
		if(myNum==1)	System.out.print("����");
		else if(myNum ==2) System.out.print("����");
		else System.out.print("��");
		System.out.println("");
		String again=null;
		
		if(comNum ==myNum) {
			System.out.println("You Draw!!");
			  System.out.print("�� �ҷ�(Y/N) :"); 
			  again=br.readLine(); 
			  if(again.equals("n")){break;}
			  else continue;
			}
		else if((comNum == 1 && myNum == 2) || 
				(comNum == 2 && myNum == 3) || 
				(comNum == 3 && myNum == 1)) {
			System.out.println("You Win!!");
			  System.out.print("�� �ҷ�(Y/N) :"); 
			  again=br.readLine(); 
			  if(again.equals("n")){break;}
			  else continue;
		}
		else {
		System.out.println("You Lose!!");
		  System.out.print("�� �ҷ�(Y/N) :"); 
		  again=br.readLine(); 
		  if(again.equals("n")){break;}
		  else continue;
		}
	}
		System.out.println("[����2] \n<�������ϱ�> ============================");
		BufferedReader br2 =new BufferedReader(new InputStreamReader(System.in));
		//[����2] ������ ���Ͻÿ� (x�� y�� ��)
		System.out.print("x�� �Է� : ");
		int x=Integer.parseInt(br2.readLine());
		System.out.print("y�� �Է� : ");
		int y=Integer.parseInt(br2.readLine());
		int result=1;
		for(int loop=y;loop>0;loop--) {
			result=result*x;//x�� ���� ���Ѵ�
		}
		System.out.println(x+"��"+y+"�� = "+result);
		System.out.println("[����3] \n<������ϱ�> ============================");
		BufferedReader br3 =new BufferedReader(new InputStreamReader(System.in));
		//[����3]���ڸ� �Է��Ͽ� ����� ���Ͻÿ� 
		System.out.print("���� �Է� : ");
		int num=Integer.parseInt(br3.readLine());
		for(int i =1; i<=num;i++) {
			if((num%i)==0) {
				System.out.print(i+" ");
			}
		}
	}
}
