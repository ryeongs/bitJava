package abstract_1;

import java.text.NumberFormat;
import java.util.Locale;

public class JapanMoney extends Money{
	public void money(double m) {
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.JAPAN);// ĳ�� ǥ��
		nf5.setMaximumFractionDigits(2); //
		nf5.setMinimumFractionDigits(2);
		System.out.println(nf5.format(m));
		
		//		System.out.println();
	}
}
