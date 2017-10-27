/*
 * Около стены наклонно стоит палка длиной х м. 
 * Один ее конец находится на расстоянии у м от стены. 
 * Определить значение угла а между палкой и полом для значений х = k м и у, 
 * изменяющегося от 2 до 3 м с шагом h м.
 */

package topic4.section1.task04;

public class Task04 {

	public static void main(String[] args) {
		double x = 6;
		double y = 2;
		double h = 0.2;
		double a;
		
		int itCount = (int)((3 - 2) / h);

		for (int i = 0; i <= itCount; i++) {
			a = Math.toDegrees(Math.acos(y/x));
			System.out.println("При x=" + x + " и y=" + y + " угол a равен " + a);
			y = y + h;
		}

	}

}
