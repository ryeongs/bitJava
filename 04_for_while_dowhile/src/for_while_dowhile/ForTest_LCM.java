package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest_LCM {

	public static void main(String[] args) throws  IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int num,count=0,result=0;
		
		for(int i=1;i<=100;i++) {
			num=(int)((Math.random()*500)+1);
			if(num%2==0 && num%3==0) { 
				System.out.print(String.format("%5d", num));
				count++; 
				result+=num;
				if(count%7==0) System.out.println();
			}	
		}//for
		System.out.println();
		System.out.println("2��3�ǰ��������:"+count);
		System.out.println("2��3�� ����� ��:"+result);
	}
}
		


	
/*1-500������ ������100�� �߻��Ͽ� 2��3�� ������� ����ϰ� �հ� ������ ����Ͻÿ�
 * �� 1�ֿ� 7���� ���
 * [������]
 * 36 12 ...
 * 
 * 2�� 3�� ����� ����=
 * 2�� 3�� ����� ��=
 */
