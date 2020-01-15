package Pro_ClassAssign;

public class FruitAssign2 {
	private String pum;
	private int jan, feb, mar, tot;
	private static int sumJan;//공유 변수 
	private static int sumFeb;
	private static int sumMar;

	public FruitAssign2(String pum, int jan, int feb, int mar) {
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
	}
	public void calcTot() {
		tot=jan+feb+mar;
		
		sumJan+=jan;
		sumFeb+=feb;
		sumMar+=mar;
		
	}
	public void disp() {
		System.out.println(pum + "\t" +jan +"\t"+ feb + "\t" + mar + "\t" + (jan+mar+feb) + "\t");
	}
	
	public static void output() {
		System.out.println("\t"+sumJan+"\t"+sumFeb+"\t"+sumMar);

	}
}
