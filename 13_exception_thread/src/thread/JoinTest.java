package thread;

public class JoinTest implements Runnable{

	@Override
	public void run() {
		for(int i =1; i<=5;i++) {
			System.out.println(i);
			try {
					Thread.sleep(500);
				}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}
	
	public static void main(String[] args) {
		JoinTest jt=new JoinTest();
		Thread th = new Thread(jt);
		System.out.println("스레드 시작");
		th.start();
		try {
			th.join(); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("스레드 종료");
		//메인이 끝나고 스레드는 종료되지않는다. 
		//메인이 종료되어도 백그라운드에서 스레드는 돌아간다
	}



}

