package class_2;

public class StringTest {

	public static void main(String[] args) {
		String a = "apple"; // literal ����
		String b = "apple"; // literal�� ���� ���� ������ �޸𸮸� ������ �ʴ´�
							// b�� �ᱹ a�� �ּҰ��� ���Եȴ�.
		if (a == b) {// �ּҰ� ������
			System.out.println("a��b�� �������� ����");
		} else {
			System.out.println("�ٸ���");
			System.out.println();
		}
		if(a.equals(b)) System.out.println("���ڿ� ����");
		else System.out.println("���ڿ��� �ٸ���");


		String c = new String("apple"); // �޸𸮸� ��� �����
		String d = new String("apple");// �̱��� - new �� 1���� �ؾ��Ѵ�, static����
		// �Ȱ��� ���ڿ��� �ѹ��� new �ؾ��Ѵ�
		if (c == d) {// �ּҰ� ������
			System.out.println("a��b�� �������� ����");
		} else {
			System.out.println("�ٸ���");
			//System.out.println();
		}
		if(c.equals(b)) System.out.println("���ڿ� ����");
		else System.out.println("���ڿ��� �ٸ���");
		
		String e="���ó�¥�� "+2019+12+30;
		System.out.println("e ="+e);
		
		/*
		 * ���ڿ��� ���� ������ �ȵǹǷ� �޸� 4�� �����ȴ�
		 * (JVM�� ����)������ garbage collector�� ������
		 * Garbage Collector�� ����Ǹ� ��ǻ�ʹ� �����
		 */
		System.out.println("���ڿ���ũ��= "+e.length());
		
		for(int i=0; i<e.length(); i++) {
			System.out.println(i+":"+e.charAt(i));
		}
		System.out.println("�κй��ڿ� ����="+e.substring(7));
		System.out.println("�κй��ڿ� ����="+e.substring(7,11));//7������ 10������ (11�� ��)
		
		System.out.println("�빮�� ����="+"Hello".toUpperCase());//HELLO
		System.out.println("�ҹ��� ����="+"Hello".toLowerCase());//hello
		
		System.out.println("���ڿ� �˻�="+e.indexOf("¥"));//¥ ��� ���ڸ� ã�ƶ�(���°����)
		System.out.println("���ڿ� �˻�="+e.indexOf("��¥"));
		System.out.println("���ڿ� �˻�="+e.indexOf("���ٺ�")); //������ -1 �� ���´�
	}
	

}
