package class_1;

public class SungjukMain2 {

	public static void main(String[] args) {
		Sungjuk[] ar=new Sungjuk[3]; //��ü�迭
		ar[0]=new Sungjuk();
		ar[1]=new Sungjuk();
		ar[2]=new Sungjuk();
		
		ar[0].setName("ȫ�浿");
		ar[0].setKor(90);
		ar[0].setEng(91);
		ar[0].setMath(100);
		
		ar[1].setName("��ġ");
		ar[1].setKor(85);
		ar[1].setEng(98);
		ar[1].setMath(82);
		
		ar[2].setName("�ڳ�");
		ar[2].setKor(75);
		ar[2].setEng(98);
		ar[2].setMath(86);
	
		for(Sungjuk data : ar) { //the way how to show the array data1
			data.calc();
			System.out.println("name "+data.getName()
			+"\n����:"+data.getKor()
			+"\t����: "+data.getEng()
			+"\t����: "+data.getMath()
			+"\ttot:"+data.getTot()
			+"\tavg: "+data.getAvg()
			+"grade: "+data.getGrade());
		}
		for(int i=0;i<ar.length;i++) {//the way how to show the array data2
			ar[i].calc();
			System.out.println("name "+ar[i].getName()
			+"\n����:"+ar[i].getKor()
			+"\t����: "+ar[i].getEng()
			+"\t����: "+ar[i].getMath()
			+"\ttot:"+ar[i].getTot()
			+"\tavg: "+ar[i].getAvg()
			+"grade: "+ar[i].getGrade());
		}
	}

}
