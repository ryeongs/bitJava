package class_1;

public class Sungjuk {
	private String name;
	private int kor,eng,math,tot;
	private double avg;
	private char grade;
	
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public double getAvg() {
		return avg;
	}
	public int getTot() {
		return tot;
	}
	public char getGrade() {
		return grade;
	}
	//set-----------------------------------------
	public void setName(String n) {
		name = n;
	}
	public void setKor(int k) {
		kor=k;
	}
	public void setEng(int e) {
		eng=e;
	}
	public void setMath(int m) {
		math=m;
	}
	

	public void calc() {
		this.tot=(kor+eng+math);
		this.avg=(kor+eng+math)/3;
		if(avg>=90) {grade='A';}
		else if(avg>=80) {grade='B';}
		else if(avg>=70) {grade='C';}
		else if(avg>=60) {grade='D';}// TODO Auto-generated method stub
	}

}


