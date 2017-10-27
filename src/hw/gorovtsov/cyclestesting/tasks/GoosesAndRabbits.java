/*
 * 6.4.1.5 
 */
package hw.gorovtsov.cyclestesting.tasks;

public class GoosesAndRabbits {
	public static void main(String[] args) {
		int gooseNum = 0;
		int rabbitNum = 0;

		for (int i = 64; i != 0; i = i - 4) {
			gooseNum = i / 4;
			rabbitNum = (64 - i) / 2;
			System.out.print("����� - " + gooseNum);
			System.out.println(", �������� - " + rabbitNum);
		}
	}
}
