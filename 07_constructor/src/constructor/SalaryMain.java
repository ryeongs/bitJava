package constructor;

import java.text.DecimalFormat;

public class SalaryMain {

	public static void main(String[] args) {
		DecimalFormat df=new DecimalFormat("#,####");
	//	SalaryDTO dto=new SalaryDTO("ȫ�浿","����",5000000,200000);
		
		//3���� ���� �� ����
//		
//		SalaryDTO ar[]=new SalaryDTO[3];
//		ar[0] = new SalaryDTO("ȫ�浿","����",5000000,200000);
//		ar[1] = new SalaryDTO("���缮","����",3500000,150000);
//		ar[2] = new SalaryDTO("�ڸ��","����",1800000,100000);
		
		SalaryDTO ar[]= {
				new SalaryDTO ("ȫ�浿","����",5000000,200000),
				new SalaryDTO("���缮","����",3500000,150000),
				new SalaryDTO("�ڸ��","����",1800000,100000)};
		
		System.out.println("name\tposition\tbasePay\tbenefit\ttaxRate\ttax\tsalary");

		for(SalaryDTO dto :ar ) {
			dto.calc();
			System.out.println(dto.getName()
						+"\t"+dto.getPosition()
						+"\t"+dto.getBasePay()
						+"\t"+dto.getBenefit()
						+"\t"+dto.getTaxRate()
						+"\t"+dto.getTax()
						+"\t"+df.format(dto.getSalary()));
		}
			
				
//		SalaryDTO ar2[]= new SalaryDTO[] {
//				new SalaryDTO ("ȫ�浿","����",5000000,200000),
//				new SalaryDTO("���缮","����",3500000,150000),
//				new SalaryDTO("�ڸ��","����",1800000,100000)};
//		

	}

}
