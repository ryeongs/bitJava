package Pro_Forassign4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assign8 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Assign8 a8=new Assign8();
		int num = 0;
		int balance = 0; //�ܰ�
		//int deposit; //�Աݾ�
		
		while (true) {
			System.out.println();
            System.out.println("****************");
            System.out.println(" 1. ����");
            System.out.println(" 2. ���");
            System.out.println(" 3. �ܰ�");
            System.out.println(" 4. ����");
            System.out.println("****************");
            System.out.print("��ȣ ���� :");
            num=Integer.parseInt(br.readLine());
            
            if(num==1) {balance=a8.input(balance);}
            else if(num==2) {balance=a8.output(balance);}
            else if(num==3) {System.out.println("����� �۾���"+balance+"���Դϴ�");}
            if(num==4) break;
		}//while
		System.out.println("���α׷��� �����մϴ�.");
	}
	public int input(int balance) throws  IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int deposit;
		
		System.out.println("���ݾ�:");
		deposit=Integer.parseInt(br.readLine());
		
		if(deposit%10000==0) {
			balance +=balance;
			System.out.println("����� �۾���"+balance+"���Դϴ�");
		}
		else System.out.println("���������� �Է��ϼ���");
		
		return balance;
	}
	public int output(int balance) throws  IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int deposit;
		
		System.out.println("��ݾ�:");
		deposit=Integer.parseInt(br.readLine());
		
		if(balance>=deposit) {
			balance -=deposit;
			System.out.println("����� �۾���"+balance+"���Դϴ�");
		}
		else System.out.println("�ܾ��� �����մϴ�");
		
		return balance;
	}

}
