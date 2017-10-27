/*
 * 6.4.1.6. kufas.ru
 */
package hw.gorovtsov.cyclestesting.tasks;

public class Scot {

	public static void main(String[] args) {
		int sum = 100;

		for (double bulls = 0; bulls < 10; bulls++) {
			for (double cows = 0; cows < 20; cows++) {
				for (double tel = 0; tel < 200; tel++) {
					if ((bulls * 10 + cows * 5 + tel * 0.5 == sum) || (bulls + cows + tel == sum)) {
						System.out.println("����� - " + cows + ", ����� - " + bulls + ", ����� - " + tel);
					}
				}
			}
		}

	}

}
