package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.management.monitor.Monitor;

public class ATMTest implements Runnable{
	private long depositeMoney=100000; //�ܾ�
	private long balance;//ã���� �ϴ� �ݾ�
	
	public static void main(String[] args) {
		ATMTest atm=new ATMTest();
		
		Thread mom =new Thread(atm, "mom");
		Thread son=new Thread(atm, "son");
		
//		mom.setName("mom");
		
		mom.start();
		son.start();
		
	}
	@Override
	public synchronized void run() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(Thread.currentThread().getName() 
				+ "�� �ȳ��ϼ���");

		System.out.print("ã���� �ݾ��� �Է����ּ��� : ");
		try {
			balance = Long.parseLong(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		withDraw();

	}
	public void withDraw() {
		if(balance< 10000) {
			System.out.println("���������� �Է��ϼ���");
		}else if(balance >depositeMoney) {
			System.out.println("�ܾ��ʰ��� ������ ���ư�");
		}else
			System.out.print("�ܾ��� "+(depositeMoney-balance)+"�Դϴ�");
	}
	

}
