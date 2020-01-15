package pro_AbstractAssign;

import java.text.NumberFormat;
import java.util.Locale;

public class USMoney extends Money {

	private int money;
	private double um;

	public USMoney(int money) {
		this.money = money;
	}

	@Override
	public void calcMoney() {
		um = money/1157.5;
	}

	public void dispMoney() {
		
		NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance();
		numberFormat1.setMaximumFractionDigits(2);
		NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.US);
		numberFormat2.setMaximumFractionDigits(2);
		System.out.print(numberFormat1.format(money));
		System.out.print(" -> ");
		System.out.println(numberFormat2.format(um));

	}

}
