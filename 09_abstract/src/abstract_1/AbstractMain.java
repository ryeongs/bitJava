package abstract_1;
//�߻�Ŭ������ ������ �ִ� ���ǵ��� �Ȱ��� �ؾ��Ѵ�(abstract class) - override���ص��� 

public class AbstractMain extends AbstractTest{
	
	//override 
	public void setName(String name) {
		this.name=name;
	}
	public static void main(String[] args) {
		//AbstractTest at= new AbstractTest(); //�߻�Ŭ������ new ���Ѵ� �޸𸮿� ������ ���Ѵ�
		AbstractTest at=new AbstractMain(); //�׷��Ƿ� �ڽ��� ��� �޸𸮻����� ���ش� ,�ڽ�Ŭ������ ���� �θ�Ŭ������ ���� ������ش�
		at.setName("ȫ�浿");
		System.out.println("�̸�:"+at.getName());
	}
}
