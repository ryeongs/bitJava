package pro_AbstractAssign;

import java.util.Scanner;

public class MoneyMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int money;

		System.out.print("���� �Է� : ");
		money = scan.nextInt();
		while (true) {
			System.out.print("1. �޷� 2. ��ȭ 3. ���� : ");
			int num = scan.nextInt();

			if (num == 1) {
				USMoney um = new USMoney(money);
				um.calcMoney();
				um.dispMoney();
				break;
			} else if (num == 2) {
				JapanMoney jm = new JapanMoney(money);
				jm.calcMoney();
				jm.dispMoney();
				break;
			} else if (num == 3) {
				ChinaMoney cm = new ChinaMoney(money);
				cm.calcMoney();
				cm.dispMoney();
				break;
			} else {
				System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
}
