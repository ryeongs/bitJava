package instance;

public class Operator3 {

	public static void main(String[] args) {
		boolean a =25>36;
		System.out.println("a="+a);
		System.out.println("a!="+!a);
		
		
		String b ="apple"; //���ڿ�literal
		String c=new String("apple");
	
		//�ּҰ� ������ ����°�
		if(b==c) System.out.println("same");
		else if(b!=c) System.out.println("true");
		//�ڹ��� ���) �ּ�=������ 

		System.out.println("b.equals(c) : "+(b.equals(c) ? "same":"different"));
		System.out.println("b.equals(c) T or F: "+(!b.equals(c) ? "true":"false"));

	}
	

}
