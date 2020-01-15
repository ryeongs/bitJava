package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.management.monitor.Monitor;

public class ATMTest implements Runnable{
	private long depositeMoney=100000; //잔액
	private long balance;//찾고자 하는 금액
	
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
				+ "님 안녕하세욥");

		System.out.print("찾으실 금액을 입력해주세여 : ");
		try {
			balance = Long.parseLong(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		withDraw();

	}
	public void withDraw() {
		if(balance< 10000) {
			System.out.println("만원단위로 입력하세엽");
		}else if(balance >depositeMoney) {
			System.out.println("잔액초과쓰 돈없으 돌아가");
		}else
			System.out.print("잔액은 "+(depositeMoney-balance)+"입니다");
	}
	

}
