package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForAssign4 {

	public static void main(String[] args) throws IOException {
		/*
		 * [����4] ���� ���� 10~99 ������ ������ 2��(a,b) �߻��Ͽ� ���� ���ߴ� ���� �������� �� 5������ �����Ѵ� 1������ ����
		 * 20���� ��� ���� Ʋ���� ��ȸ�� 1�� �� �����Ѵ�
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sw, count = 0, score = 0;
		boolean oneMore=true;
		while (true) {
			for (int i = 1; i < 6; i++) {
				int a = (int) (Math.random() * 89) + 10;
				int b = (int) (Math.random() * 89) + 10;
				
				System.out.print("["+i+"]"+a + "+" + b + "=");
				System.out.println("\t" + (a + b));
				System.out.print("���:");
				int user = Integer.parseInt(br.readLine());
				if (user == a + b) {
					count++;
					System.out.println(count + "��° ����");
					System.out.println("������");
					score += 20;
				} else {
					count++;
					System.out.println(count + "��° ����");
					System.out.println("Ʋ����");
					oneMore=false;
					if(oneMore=false) {
						while(true) {
							System.out.print("["+i+"]"+a + "+" + b + "=");
							user = Integer.parseInt(br.readLine());
							if(user == a + b) break;
						}
					}
				}
				System.out.println("score:" + score);
			}
			System.out.println("����� ��" + count + "���缭" + score + "�� �Դϴ�");
			System.out.print("continue(y/n) :");
			String again = br.readLine();
			if (again.equals("n")) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}

		}
	}

}
