package Pro_Forassign4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class assign4 {
	/*
	 * [����4] ���� ���� 10~99 ������ ������ 2��(a,b) �߻��Ͽ� ���� ���ߴ� ���� �������� �� 5������ �����Ѵ� 1������ ����
	 * 20���� ��� ���� Ʋ���� ��ȸ�� 1�� �� �����Ѵ�
	 */
	public static void main(String[] args) throws  IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int a,b,answer,count;
		String yn;
		while (true) {
			count=0;
			for (int i = 1; i < 5; i++) {
				a=(int)(Math.random()*90+10);//10~99
				b=(int)(Math.random()*90+10);//10~99
				
				for(int j=1;j<=2;j++) { //���κ��� �ݺ��Ǵ��� �� �����Ѵ�.������ Ʋ���� ��ȸ�� j�� �ش�.
					System.out.println("["+i+"]"+a+"+"+b+"=");
					answer =Integer.parseInt(br.readLine());
					
					if(answer==a+b) {
						System.out.println("������");
						count++;
						break;//for j�� ������
					}else {
						if(j==2) System.out.println("Ʋ�ȴ�.. ������"+(a+b));
						else System.out.println("Ʋ��");
					}
				}//for j
			}//for i
			System.out.println("����� ��"+count+"������ ���߾"+count*20+"���Դϴ�");
			System.out.println();
	
			do {
				System.out.print("continue(Y/N): ");
				yn=br.readLine();
			}while(!yn.equals("Y")&&!yn.equals("y")&&!yn.equals("n")&&!yn.equals("N"));
			if (yn.equals("n") || yn.equals("N")) {
				break;
			}
		}//while
		System.out.println("���α׷��� �����մϴ�");
	}

}
