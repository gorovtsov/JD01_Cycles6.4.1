/*
 * 6.4.1.3. 
 */
package hw.gorovtsov.cyclestesting.tasks;

public class Amoeba {

	public static void main(String[] args) {
		int amCount = 1;
		int hours = 0;

		while (hours < 25) {
			System.out.println("������ " + hours + " �����. ���� ������ " + amCount);
			amCount = amCount * 2;
			hours = hours + 3;
		}

	}

}
