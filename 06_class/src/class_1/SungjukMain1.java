package class_1;

public class SungjukMain1 {

	public static void main(String[] args) {
		Sungjuk aa=new Sungjuk();
		aa.setName("ȫ�浿");
		aa.setKor(90);
		aa.setEng(91);
		aa.setMath(100);
		
		aa.calc(); //����,��հ��
	
		System.out.println("name "+aa.getName()
		+"\n����:"+aa.getKor()
		+" ����: "+aa.getEng()
		+"����: "+aa.getMath()
		+"tot:"+aa.getTot()
		+"avg: "+aa.getAvg()
		+"grade: "+aa.getGrade());
		System.out.println("���="+String.format("%.2f",aa.getAvg()));
		//------------------------------------
		Sungjuk bb=new Sungjuk();
		bb.setName("��ġ");
		bb.setKor(70);
		bb.setEng(70);
		bb.setMath(70);
		bb.calc();
		
		System.out.println("name "+aa.getName()
		+"\n����:"+bb.getKor()
		+"\t����: "+bb.getEng()
		+"\t����: "+bb.getMath()
		+"\ttot:"+bb.getTot()
		+"\tavg: "+bb.getAvg()
		+"grade: "+bb.getGrade());
	
		System.out.println("���="+String.format("%.2f",bb.getAvg()));
		//------------------------------------
		Sungjuk cc=new Sungjuk();
		cc.setName("�ڳ�");
		cc.setKor(80);
		cc.setEng(80);
		cc.setMath(85);
		cc.calc();
		
		System.out.println("name "+cc.getName()
		+"\n����:"+cc.getKor()
		+"\t����: "+cc.getEng()
		+"\t����: "+cc.getMath()
		+"\ttot:"+cc.getTot()
		+"\tavg: "+cc.getAvg()
		+"grade: "+cc.getGrade());
		System.out.println("���="+String.format("%.2f",cc.getAvg()));
	}

}
