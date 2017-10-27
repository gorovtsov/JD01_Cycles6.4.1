/*
 * 6.4.1.11
 */
package hw.gorovtsov.cyclestesting.tasks;

public class SimpleNums {

	public static void main(String[] args) {
		int result = 0;

		for (int x = 0; x < 37; x++) {
			result = getRandomSimpleNum(x);
			if (isSimple(result)) {
				System.out.println(result + " - Простое число");
			}
		}
	}

	static boolean isSimple(int num) {

		boolean rez = true;

		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				rez = false;
			}
		}

		return rez;
	}

	static int getRandomSimpleNum(int x) {
		int num = (int)((Math.pow(2 * x + 1, 2) + 1) / 3);
		return num;
	}
}
