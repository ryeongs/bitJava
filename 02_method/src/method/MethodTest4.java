package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest4 {

	public static void main(String[] args) throws IOException {
		/*
		 * �̸�(name),�ֹι�ȣ(id)�� �Է��Ͽ� ������ ���
		 * -����(gender)�� �����ϴ� comp()�޼ҵ�, ����(age)�� ����ϴ� calcAge() �޼ҵ�
		 * [���]
		 * -�̸� �Է�:
		 * -�ֹι�ȣ �Է�:
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MethodTest4 test4=new MethodTest4();
		
		System.out.print("�̸� �Է�:");
		String name=br.readLine();
		System.out.print("�ֹι�ȣ �Է�:");
		String id=br.readLine();
		
		String gender = test4.comp(id.charAt(7));
		
		int j = test4.calcAge(id.substring(0,2),id.charAt(7));
	
		System.out.println("[���]");
		
		System.out.println("�̸�:"+name);
		System.out.println("�ֹι�ȣ:"+id);
		System.out.println("����:"+j);
		System.out.println("����:"+gender);
	}
	public int calcAge(String age, char c) {
		int result = 0;
		if(c=='3'|| c=='4') {
			result= 2019-(Integer.parseInt(age)+2000)+1;
		}else if(c=='1'||c=='2'){
			result= 2019-(Integer.parseInt(age)+1900)+1;
		}
		/*
		 * int year = Integer.parseInt(id.substring(0,2));
		 * char g=  id.charAt(7);
		 * year+=(g=='1'|| g=='2' ?1900:2000);
		 * int age = 2019-year+1;
		 * return age;
		 */
		return result;
	}
	public String comp(char c) {
		String ForM = null;
		if  (c=='1'||c=='3') return ForM="����";
		else if (c=='2'||c=='4') return ForM="����";
		
		return ForM;
	}

}
