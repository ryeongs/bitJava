package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiple {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int again;
		while(true) {
			System.out.print("�����Է�:");
			int user = Integer.parseInt(br.readLine());
			if(user<0) 	continue;
			if(user == 0) {System.out.println("���α׷��� �����մϴ�"); break;}
			else {
				for(int j=1; j<8; j++) {
					System.out.print(user*j+" ");
				}System.out.println();
			}	
		}

	}

}
//���ڸ� �Է��Ͽ� ����� 7���� ���Ͻÿ�
/*
�� �����̸� �ٽ� �Է��ϰ� 0�̸� �����Ͻÿ�
[������]
�����Է�: -7
�����Է�: 8
8 16 24 32 40 48 56

�����Է� : 0 
���α׷� ����
*/
