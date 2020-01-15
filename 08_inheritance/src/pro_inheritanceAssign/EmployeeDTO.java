package pro_inheritanceAssign;

public class EmployeeDTO {
	private String name;
	private String position;
	private int basePay;
	private int benefit;
	private double taxRate;
	private int tax;
	private int salary;
	

	public EmployeeDTO(String name, String position, int basePay, int benefit) {
		this.name=name;
		this.position=position;
		this.basePay=basePay;
		this.benefit=benefit;

	}
	
	// 개수를 자유롭게 구현
	public void calc() { // 배열화작업
		int total = basePay+benefit;
		if(total <=2000000 ) {taxRate =0.01;}
		else if(total<=4000000) {taxRate=0.02;}
		else if(total>4000000) {taxRate=0.03;}
		
		tax = (int)(total*taxRate);
		salary=total-tax;
		
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getBasePay() {
		return basePay;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}

	public int getBenefit() {
		return benefit;
	}

	public void setBenefit(int benefit) {
		this.benefit = benefit;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public int getTax() {
		return tax;
	}
	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return name+"\t"+
				position+"\t"+
				basePay+"\t"+
				benefit+"\t"+
				taxRate+"\t"+
				salary;
				
	}

}
