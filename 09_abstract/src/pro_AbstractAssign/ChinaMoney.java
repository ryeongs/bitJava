package pro_AbstractAssign;

import java.text.NumberFormat;
import java.util.Locale;

public class ChinaMoney extends Money {

	private int money;
	private double cm;

	public ChinaMoney(int money) {
		this.money = money;
	}

	@Override
	public void calcMoney() {
		cm = money/166.36;
	}

	public void dispMoney() {
		
		NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance();
		numberFormat1.setMaximumFractionDigits(2);
		NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
		numberFormat2.setMaximumFractionDigits(2);
		
		System.out.print(numberFormat1.format(money));
		System.out.print(" -> ");
		System.out.println(numberFormat2.format(cm));
	}

}
