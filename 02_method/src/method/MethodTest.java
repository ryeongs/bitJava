package method;

public class MethodTest {

	public static void main(String[] args) {
		int big = Math.max(25,36);
		System.out.println("big one:"+big);
		
		int small =Math.min(25, 36);
		System.out.println("small one:"+small);
		
		double pow = Math.pow(2,5);
		System.out.println("2��5��:"+pow);
		
		//���� - ��ǻ�Ͱ� �ұ�Ģ�ϰ� �߻��ϴ� ��, 0.0<=����<1.0 
		
		//double a=Math.random()*100+1; //1~100
		double a=Math.random()*26+65; //65~90
		System.out.println((int)a);
		System.out.println('2'+'5');
		System.out.println(Integer.parseInt("2")+Double.parseDouble("5.7"));
	}
	
}
