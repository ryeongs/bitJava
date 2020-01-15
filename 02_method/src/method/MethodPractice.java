package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodPractice {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*[����1]
* ����(dec)�� �Է¹޾Ƽ� 2����(binary), 8����(octor), 16����(hexa) ��ȯ�Ͻÿ�
IntegerŬ���� �޼ҵ带 �̿��Ͻÿ�
 */
		System.out.print("10������ �Է��ϼ���:");
		int dec = Integer.parseInt(br.readLine());
		
		String binary = Integer.toBinaryString(dec);  // 10���� -> 2����
		String octor= Integer.toOctalString(dec);    // 10���� -> 8����
		String hexa = Integer.toHexString(dec);    // 10���� -> 16����

		System.out.println("[����1.������]");
		System.out.println("2����="+binary);
		System.out.println("8����="+octor);
		System.out.println("16����="+hexa);
		System.out.println("===============================");

/*
* [����2]
�ֻ����� 2�� ������ ���� ���� ���� ���Ͻÿ�
�ֻ����� input()���� 1~6������ ������ �߻��Ͽ� �����Ѵ�
���� add()���� ���Ͽ� ���� �޴´�
*/	
		MethodPractice random=new MethodPractice();
		int r1=(int)(Math.random()*6)+1;
		int r2=(int)(Math.random()*6)+1;
		int b=random.add(r1, r2);
		System.out.println("[����2.������]");
		System.out.println("ù��° �ֻ��� ��:"+r1);
		System.out.println("ù��° �ֻ��� ��:"+r2);
		System.out.println("���� "+b+"�̴�.");
		System.out.println("===============================");


/*
 * [����3]
�ʸ� �Է¹޾Ƽ� time()���� ��,��,�ʸ� ���Ͽ� ����Ѵ�		
 */		
		MethodPractice time=new MethodPractice();
		System.out.println("[����3.������]");
		System.out.print("�ʸ� �Է��Ͻÿ� : ");
		int sec = Integer.parseInt(br.readLine());
		String result = time.time(sec);
		System.out.println(result+"�Դϴ�");
	}

	public int add(int r1, int r2) {
		return r1+r2;
	}
	
	public String time(int sec) {
		int min=sec/60;
		int hour = min/60;
		 sec = sec%60;
		 min =min%60;
		return (hour+"��"+min+"��"+sec+"��");
	}
	
}
