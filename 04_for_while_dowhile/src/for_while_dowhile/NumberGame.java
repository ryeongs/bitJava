package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGame {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		do {
			int count=0;
			int com=(int)(Math.random()*100)+1;
			System.out.println(com);
			String again;
			while(true) {
				System.out.print("���� �Է�: ");
				int user = Integer.parseInt(br.readLine());
				System.out.println();
				count++;
				if(com==user) break;
				else if(com>user)System.out.println(user + "���� Ů�ϴ�");
				else System.out.println(user + "���� �۽��ϴ�");
			}
			    System.out.println(count+"������ ���߼̽��ϴ�!");
			    System.out.print("�� �ҷ�(Y/N) :"); 
			    again=br.readLine(); 
			    if(again.equals("n")){break;}
			 	   else continue;
		}while(true);
		System.out.println("���α׷��� �����մϴ�"); 
	}
  }

//���ڸ��߱� ���� 
/*
 *1-100���� ���� �߻��Ͽ� ���ߴ°���
 *[������]
 *�����Է�:50
 *50���� Ů�ϴ�
 *
 * �����Է�:90
 * 90���� �۽��ϴ�.
 * ...
 * 
 * �����Է�:87
 * ������ 00������ ���߼˽��ϴ�
 */
