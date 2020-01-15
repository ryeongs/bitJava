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
		System.out.println("������ ����");
		th.start();
		try {
			th.join(); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("������ ����");
		//������ ������ ������� ��������ʴ´�. 
		//������ ����Ǿ ��׶��忡�� ������� ���ư���
	}



}

