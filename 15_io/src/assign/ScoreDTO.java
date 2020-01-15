package assign;

import java.io.Serializable;

public class ScoreDTO implements Serializable{

	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	public ScoreDTO(String hak, String name, int kor, int eng, int math) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	public ScoreDTO(String hak, String name, int kor, int eng, int math, int tot, double avg) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = tot;
		this.avg = avg;
	}


	public String getHak() {
		return hak;
	}
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
	public int getTot() {
		tot = kor+eng+math;
		return tot;
	}
	public double getAvg() {
		avg = (kor+eng+math)/3.0;
		return avg;
	}
	
}
