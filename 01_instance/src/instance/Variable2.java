package instance;

public class Variable2 {
	int a; //��������(field), �ν��Ͻ����� �ݵ�� new������Ѵ�
	static int b; //Ŭ��������
	 String str;
	
	public static void main(String[] args) {
		int a = 10;//��������(local variable), �����Ⱚ(�ݵ���ʱ�ȭ)
		System.out.println("���� a="+a);

		System.out.println("���� a="+new Variable2().a);
		
		Variable2 field =new Variable2();
		System.out.println("����(�ʵ�)���1 b="+field.b);
		
		System.out.println("����(�ʵ�)���2 b="+Variable2.b);
		
		System.out.println("����(�ʵ�)���3 b="+b);

		System.out.println("����(�ʵ�)���3 str="+field.str);

		
	}

}
