package nested;

public class AbstractMain {
	
	
	public static void main(String[] args) {
		AbstractTest at=new AbstractTest(){
			@Override
			public void setName(String name) {
				this.name=name;
			}
		};//{}�� ����ؼ� override�� �� �� �ִ�
		InterA aa =new InterA() { // InterA �ڿ� {}�� new�Ѱ�
			public void aa() {} //���� �������̽� new�Ѱ� �ƴ�!!!!!
			public void bb() {}
		};
		AbstractExam ae=new AbstractExam() {}; 
		// �������̵� �ص��ǰ� ���ص��ȴ� - ������
	}

}
