package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest4 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		boolean[] ar = new boolean[5];
		// menu �Լ� ȣ��
		ArrayTest4 at=new ArrayTest4();
		at.menu(ar);
	}

	public void menu(boolean[] ar) throws IOException {
		boolean isExit=false;
		while(!isExit) {
			System.out.println("****************");
	        System.out.println(" 1. ����");
	        System.out.println(" 2. ����");
	        System.out.println(" 3. ����Ʈ");
	        System.out.println(" 4. ����");
	        System.out.println("****************");
	        System.out.print("�޴� :");
			int menu= Integer.parseInt(br.readLine());

			if(menu==1) input(ar);
			
			else if(menu==2) output(ar);
			
			else if(menu==3) list(ar);
			else if(menu==4) {
	            System.out.println("���α׷��� �����մϴ�.");
	            isExit = true;
	            break;
			}
			else if(menu<1 || menu >5) {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				break;
			}
		}
	}
	public void input(boolean[] ar) throws IOException{
		System.out.println("��ġ �Է� : ");
		int index= Integer.parseInt(br.readLine());
		
		if(ar[index-1]) { //ar[index-1]==true ���ó�� ���� ����ȵ�!!!
				System.out.println("��ġ�� �̹� �����Ǿ��ֽ��ϴ�");
		}else { 
				System.out.println(index+"��ġ�� ����"); 
				ar[index-1]=true;
			}
	}
	public void output(boolean[] ar) throws IOException {
		System.out.println("��ġ �Է� : ");
		int index= Integer.parseInt(br.readLine());
		
			if(ar[index-1]) {
				System.out.println("��ġ�� ����");
				ar[index-1]=false;
			}else { 
				System.out.println("�����Ǿ� �����ʽ��ϴ�");
				ar[index-1]=true;
			}
	}
	public void list(boolean[] ar) {
		for(int i=0;i<ar.length;i++) {
			System.out.println((i+1)+"��ġ: "+ar[i]);
		}
	}
}