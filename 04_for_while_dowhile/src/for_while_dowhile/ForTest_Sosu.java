package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest_Sosu {

	public static void main(String[] args) throws  IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int sw;
		while(true) {
			sw=0;
			System.out.print("�����Է�:");
			int user = Integer.parseInt(br.readLine());
			if(user<0) 	continue;
			if(user == 0) {System.out.println("���α׷��� �����մϴ�"); break;}
			else {
				for(int i =2; i<user;i++) {
					if((user%i)==0) sw=1;
				} 
				System.out.println();
				if(sw==0) System.out.println(user+"�� �Ҽ��̴�");
				else System.out.println(user+"�� �Ҽ����ƴϴ� ");
			}
				
		}//while
	}
}
//�Ҽ� - 1�� �ڱ��ڽ�
/*�Ҽ������ϱ�
��, 0�ԷµǸ� ���α׷� ����
		for(int i =1; i<=num;i++) {
			if((num%i)==0) {
				System.out.print(i+" ");
			}
		}
[������ ]
�����Է�:12
12�� �Ҽ��� �ƴϴ�

�����Է�:37
37�� �Ҽ��̴�

���� �Է�:0
���α׷� ����
*/