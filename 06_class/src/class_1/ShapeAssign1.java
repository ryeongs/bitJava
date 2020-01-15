package class_1;

public class ShapeAssign1 {
	private int w,h,l,r;
	private double pi=3.141592;
	private double areaOne, areaT,areaNemo;
	
	public int getW() {
		return w;
	}
	public int getH() {
		return h;
	}
	public int getL() {
		return l;
	}
	public int getR() {
		return r;
	}
	public double getAreaOne() {
		return areaOne;
	}
	public double getAreaT() {
		return areaT;
	}
	public double getAreaNemo() {
		return areaNemo;
	}
	
	public void setW(int w) {
		this.w=w;
	}
	public void setH(int h) {
		this.h=h;
	}
	public void setL(int l) {
		this.l=l;
	}
	public void setR(int r) {
		this.r=r;
	}
	
	public void area(int r) {
		this.areaOne=pi*r*r;
	}
	public void area(int w, int h) {
		this.areaT=(w*h)/2.0;
	}
	public void area(int w, int l, int h) {
		this.areaNemo=(double)(w+l)*h/2;
	}

	
}
