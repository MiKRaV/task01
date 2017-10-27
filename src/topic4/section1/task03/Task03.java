/*
 * ќдноклеточна€ амеба каждые 3 часа делитс€ на 2 клетки. 
 * ќпределить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */

package topic4.section1.task03;

public class Task03 {

	public static void main(String[] args) {
		int countAm = 1;
		System.out.println("Ќачальное количество амеб " + countAm);

		for (int i = 3; i <= 24; i=i+3) {
			countAm *= 2;
			System.out.println(" оличество амеб через " + i + " час(а/ов): " + countAm);
		}

	}

}
