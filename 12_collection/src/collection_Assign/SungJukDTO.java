package collection_Assign;

import java.text.DecimalFormat;

public class SungJukDTO implements Comparable<SungJukDTO>{ //SungJukDTO(나를)기준으로 비교
	private String name;
	private int num;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	public SungJukDTO() {
		
	}
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



//1. 번호, 이름, 국어, 영어, 수학점수를 입력하여 총점과 평균을 구하시오
	public SungJukDTO(int num, String name, int kor, int eng, int math) {
		this.name=name;
		this.num=num;
		this.kor=kor;
		this.eng=eng;
		this.math=math;

	}
	// 개수를 자유롭게 구현
	public void calc() { // 배열화작업
		total = kor+eng+math;
		avg =(double)total/3;
	}
	
	@Override
	public String toString() {
		return num+"\t"+
				name+"\t"+
				kor+"\t"+
				eng+"\t"+
				math+"\t"+
				total+"\t"+
				new DecimalFormat("#.##").format(avg);
	}
	

	@Override
	public int compareTo(SungJukDTO dto) {
		
		//return name.compareTo(dto.getName()); 방법1 
//		if(total < dto.total) return 1;   		방법2
//		else if(total == dto.total) return 0;
//		else if(total > dto.total) return -1;
		
		return total > dto.total ? -1 : 1; //방법 3
	
	}

}
