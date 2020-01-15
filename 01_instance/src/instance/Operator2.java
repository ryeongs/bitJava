package instance;

public class Operator2 {

	public static void main(String[] args) {
		int num=50;
		double num2= 178.5;
		char cha='A';
		boolean result=true;
		String name="홍길동";
		System.out.println("Q1.-----------------");
		System.out.println(num+"\t"+num2+"\t"+cha+"\t"+result+"\t"+name);

		//Q2 삼각형의 넓이
		int base=5;
		int height=7;
		double area = (base*height)/2.0; 
		System.out.println("Q2.-----------------");
		System.out.println("밑변="+base);
		System.out.println("높이="+height);
		System.out.println("넓이="+String.format("%.2f",area));
		
		//Q3. 이름이 L(name)인 사람의 기본급(basePay)이 2500000일때 3.3% 세금(tax)과 월급(salary)을 계산하시오. 데이터는 반드시 변수에 저장하기.
		String name2 = "L";
		int basePay=2500000;
		double tax=basePay*0.033;
		double salary=basePay-tax;
		System.out.println("Q3.-----------------");
		System.out.println("***L의 월급***");
		System.out.println("기본급:"+basePay+"원");
		System.out.println("세금:"+tax+"원");
		System.out.println("월급:"+salary+"원");
		
		//Q4. 이름(name) 홍길동이고 국어점수(kor) 90 영어점수(eng) 85 수학점수(math) 100점 일때 총점(tot)과 평균(avg)을 구하시오 단 평균은 소수이하 2째자리까지 표시하시오
		int kor=90;
		int eng=85;
		int math=100;
		int tot=kor+eng+math;
		double avg=tot/3;
		String name3="홍길동";
		System.out.println("Q4.-----------------");
		System.out.println("이름\t"+"국어\t"+"영어\t"+"수학\t"+"총점\t"+"평균");
		System.out.println(name3+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+String.format("%.2f", avg));

		//Q5.
		int score=25;
		int score2=12;
		System.out.println("Q5.-----------------");
		if(score/5==5) System.out.println("25는 2와 3의 공배수가 아니다 ");
		if(score2%2==0 && score2%3==0) System.out.println("12는 2와 3의 공배수이다");
		
		//Q6.
		char ch = 'T';
		System.out.println("Q6.-----------------");
		if (ch == 'T') System.out.println("T -> t");
		else if(ch=='e') System.out.println("e -> E");
		
		//Q7.
		char gender='F';
		System.out.println("Q7.-----------------");
		if (name == "홍길동"&& gender=='F') System.out.println(name+"은 여자이다");
		else if(name == "홍길동"&& gender=='M') System.out.println(name+"은 남자이다");
	}

}
