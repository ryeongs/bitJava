package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayAssign4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] com = new int[3];
		int[] user = new int[3];
		int num=0;
		int count=0;
		int ball = 0,strike= 0;

		System.out.println("������ �����Ͻðڽ��ϱ�(Y/N): ");
		String yn = br.readLine();

		while (yn != "n" || yn != "N") {
			System.out.println("������ �����մϴ�");
			
			//���� �ְ� �ߺ�üũ
			for(int i=0; i<com.length;i++) {
				com[i]= (int) ((Math.random() * 9) + 1);
				for(int j=0;j<i;j++) {
					if(com[j]==com[i]) {
						i--;
						break;
					}
				}
			}
			//user �Է� 
			System.out.print("�����Է� : ");
			num = Integer.parseInt(br.readLine());
			

				for (int i = 0; i <= 3; i++) {
		//			System.out.print("�����Է� : ");
			//		num = Integer.parseInt(br.readLine());

					user[i] = num;
					if(user[i]<0||user[i]>10) {
						System.out.println("1~9�� ���� �Է����ּ���");
					}
				}
				for(int i=0; i<com.length;i++) {
					for(int j=0;j<user.length;j++) {
						if(com[i]==user[j] && i == j) {
							strike++;
						}
						else if(com[i]==user[j] && i!=j) ball++;
					}
				}
				System.out.println(strike+" ��Ʈ����ũ "+ball+"��");
				strike =0;
				ball=0;
				
				if(strike>=3) {
					break;
				}
				
				count=count+1;
			}
			System.out.println("Ƚ�� : "+(count -1));
			System.out.println("����");
		}
	
}
//https://m.blog.naver.com/PostView.nhn?blogId=kdj9502&logNo=221169458329&proxyReferer=https%3A%2F%2Fwww.google.com%2F
//https://m.blog.naver.com/PostList.nhn?blogId=cec7777
/*
 * [����4] �߱����� ũ�Ⱑ 3���� ������ �迭�� ��� 1~9������ ������ �߻��Ѵ� �߻��� ���� ���ߴ� ���� �ߺ��� �����Ѵ�
 * 
 * [������] ������ �����Ͻðڽ��ϱ�(Y/N) : w ������ �����Ͻðڽ��ϱ�(Y/N) : u ������ �����Ͻðڽ��ϱ�(Y/N) : y
 * 
 * ������ �����մϴ�
 * 
 * �����Է� : 123 0��Ʈ����ũ 0��
 * 
 * �����Է� : 567 0��Ʈ����ũ 2��
 * 
 * �����Է� : 758 1��Ʈ����ũ 2�� ...
 * 
 * �����Է� : 785 3��Ʈ����ũ 0��
 * 
 */
