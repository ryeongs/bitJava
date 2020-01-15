package abstract_1;

import java.util.Scanner;

public class MoneyMain extends Money{
	Scanner sc =new Scanner(System.in);
	JapanMoney jm= new JapanMoney();
	ChinaMoney cm=new ChinaMoney();
	USMoney um=new USMoney();
	int cash;
	double us = 1159.00;
	double ch = 166.50;
	double jp = 1065.21;
	
	public static void main(String[] args) {
		MoneyMain mm=new MoneyMain();
		mm.dispMoney();
	}
	
	public void dispMoney() {
		MoneyMain mm= new MoneyMain();
		System.out.print("현금 입력: " );
		cash = sc.nextInt();
		System.out.print("1.달러 2.엔화 3.위안  : ");
		int num = sc.nextInt();
		mm.calcMoney(num);
		if(num==1){
			System.out.print(cash +" -> "); 
			um.money(cash/us);
		}
		else if(num==2) {
			System.out.print(cash +" -> "); 
			jm.money(cash/jp);
		}
		else if(num==3) {
			System.out.print(cash +" -> "); 
			cm.money(cash/ch);
		}
	}
	public void calcMoney(int num) {

	}
	public void money(double a) {
	}
	

}
