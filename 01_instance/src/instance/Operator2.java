package instance;

public class Operator2 {

	public static void main(String[] args) {
		int num=50;
		double num2= 178.5;
		char cha='A';
		boolean result=true;
		String name="ȫ�浿";
		System.out.println("Q1.-----------------");
		System.out.println(num+"\t"+num2+"\t"+cha+"\t"+result+"\t"+name);

		//Q2 �ﰢ���� ����
		int base=5;
		int height=7;
		double area = (base*height)/2.0; 
		System.out.println("Q2.-----------------");
		System.out.println("�غ�="+base);
		System.out.println("����="+height);
		System.out.println("����="+String.format("%.2f",area));
		
		//Q3. �̸��� L(name)�� ����� �⺻��(basePay)�� 2500000�϶� 3.3% ����(tax)�� ����(salary)�� ����Ͻÿ�. �����ʹ� �ݵ�� ������ �����ϱ�.
		String name2 = "L";
		int basePay=2500000;
		double tax=basePay*0.033;
		double salary=basePay-tax;
		System.out.println("Q3.-----------------");
		System.out.println("***L�� ����***");
		System.out.println("�⺻��:"+basePay+"��");
		System.out.println("����:"+tax+"��");
		System.out.println("����:"+salary+"��");
		
		//Q4. �̸�(name) ȫ�浿�̰� ��������(kor) 90 ��������(eng) 85 ��������(math) 100�� �϶� ����(tot)�� ���(avg)�� ���Ͻÿ� �� ����� �Ҽ����� 2°�ڸ����� ǥ���Ͻÿ�
		int kor=90;
		int eng=85;
		int math=100;
		int tot=kor+eng+math;
		double avg=tot/3;
		String name3="ȫ�浿";
		System.out.println("Q4.-----------------");
		System.out.println("�̸�\t"+"����\t"+"����\t"+"����\t"+"����\t"+"���");
		System.out.println(name3+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+String.format("%.2f", avg));

		//Q5.
		int score=25;
		int score2=12;
		System.out.println("Q5.-----------------");
		if(score/5==5) System.out.println("25�� 2�� 3�� ������� �ƴϴ� ");
		if(score2%2==0 && score2%3==0) System.out.println("12�� 2�� 3�� ������̴�");
		
		//Q6.
		char ch = 'T';
		System.out.println("Q6.-----------------");
		if (ch == 'T') System.out.println("T -> t");
		else if(ch=='e') System.out.println("e -> E");
		
		//Q7.
		char gender='F';
		System.out.println("Q7.-----------------");
		if (name == "ȫ�浿"&& gender=='F') System.out.println(name+"�� �����̴�");
		else if(name == "ȫ�浿"&& gender=='M') System.out.println(name+"�� �����̴�");
	}

}
