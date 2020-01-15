package pro_AbstractAssign;


import java.text.NumberFormat;
import java.util.Locale;

public class JapanMoney extends Money{
	
	private int money;
	private double jm;
	
	public JapanMoney(int money) {
		this.money = money;
	}
	
	@Override
	public void calcMoney() {
		jm = money/10.64;
	}
	
	public void dispMoney() {
		NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance();
		numberFormat1.setMaximumFractionDigits(2);
		NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		numberFormat2.setMaximumFractionDigits(2);
		System.out.print(numberFormat1.format(money));
		System.out.print(" -> ");
		System.out.println(numberFormat2.format(jm));
	}

}
