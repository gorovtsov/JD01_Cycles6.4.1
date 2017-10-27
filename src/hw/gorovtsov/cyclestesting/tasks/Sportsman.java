/*
 * 6.4.1.2. 
 */
package hw.gorovtsov.cyclestesting.tasks;

public class Sportsman {

	public static void main(String[] args) {
		double canRun = 10.0;
		double runned = 0.0;

		for (int i = 1; i < 8; i++) {
			runned = runned + canRun;
			canRun = canRun * 1.1;
			System.out.println("�� " + i + " ���� ���������� " + runned + " ��");
			System.out.println("��������� ����� ��������� " + canRun + " ��");
		}

	}

}
