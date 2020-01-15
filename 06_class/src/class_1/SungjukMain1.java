package class_1;

public class SungjukMain1 {

	public static void main(String[] args) {
		Sungjuk aa=new Sungjuk();
		aa.setName("홍길동");
		aa.setKor(90);
		aa.setEng(91);
		aa.setMath(100);
		
		aa.calc(); //총점,평균계산
	
		System.out.println("name "+aa.getName()
		+"\n국어:"+aa.getKor()
		+" 영어: "+aa.getEng()
		+"수학: "+aa.getMath()
		+"tot:"+aa.getTot()
		+"avg: "+aa.getAvg()
		+"grade: "+aa.getGrade());
		System.out.println("평균="+String.format("%.2f",aa.getAvg()));
		//------------------------------------
		Sungjuk bb=new Sungjuk();
		bb.setName("또치");
		bb.setKor(70);
		bb.setEng(70);
		bb.setMath(70);
		bb.calc();
		
		System.out.println("name "+aa.getName()
		+"\n국어:"+bb.getKor()
		+"\t영어: "+bb.getEng()
		+"\t수학: "+bb.getMath()
		+"\ttot:"+bb.getTot()
		+"\tavg: "+bb.getAvg()
		+"grade: "+bb.getGrade());
	
		System.out.println("평균="+String.format("%.2f",bb.getAvg()));
		//------------------------------------
		Sungjuk cc=new Sungjuk();
		cc.setName("코난");
		cc.setKor(80);
		cc.setEng(80);
		cc.setMath(85);
		cc.calc();
		
		System.out.println("name "+cc.getName()
		+"\n국어:"+cc.getKor()
		+"\t영어: "+cc.getEng()
		+"\t수학: "+cc.getMath()
		+"\ttot:"+cc.getTot()
		+"\tavg: "+cc.getAvg()
		+"grade: "+cc.getGrade());
		System.out.println("평균="+String.format("%.2f",cc.getAvg()));
	}

}
