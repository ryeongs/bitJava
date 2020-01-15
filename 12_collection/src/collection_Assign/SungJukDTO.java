package collection_Assign;

import java.text.DecimalFormat;

public class SungJukDTO implements Comparable<SungJukDTO>{ //SungJukDTO(����)�������� ��
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



//1. ��ȣ, �̸�, ����, ����, ���������� �Է��Ͽ� ������ ����� ���Ͻÿ�
	public SungJukDTO(int num, String name, int kor, int eng, int math) {
		this.name=name;
		this.num=num;
		this.kor=kor;
		this.eng=eng;
		this.math=math;

	}
	// ������ �����Ӱ� ����
	public void calc() { // �迭ȭ�۾�
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
		
		//return name.compareTo(dto.getName()); ���1 
//		if(total < dto.total) return 1;   		���2
//		else if(total == dto.total) return 0;
//		else if(total > dto.total) return -1;
		
		return total > dto.total ? -1 : 1; //��� 3
	
	}

}
