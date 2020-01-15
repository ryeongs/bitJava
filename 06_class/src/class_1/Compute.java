package class_1;

public class Compute {
	private int x,y,sum,sub,mul;
	private double div;
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getSum() {
		return sum;
	}
	public int getSub() {
		return sub;
	}
	public int getMul() {
		return mul;
	}
	public double getDiv() {
		return div;
	}
	
	//=======================
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	//=======================
	
	public void calc() {
		this.sum=x+y;
		this.sub=x-y;
		this.mul=x*y;
		this.div=(double)x/y;
	}

}
